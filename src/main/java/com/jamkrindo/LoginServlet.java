package com.jamkrindo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validasi username dan password (hardcoded)
        if (username.equals("admin") && password.equals("password")) {
            // Redirect ke halaman welcome
            response.sendRedirect("welcome.jsp");
        } else {
            // Redirect kembali ke halaman login dengan pesan error (bisa menggunakan request.setAttribute)
        }
    }
}