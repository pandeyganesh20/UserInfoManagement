package com.user.userinfomanagment.Service;

import com.user.userinfomanagment.model.Role;
import com.user.userinfomanagment.model.User;
import com.user.userinfomanagment.repository.RoleRepository;
import com.user.userinfomanagment.repository.UserRepository;
import com.user.userinfomanagment.util.PasswordUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public void saveUser(User user) {
        String password = PasswordUtil.encodePassword(user.getPassword());
        user.setPassword(password);
        Role role = roleRepository.findById(user.getRoleId()).get();
        user.setRole(role);
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        // String password = PasswordUtil.encodePassword(user.getPassword());
        //  user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
}