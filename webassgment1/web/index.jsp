<% Object message = new Object(); %><%--
  Created by IntelliJ IDEA.
  User: TAWAKAL SHAMS
  Date: 7/13/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="HandleGuess" methods="post">
    <input type="text" name="guessnumber" size=8>
    <%=message %>
    < input type = "submit" value = "submit" >
  </form>
  <form action="getNumber.jsp" method="post">
    < input type = "submit" value = "get new random number again" >
  </form>

  [% session. SetAttribute ("message", "please guess");
  // HttpSession session =request.getSession(true);
  Int randomnumber = (int) (math. Random() * 100) + 1; // get a random number
  session.setAttribute("saveNumber",new Integer(randomNumber));
  %>
  <p>Visit or refresh this page to randomly drop a number between 1 and 100
    <br>Click the link below to go to guess the number
    < a href = "inputnumber. JSP" rel = "external nofollow" > guess the number</a>

  </body>
</html>
