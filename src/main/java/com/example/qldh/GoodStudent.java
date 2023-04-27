package com.example.qldh;

public class GoodStudent extends Student{

     private String bestRewardName;

     public GoodStudent(){};




    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel, gpa);
        this.bestRewardName = bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "bestRewardName='" + bestRewardName + '\'' +
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
