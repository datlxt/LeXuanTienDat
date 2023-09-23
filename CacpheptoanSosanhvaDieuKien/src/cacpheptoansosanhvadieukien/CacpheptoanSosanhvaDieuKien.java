/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cacpheptoansosanhvadieukien;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CacpheptoanSosanhvaDieuKien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x,y;
        x = sc.nextInt();
        System.out.println("Nhập y: ");
        y = sc.nextInt();
        
        // Xuất kết quả 
        System.out.println(x +"=="+y +" : "+(x==y));
        System.out.println(x +"!="+y +" : "+(x!=y));
        System.out.println(x +"<"+y +" : "+(x<y));
        System.out.println(x +"<="+y +" : "+(x<=y));
        System.out.println(x +">"+y +" : "+(x>y));
        System.out.println(x +">="+y +" : "+(x>=y));
        System.out.println("----d------a-----t----");
        System.out.println("Cả 2 số là số chẵn: "+(x%2==0 && y%2==0 ));
        System.out.println("Có ít nhất 1 trong 2 số chẵn: "+(x%2==0||y%2==0));
    }
    
}
