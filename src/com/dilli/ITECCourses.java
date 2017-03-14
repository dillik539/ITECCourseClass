package com.dilli;

/*
This program defines a class and methods
that can be used in any other related program.
 */
import java.util.*;
public class ITECCourses {
    //initializes the private variables
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudent;
    private String room;
    //defines getters and setters methods.
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    //defines the Constructor
    public ITECCourses(String courseName, int courseCode,int courseMaxStudents, String courseRoom){
        this.name = courseName;
        this.code = courseCode;
        this.maxStudent = courseMaxStudents;
        this.students = new ArrayList<String>();
        this.room = courseRoom;
    }
    //defines method that removes students from an arraylist
    public void removeStudents(String studentName){
        if(students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from "+this.name);
        }else {
            System.out.println(studentName+" was not found in "+ this.name);
        }
    }
    //this writes the course information
    public void writeCourseInfo(){
        System.out.println("Course name: "+name);
        System.out.println("Course code: "+code);
        System.out.println("Course room: "+room);
        System.out.println("Students enrolled:");
        for(String Student: students){
            System.out.println(Student);
        }
        System.out.println("There are "+getNumberOfStudents()+" students enrolled.");
        System.out.println("The maximum number of students for this course is "+maxStudent);
        System.out.println("The available space for this course is "+freeSpace());
        System.out.println();
    }
    //this adds students to an arraylist.
    public void addStudents(String studentName){
        if(students.size()==maxStudent){
            System.out.println("Course is full - can't add "+studentName);
        }else {
            students.add(studentName);
        }
    }
    //this method gets the number of students enrolled
    public int getNumberOfStudents(){
        return this.students.size();
    }
    //this method retrieves the free space available for enrollment
    public int freeSpace(){
        int freeSpace = maxStudent - students.size();
        return freeSpace;
    }
    @Override
    public String toString(){
        return (String.format("%-40s %-40s",name,freeSpace()));
    }

}