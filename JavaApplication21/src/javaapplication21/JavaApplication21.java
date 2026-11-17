/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
/**
 *
 * @author REGIDOR_CPE113
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        computeAverage(5,2 );
        computeAverage(10, 0);
        computeAverage(100, 8);
        System.out.println(computeAverage (5, 2));
        System.out.println(computeAverage (10, 0));
        System.out.println(computeAverage (100, 8));
    }

    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }
        return (double) total / count;
    }
}
