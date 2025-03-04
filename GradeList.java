/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistimplementation;

/**
 *
 * @author savannah
 */
import java.util.Scanner;

public class GradeList {

    Scanner input = new Scanner(System.in);
    private int[] grades;
    private int numOfItems;

    public GradeList() {
        grades = new int[100];
        numOfItems = 0;
    }

    public void AddGrade() {
        int num=0;
        System.out.println("Enter your grades, enter -1 to exit");
        //num = input.nextInt();
        while (num != -1 ){
            if (numOfItems < grades.length) {
            //System.out.println("Enter your grades, enter -1 to exit");
            num = input.nextInt();
            if(num == -1){
                break;
            }
            grades[numOfItems] = num;
           // num = input.nextInt();
          // num = grades[numOfItems];
            numOfItems++;
        } else {
            System.out.println("Grade list is full");
        }
    }
    }
/*
    }
        if (numOfItems < grades.length) {
            System.out.println("Enter your grades");
            grades[numOfItems] = input.nextInt();
            numOfItems++;
        } else {
            System.out.println("Grade list is full");
        }
    }
*/
    public boolean RemoveGrade() {
        System.out.println("Enter grade you want to remove ");
        int grade = input.nextInt();
        for (int i = 0; i < numOfItems; i++) {
            if (grades[i] == grade) {
                //shifts items left
                for (int j = i; j < numOfItems - 1; j++) {
                    grades[j] = grades[j + 1];
                }
                numOfItems--;
                return true;
            }
        }
        System.out.println("grade not found");
        return false;
    }

    public boolean FindGrade() {
        System.out.println("Enter a grade to serch for");
        int grade = input.nextInt();
        for (int i = 0; i < numOfItems; i++) {
            if (grades[i] == grade) {
                System.out.println("Grade " + grade + " found at index " + i);
                return true; // grade found
            }
        }
        System.out.println("Grade " + grade + " not found.");
        return false; // grade not found
    }

    public void SortGrade() {
        for (int i = 0; i < numOfItems; i++) {
            System.out.println(grades[i]);
        }
    }

    public void DisplayStatistics() {
        if (numOfItems == 0) {
            System.out.println("No grades exist.");
        } else {
            int sum = 0;
            int highest = grades[0];
            int lowest = grades[0];

            for (int i = 0; i < numOfItems; i++) {
                sum += grades[i];
                if (grades[i] > highest) {
                    highest = grades[i];
                }
                if (grades[i] < lowest) {
                    lowest = grades[i];
                }
            }

            double average = (double) sum / numOfItems;

            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }
    }
     

    public void DisplayAllGrades() {
        if (numOfItems == 0) {
            System.out.println("No grades exist.");
        } else {
            System.out.println("Grades List:");
            for (int i = 0; i < numOfItems; i++) {
                System.out.println("Grade " + (i + 1) + ": " + grades[i]);
            }
        }
    }
}
