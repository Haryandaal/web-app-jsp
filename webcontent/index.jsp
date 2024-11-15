<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#loginForm").submit(function(event) {
                event.preventDefault();
                var username = $("#username").val();
                var password = $("#password").val();


                if (username === "" || password === "") {
                    alert("Username dan password harus diisi");
                } else if (username !== "admin" || password !== "password") {
                    alert("Username atau password salah");
                } else {
                    // Submit form jika validasi berhasil
                    this.submit();
                }
            });
        });
    </script>
</head>
<body>
</body>
</html>