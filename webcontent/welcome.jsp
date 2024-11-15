<%@ page import="com.jamkrindo.Mahasiswa" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Department</th>
        <th>Student ID</th>
        <th>Marks</th>
        <th>Pass %</th>
    </tr>
    </thead>
    <tbody>
    <%-- Iterate through the mahasiswaList using a loop --%>
    <% for (Mahasiswa mahasiswa : (List<Mahasiswa>) request.getAttribute("mahasiswaList")) { %>
    <tr>
        <td><%= mahasiswa.getDepartment() %></td>
        <td><%= mahasiswa.getMahasiswaID() %></td>
        <td><%= mahasiswa.getMarks() %></td>
        <td><%= mahasiswa.getPersentage() + "%" %></td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>