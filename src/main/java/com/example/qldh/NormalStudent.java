package com.example.qldh;

public class NormalStudent extends Student{
    private double englishScore;
    private double entryTestScore;

    public NormalStudent(){};



    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, double englishScore, double entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel, gpa);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
