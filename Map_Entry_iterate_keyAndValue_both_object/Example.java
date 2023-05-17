package test;

import java.util.*;



public class Example {

    public static void main(String[] args) {
    
        Map<Student, StudentAddress> studentDetails = new HashMap<>();
        
        Student john = new Student("John", 12345);
        StudentAddress johnAddress = new StudentAddress("123 Main St", "City", "12345");
        
        Student emily = new Student("Emily", 54321);
        StudentAddress emilyAddress = new StudentAddress("456 Elm St", "Town", "54321");
        
        studentDetails.put(john, johnAddress);
        studentDetails.put(emily, emilyAddress);
        
        //System.out.println(studentDetails);
        
        for (StudentAddress address : studentDetails.values()) {
            System.out.println(address);
        }
        for (Student key : studentDetails.keySet()) {
        	System.out.println(key);
        }
        
        
        System.out.println("****************************************************");
        for(Map.Entry<Student, StudentAddress> et:studentDetails.entrySet()) {
			System.out.println("Student  :"+et.getKey());
			System.out.println("StudentAddress  :"+et.getValue());
			System.out.println("------------------------------------------------");
		}
        
        
        
        
        
    }
}


