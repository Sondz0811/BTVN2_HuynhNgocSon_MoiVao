/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucchienscanner;

import java.util.Scanner;

/**
 *
 * @author sonhuynh081104
 */
public class BT02 {

    public static void inHinhVuong(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

    }

    public static void inTamGiac(int n) {
//        int b = n/2;
//        int k=1;
//        for (int i = 1; i <= n/2+1; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a < k ; a++){
//                System.out.print("*");
//            }
//            System.out.println("");
//            b = b-1;
//            k =k+2;
//        }
//        
        int b = n / 2;
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println("");
            b = b - 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number:");
        int ns = Integer.parseInt(sc.nextLine());
        if (ns % 2 == 0) {
            inHinhVuong(ns);
        } else {
            inTamGiac(ns);
        }

    }
}
