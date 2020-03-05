/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Responsi;

/**
 *
 * @author KomDas
 */

import java.util.Scanner;
public class Nasabah {
    int no_rekening, no_id;
    String nama, alamat, no_telp;
    double saldo;
    
    public void tampilData(){
        System.out.println("\nD A T A   N A S A B A H");
        System.out.println("=========================================");
        System.out.println("No. ID \t\t: " + no_id);
        System.out.println("No. Rekening \t: " + no_rekening);
        System.out.println("Nama Nasabah \t: " + nama);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("No. Telp \t: "+no_telp);
        System.out.println("Saldo \t\t: " + saldo);
    }
    public static void main(String[] args){
        Nasabah nasabah = new Nasabah();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Nasabah");
        System.out.print("No. ID: ");
        nasabah.no_id = input.nextInt();
        System.out.print("No. Rek: ");
        nasabah.no_rekening = input.nextInt();
        System.out.print("Nama: ");
        nasabah.nama = input.next();
        System.out.print("Alamat: ");
        nasabah.alamat = input.next();
        System.out.print("No. Telp: ");
        nasabah.no_telp = input.next();
        System.out.print("Saldo: ");
        nasabah.saldo = input.nextDouble();
        nasabah.tampilData();
    }
}
