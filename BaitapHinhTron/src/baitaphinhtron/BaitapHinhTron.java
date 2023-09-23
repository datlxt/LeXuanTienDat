/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaphinhtron;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BaitapHinhTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r,dienTich,chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính r: ");
        r = sc.nextDouble();
        
        //Tính Diện tích và Chi vi Hình Tròn
        chuVi = 2*Math.PI*r;
        System.out.println("Chu vi = "+chuVi);
        System.out.println("Chu vi = "+ Math.round(chuVi));//Làm tròn về chữ số nguyên(cắt phần sua dấu ,) 
        System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
         
         
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Diện tích = "+ dienTich);
        System.out.println("Diện tích = "+ Math.round(dienTich));//Làm tròn về chữ số nguyên
        System.out.println("Diện tích = "+ Math.round(dienTich*100.0)/100.0);//Làm trong
        
    }
    
}
