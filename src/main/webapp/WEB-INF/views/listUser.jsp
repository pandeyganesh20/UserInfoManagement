<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <%@ include file="header.jsp"%>
</head>
<body>
<div>
    <div>
        <a href="add_user">Add User</a>
    </div>
    <c:if test="${!empty users}">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Username</th>
                <th>Gender</th>
                <th>DOB</th>
                <th>Mobile No</th>
                <th>Email</th>
                <th>Hobbies</th>
                <th>Nationality</th>
                <th>Comments</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="u">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.username}</td>
                    <td>${u.gender}</td>
                    <td>${u.dob}</td>
                    <td>${u.mobileNo}</td>
                    <td>${u.email}</td>
                    <td>${u.hobbies}</td>
                    <td>${u.nationality}</td>
                    <td>${u.comments}</td>
                    <td>
                        <a href="edit_user?id=${u.id}" class="btn btn-primary">Edit</a>|
                        <a href="delete_user?id=${u.id}" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>
</body>
</html>