package com.dilli;

import java.util.*;

/*
This program stores ITECCourses objects in an
array list and prints the information.
 */
public class ITECCourseManagement1 {
    public static void main(String[] args) {
        //Creates an arraylist of ITECCourses objects
        ArrayList<ITECCourses> mctcITECCourses = new ArrayList<ITECCourses>();
        //creates an ITECCourses object
        ITECCourses maintenanceCourse = new ITECCourses("Microcomputer System Maintenance",
                1310, 20, "None");

        //adds some students to an object
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");

        //Creates an ITECCourses object
        ITECCourses datacomCourse = new ITECCourses("Data Communication", 1425,
                30, "None");

        //adds some students to an object
        datacomCourse.addStudents("Dave");
        datacomCourse.addStudents("Ed");
        datacomCourse.addStudents("Flora");

        //creates an ITECCourse object
        ITECCourses javaCourse = new ITECCourses("Java Programming", 2545,
                24, "None");
        //adds some students to an object
        javaCourse.addStudents("Gus");
        javaCourse.addStudents("Harry");
        javaCourse.addStudents("Lzzy");
        //creates an object
        ITECCourses infoTech = new ITECCourses("Info Tech Concept", 1100,
                30, "T3050");
        //adds some students to an object
        infoTech.addStudents("Max");
        infoTech.addStudents("Nancy");
        infoTech.addStudents("Orson");

        //adds ITECCourses objects to an array list
        mctcITECCourses.add(javaCourse);
        mctcITECCourses.add(infoTech);
        mctcITECCourses.add(datacomCourse);
        mctcITECCourses.add(maintenanceCourse);
        //prints the specific information from an ITECCourse object
        System.out.println(String.format("%-35s %-35s", "Course Name", "Free Space"));
        System.out.println("==============================================");
        for(ITECCourses ob: mctcITECCourses) {
            System.out.println(ob);
        }

    }
}
