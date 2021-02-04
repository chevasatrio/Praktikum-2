
package soalpraktikum2;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        
        //Panggil Pohon
        cemara.SetNama();
        cemara.SetTinggi();
        kelapa.SetNama();
        kelapa.SetTinggi();
        System.out.println(" ");
        
        //Panggil Pohon
        cemara.GetNama();
        cemara.GetTinggi();
        System.out.println(" ");
        kelapa.GetNama();
        kelapa.GetTinggi();
    }
}
