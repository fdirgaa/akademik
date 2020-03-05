/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P5;

/**
 *
 * @author KomDas
 */
import java.util.Scanner;
public class Jumlah{
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        int gajiPokok,tunjangan, jumlahGaji;
        String nama;
        System.out.print("Nama : ");
        nama = masuk.nextLine();
        System.out.print("Gaji Pokok : ");
        gajiPokok = masuk.nextInt();
        System.out.print("Tunjangan : ");
        tunjangan = masuk.nextInt();
        jumlahGaji = gajiPokok + tunjangan;
        System.out.println("Nama = "+nama);
        System.out.println("Jumlah Gaji = " + jumlahGaji);
    }
}