<%--
  Created by IntelliJ IDEA.
  User: Hilda
  Date: 10/15/2017
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        input, select {
            width: 20%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid grey;
            border-radius: 4px;
            box-sizing: border-box;
            display: block;
        }
        #edit{
            margin-left: 30%;
        }
        input[type=submit], button {
            width: 20%;
            background-color: #D5DBDB;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            margin-top: 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 15px;
            color: black;
            display: block;
        }

        input[type=submit]:hover {
            background-color: #EAEDED;

        }
        button:hover {
            background-color: #EAEDED;
        }
        a {
            text-decoration: none;
            color: black;
            font-size: 15px;
        }
        button{
            margin-left: 30%;
            width: 35%;
        }

    </style>
</head>
<body>
<form action="LoginServlet" method="post">
    Username
    <input type="text" name="username" >
    Password
    <input type="text" name="password">
    <input type="submit" value="Submit">
</form>
</body>
</html>
