/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylistimplementation;

/**
 *
 * @author savannah
 */

import java.util.Scanner;

public class TestGradeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeList gradeList = new GradeList(); 

        while (true) { 
            System.out.println("Grade List Menu:");
            System.out.println("1. Add Grade");
            System.out.println("2. Display All Grades"); 
            System.out.println("3. Display Statistics");
            System.out.println("4. Remove Grade");
            System.out.println("5. Find Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting program");
                break; 
            }

            switch (choice) {
                case 1:
                    gradeList.AddGrade();
                    break;
                case 2:
                    gradeList.DisplayAllGrades();
                    break;
                case 3:
                    gradeList.DisplayStatistics();
                    break;
                case 4:
                    gradeList.RemoveGrade();
                    break;
                case 5:
                    gradeList.FindGrade();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}


        