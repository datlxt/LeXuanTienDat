/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhapdulieutubanphim;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhapDulieutuBanphim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner scaner= newScaner(System.in)
//        nextBoolean(): Đọc 1 gtri boolean từ bàn phím 
//        nextByte(): đọc 1 gtri byte từ bàn phím
//        nextDouble(): đọc 1 gtri double
//        nextFloat():float
//        nextInt(): int
//        nextLine(): string
//        nextLong(): đọc 1 gtri long từ bàn phím
//        nextShort(): đọc 1 gtri short từ bàn phím
         
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao ho va ten: ");
          String hoVaten = sc.nextLine();
          System.out.println("Nhap ma sinh vien: ");
          String maSinhvien = sc.nextLine();
//          char c = sc.next().charAt(0);
          System.out.println("Nhap vao diem thi: ");
          float diemThi = sc.nextFloat();
          System.out.println("--------------");
          System.out.println("Họ và tên: "+ hoVaten);
          System.out.println("Mã sinh viên: "+ maSinhvien);
          System.out.println("Điểm thi: "+ diemThi);
          
        
        
    }
    
}
