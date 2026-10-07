<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
    <h1>Campus Student Management</h1>
    <h2>Update Student</h2>

    <form method="post" action="students">
        <input type="hidden" name="action" value="update">
        <input type="<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>

<h1>Edit Student</h1>

<form action="${pageContext.request.contextPath}/students" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="${student.id}">

    <label>ID:</label>
    <span>${student.id}</span>
    <br><br>

    <label>Name:</label>
    <input type="text" name="name" value="${student.name}" required>
    <br><br>

    <label>Age:</label>
    <input type="number" name="age" value="${student.age}" required>
    <br><br>

    <label>Department:</label>
    <select name="departmentId" required>
        <c:forEach var="department" items="${departments}">
            <option value="${department.id}" ${student.department != null && department.id == student.department.id ? 'selected' : ''}>
                ${department.name}
            </option>
        </c:forEach>
    </select>
    <br><br>

    <button type="submit">Update Student</button>
</form>

<br>
<a href="${pageContext.request.contextPath}/students">Back to Students</a>

</body>
</html>hidden" name="id" value="${student.id}">

        <label>ID:</label>
        <span>${student.id}</span>
        <br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${student.name}" required>
        <br><br>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" value="${student.department}" required>
        <br><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${student.age}" required>
        <br><br>

        <button type="submit">Update Student</button>
    </form>

    <br>
    <a href="students">Back to Student List</a>
</body>
</html>