<%--
  Created by IntelliJ IDEA.
  User: YUSSUFSHAMS
  Date: 7/16/2020
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Test1 </title>
  </head>
  <body>
      <form action="Servlet" method="POST">
          <label>Name</label><input type="text" name="name" ><br>
        <label>Regstration Number</label><input type="text" name="reg" ><br>
        <label>Grade</label><input type="text" name="grade"><br>
        <label>Phone Number</label><input type="text" name="phone"><br>
        <label>Email</label><input type="email" name="email"><br>
        <label>Gender</label><br>
        <label>Male</label><input type="radio" name="gender" value="male">
        <label>Female</label><input type="radio" name="gender" value="female"><BR>
        <label>Regstartion Status</label><br>
        <label>First Year</label><input type="radio" name="status"> <label>Second Year</label><input type="radio" name="status">
        <label>Third Year</label><input type="radio" name="status"><br>
        <input type="submit" name="submit" value="Save Records">
      </form>
  </body>
</html>
