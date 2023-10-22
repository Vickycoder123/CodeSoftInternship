package com.codsoft.gradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        boolean isFailed = false;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks must be within the range of 0 to 100.");
                i--; // Decrement i to re-enter marks for the same subject
            } else if (marks < 35) {
                isFailed = true;
                break; // If a fail is detected, exit the loop
            }
            
            totalMarks += marks;
        }
        
        if (isFailed) {
            System.out.println("You have failed in this subject.");
        } else {
            double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            String grade = calculateGrade(averagePercentage);
            System.out.println("Grade: " + grade);
        }
        
        scanner.close();
    }
    
    public static String calculateGrade(double percentage) {
        int range = (int) percentage / 10;
        String grade;

        switch (range) {
            case 10:
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        
        return grade;
    }
}
