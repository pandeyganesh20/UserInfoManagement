package com.user.userinfomanagment.repository;

import com.user.userinfomanagment.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
