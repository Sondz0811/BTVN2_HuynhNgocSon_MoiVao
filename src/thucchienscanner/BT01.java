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
public class BT01 {

    public static Boolean checkPerfect(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if (s == n) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so thu nhat:");
        int stn = Integer.parseInt(sc.nextLine());
        System.out.println("so thu hai:");
        int sth = Integer.parseInt(sc.nextLine());
        if (checkPerfect(stn) == true) {
            System.out.println("is a perfect number.");
        } else {
            System.out.println("is a normal number.");
        }
        if (checkPerfect(sth) == true) {
            System.out.println("is a perfect number.");
        } else {
            System.out.println("is a normal number.");
        }

    }
}
