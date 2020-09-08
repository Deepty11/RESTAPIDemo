<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rehnuma
  Date: 9/8/20
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>API</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div>
            <table class="table table-bordered">
                <thead>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Title</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>City</th>
                    <th>State</th>
                    <th>PostCode</th>
                </thead>
                <tbody>
                    <c:forEach var="person" items="${personList.results}">
                            <tr>
                                <td>${person.name.first}</td>
                                <td>${person.name.last}</td>
                                <td>${person.name.title}</td>
                                <td>${person.gender}</td>
                                <td>${person.email}</td>
                                <td>${person.location.city}</td>
                                <td>${person.location.state}</td>
                                <td>${person.location.postcode}</td>
                            </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>
    </body>
</html>
