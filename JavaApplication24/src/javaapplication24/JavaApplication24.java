/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index >= grades.length) {
            return 0;
        }

        int currentPass = (grades[index] >= passingMark) ? 1 : 0;
        return currentPass + countPassingRecursive(grades, passingMark, index + 1);
    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    System.out.print("how many grades would you like to enter? :3 ");
        int size = input.nextInt();
        int[] userGrades = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("gae ko grades bi#" + (i + 1) + ": ");
            userGrades[i] = input.nextInt();
        }

        System.out.print("ang passing score kay.: ");
        int userMark = input.nextInt();

        int userLoop = countPassing(userGrades, userMark);
        int userRec = countPassingRecursive(userGrades, userMark, 0);
        System.out.println("para sa Loop: " + userLoop + " | Recursive: " + userRec + " | Match? " + (userLoop == userRec));

        input.close();
    }
}
//Questions 
// Question #1 
// Answers; Incrementing index moves the method forward to the next element in the array, 
//          shrinking the remaining unexamined portion of the array on every step. 
//          Without changing index (for example, passing index instead of index + 1), 
//          the method would inspect the exact same element forever, never make progress 
//          toward the base case (index >= grades.length), and trap itself in infinite recursion.
// Question #2
// Answers; If you delete the base case entirely, index will keep increasing past the end of the 
//          array until grades[index] tries to access an invalid position, crashing the program with an 
//          ArrayIndexOutOfBoundsException.
 

