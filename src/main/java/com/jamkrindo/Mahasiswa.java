package com.jamkrindo;

public class Mahasiswa {
    private final String mahasiswaID;
    private final String mahasiswaName;
    private final String department;
    private final int marks;
    private final double persentage;

    public Mahasiswa(String mahasiswaID, String mahasiswaName, String department, int marks) {
        this.mahasiswaID = mahasiswaID;
        this.mahasiswaName = mahasiswaName;
        this.department = department;
        this.marks = marks;
        this.persentage = (double) marks / 100;
    }

    public String getMahasiswaID() {
        return mahasiswaID;
    }

    public String getMahasiswaName() {
        return mahasiswaName;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }

    public double getPersentage() {
        return persentage;
    }

    public boolean hasPassed() {
        return marks >= 40;
    }
}
