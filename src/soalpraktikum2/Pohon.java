
package soalpraktikum2;

import java.util.Scanner;

public class Pohon {
    
    //Variable
    String nama;
    double tinggi;
    Scanner halo = new Scanner(System.in);
    
    //Method Void SetNama
    void SetNama(){
        System.out.print("Masukkan nama pohon   : ");
        nama = halo.nextLine();
    }
    //Method Void SetTinggi
    void SetTinggi(){
        System.out.print("Masukkan tinggi pohon : ");
        tinggi = halo.nextDouble();
    }
    //Method Void GetNama
    void GetNama(){
        System.out.println("Nama pohon   : "+nama);
    }
    //Method Void GetTinggi
    void GetTinggi(){
        System.out.println("Tinggi pohon : "+tinggi+"m");
    }
}
