    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P11;

/**
 *
 * @author FERGA
 */
class Jumlah{
    public int tambah(int x, int y){
        return x + y;
    }
    public int tambah(int x, int y, int z){
        return x + y + z;
    }
    public int tambah(double pi, int x){
        return (int)pi + x;
    }
}
public class Penjumlahan {
    public static void main(String[] args){
        Jumlah obj = new Jumlah();
        System.out.println(obj.tambah(2,5));
        System.out.println(obj.tambah(2, 5, 9));
        System.out.println(obj.tambah(3.14159, 10));
    }
}
