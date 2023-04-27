package com.example.qldh;

import java.util.Scanner;

public class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    protected double gpa;
    public Student(){};

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDoB() {
        return doB;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
