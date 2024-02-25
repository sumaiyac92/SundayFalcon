package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {

		
int age =30;		 // Variable
		
int[]ageFalcon = new int[]{25,30,28,35,40}; // Array		
 
// Array index          [0] [1] [2] [3] [4]

System.out.println("Student age : " + ageFalcon[3]);
System.out.println("Total number: " + ageFalcon.length);

String[] nameFalcon = new String[]{"tahmid", "Lubna", "Salman", " Rumi", "Sumaiya"};
System.out.println("Student Name : " + nameFalcon[4]);
System.out.println("Total Student : " + nameFalcon.length);


boolean[] attendenceFalcon = new boolean[]{true, false, false, true, true};
System.out.println("Student Attendence : " + attendenceFalcon[4]);
System.out.println("Total Student : " + attendenceFalcon.length);

// multi-deimntional Array
int[][] ageFalcon2D = {{25,30,28,35,40},    //[0][0] [0][1] [0][2] [0][3] [0][4]
		               {24,28,32,22}};   //[1][0] [1][1] [1][2] [1][3] 

System.out.println("Student Age 2D : " + ageFalcon2D[0][3]);

    // Hashmap store multiple data using key - value pair, implementation of map interface

HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();

StudentAge.put("Tahmid" , 25);
StudentAge.put("Lubna" , 24);
StudentAge.put("Salman" , 27);
StudentAge.put("Rumi" , 35);
StudentAge.put("Sumaiya" , 25);

System.out.println("Hashmap Student Age : " + StudentAge.get("Lubna"));

HashMap<String, String> StateCity = new HashMap<String, String>();

StateCity.put("Georgia" , "Atlanta");

System.out.println("Hashmap State City : " + StateCity.get("Georgia"));

// HashTable store multiple data using key-value, no duplicate,
// also is synchronized only one thread can be modified

Hashtable<String, String> Region = new Hashtable<String, String>();

Region.put("BD" , "Asia");
Region.put("USA" , "America");
System.out.println("Hashtable Region : " + Region.get("BD"));

//Hashset Store unordered collection containing unique value, implementation of set interface

HashSet<String> Car = new HashSet<>();
Car.add("BMW");
Car.add("Tesla");
System.out.println("car : " + Car);

// 2 dimensional string Array

String [][] String2DArray = {{"1","2", "3",}, {"4","5"}};

System.out.println("Number is :" + String2DArray[1][1]);


// Write a hashmap for attendance = value, name = key
// Hashtable<String, boolean>

HashMap<String,Boolean> Attendance = new HashMap<String, Boolean>();

Attendance.put("John", true);
Attendance.put("Max", true);
Attendance.put("Ron", false);

System.out.println(Attendance.get("John"));









	}

}
