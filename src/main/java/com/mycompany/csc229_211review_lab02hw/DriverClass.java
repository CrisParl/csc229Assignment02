package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author Cristian Parlog
 */
public class DriverClass {
	
	public static void main(String[] args) {
	
		
		Student std1= new Student("James", 20);
		
		//scanner to get input for gpa
		Scanner scanner = new Scanner(System.in);

		//sets gpa
		std1.setGPA(scanner.nextDouble());
		
		// prints student
		System.out.println(std1);
		
	}

}