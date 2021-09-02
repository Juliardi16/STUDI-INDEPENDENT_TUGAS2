package tugas2;
import java.util.Scanner;
public class Pertamina {
    String namaBensin;
    int harga,liter,totalBayar;

    void setPertamax(){
        this.namaBensin ="PERTAMAX";
        this.harga = 9000;
    }
    void setPertalite(){
        this.namaBensin = "PERTALITE";
        this.harga = 8000;
    }
    void setPremium(){
        this.namaBensin = "PREMIUM";
        this.harga = 7000;
    }
    void setBerapaLiter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Isi Berapa Liter ? : ");
        this.liter = input.nextInt();
    }
    int totalBayar(){
        this.totalBayar = this.harga * this.liter;
        return this.totalBayar;
    }
    void output(){
        int kembalian;
        int bayar;
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Anda membeli   : " +this.namaBensin);
        System.out.println("Harga perliter : " +this.harga);
        System.out.println("Total harga Rp : " +totalBayar());
        System.out.print("Bayar         Rp: ");
        bayar = input.nextInt();
            if(bayar < totalBayar()){
                System.out.println("Maaf uang anda kurang");
            }else{
                System.out.println("======================");
                kembalian = bayar - totalBayar();
                System.out.println("Kembalian  Rp."+kembalian);
            }
    }
}

