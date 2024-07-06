/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

/**
 *
 * @author sonhuynh081104
 */
public class Demo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ten cua ban:");
        String t = sc.nextLine();
        System.out.println("tuoi cua ban:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Dia chi cua ban:");
        String dc = sc.nextLine();
        System.out.println("sdt cua ban:");
        int sdt = Integer.parseInt(sc.nextLine());
        System.out.println("chuyen nganh cua ban:");
        String cn = sc.nextLine();
        System.out.println("Ten:"+t+", Tuoi:"+tuoi+", Dia chi:"+dc+", Sdt:"+sdt+", Chuyen nganh:"+cn);
    
    
        
    }
}
