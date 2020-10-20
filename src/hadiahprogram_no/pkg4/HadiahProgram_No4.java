/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprogram_no.pkg4;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class HadiahProgram_No4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[]tilang = {"X", "Masker", "SIM", "STNK"};
        
        System.out.println("Daftar Penilangan");
        
        for (int i = 1; i < tilang.length; i++){
            System.out.println(i+ ". " +tilang[i]);
        }
        
        System.out.println();
        System.out.print("Pilih Jenis Tilangan : ");
        
        int pilihan = input.nextInt();
        
        System.out.println("Jenis Tilangan yang Dipilih : "+tilang[pilihan]);
        System.out.println();
        
        String nama, alamat, tanggal;
        int denda1=50000, denda2=100000, denda3=150000;
        
        switch(pilihan){
            case 1:
                System.out.println("Nama : ");
                nama = input.nextLine();
                System.out.print("Alamat : ");
                alamat = input.nextLine();
                System.out.print("Tanggal : ");
                tanggal = input.nextLine();
                System.out.println("Jenis Tilangan : Masker");
                System.out.print("Denda : "+denda1);
                break;
            case 2:
                System.out.println("Nama : ");
                nama = input.nextLine();
                System.out.print("Alamat : ");
                alamat = input.nextLine();
                System.out.print("Tanggal : ");
                tanggal = input.nextLine();
                System.out.println("Jenis Tilangan : Masker");
                System.out.print("Denda : "+denda2);
                break;
                
            case 3:
                System.out.println("Nama : ");
                nama = input.nextLine();
                System.out.print("Alamat : ");
                alamat = input.nextLine();
                System.out.print("Tanggal : ");
                tanggal = input.nextLine();
                System.out.println("Jenis Tilangan : Masker");
                System.out.print("Denda : "+denda3);
                break;
                
            
            default:
        }
    }
    
}
