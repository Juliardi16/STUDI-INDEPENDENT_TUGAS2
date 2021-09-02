package tugas2;
import java.util.Scanner;
public class Spbu {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Pertamina pertamina = new Pertamina();
        System.out.println("SELAMAT DATANG DI SPBU");
        System.out.println("1.PERTAMAX");
        System.out.println("2.PERTALITE");
        System.out.println("3.PREMIUM");
        System.out.println("4.Exit");
        System.out.print("Tentukan pilihan anda : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                pertamina.setPertamax();
                pertamina.setBerapaLiter();
                pertamina.output();
                break;
            case 2:
                pertamina.setPertalite();
                pertamina.setBerapaLiter();
                pertamina.output();
                break;
            case 3:
                pertamina.setPremium();
                pertamina.setBerapaLiter();
                pertamina.output();
                break;
            case 4:
                System.out.println("Terimakasih");
                break;
        }
    }
}


