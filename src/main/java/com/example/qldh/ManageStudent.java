package com.example.qldh;

import java.util.*;
import java.util.stream.Collectors;

public class ManageStudent {
    private List<GoodStudent> goodStudentList;
    private List<NormalStudent> normalStudents;

    private List<Student> listStudentMain;
    public ManageStudent(){
        this.goodStudentList = new ArrayList<>();
        this.normalStudents = new ArrayList<>();
        this.listStudentMain = new ArrayList<>();
    };

    public void addStudent(List<Student> studentList){

        if(studentList.size() > 15){
            studentList.stream().sorted(Comparator.comparingDouble(Student::getGpa)).collect(Collectors.toList());
            for(int i = 0; i < studentList.size(); i++){
                if(studentList.get(i).getGpa() == studentList.get(i+1).getGpa()){
                    List<Student> studentSampleList = new ArrayList<>();

                    studentSampleList.add(studentList.get(i));
                    studentSampleList.add(studentList.get(i+1));
                    studentSampleList.stream().sorted(Comparator.comparing(Student::getFullName)).collect(Collectors.toList());

                    studentList.get(i).equals(studentSampleList.get(0));
                    studentList.get(i+1).equals(studentSampleList.get(1));

                }
            }

            for(int i = 0; i < 14; i++){
                listStudentMain.get(i).equals(studentList.get(i));
            }
        }
    }
}
