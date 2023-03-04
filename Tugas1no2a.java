/*
Mutiara Dolla M. | 4405 | A11.2021.13745
Tugas 1
E. Latihan
    2.  a. Keliling lingkaran dengan diketahui diameter = 10.
        b. Luas segitiga siku-siku dengan diketahui alas = 6, tinggi = 8.
        c. Volume tabung dengan diketahui diameter = 5, tinggi = 10. 

*/
package tugas1no2a;

public class Tugas1no2a {
    public static void main(String[] args) {
        //a
        float D = 10;
        double KLing = 3.14 * D;
        
        System.out.println("Keliling lingkaran dengan diameter "+D +" adalah "+KLing);
        
        //b
        int alas = 6;
        int tinggi = 8;
        int Luas = alas * tinggi /2;
        
        System.out.println("Luas Segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah "+Luas);
        
        //c
        float Dtab = 5;
        float rtab = Dtab/2;
        int ttab = 10;
        double Vtab = 3.14 * rtab * rtab * ttab;
        
        System.out.println("volume tabung dengan diameter "+Dtab+" dan tinggi "+ttab+" adalah "+Vtab);
       
    }
    
}
