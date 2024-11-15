package com.jamkrindo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// ... (import lainnya)

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Buat list mahasiswa (hardcoded)
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("S1", "Haryanda", "Dep 1", 35));
        mahasiswaList.add(new Mahasiswa("S2", "Agung", "Dep 1", 70));
        mahasiswaList.add(new Mahasiswa("S3", "Dheva", "Dep 1", 60));
        mahasiswaList.add(new Mahasiswa("S4", "Alfan", "Dep 1", 90));
        mahasiswaList.add(new Mahasiswa("S5", "Nyoman", "Dep 2", 30));
        mahasiswaList.add(new Mahasiswa("S6", "Irvan", "Dep 3", 32));
        mahasiswaList.add(new Mahasiswa("S7", "Aldo", "Dep 3", 70));
        mahasiswaList.add(new Mahasiswa("S8", "Darul", "Dep 3", 20));

        request.setAttribute("mahasiswaList", mahasiswaList);
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
}