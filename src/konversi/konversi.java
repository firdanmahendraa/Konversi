package konversi;
import java.util.Scanner;

public class konversi {
    
    public static void main(String[] args) {
        
        System.out.println("Pilihan Konversi:\n"
                            + " 1. Jam -> Menit\n"
                            + " 2. Detik -> Hari, Jam, Menit, dan Detik");
        System.out.print("\nMasukkan pilihan: ");
    try (Scanner options = new Scanner(System.in)){
        if (!options.hasNextInt()){
            System.out.println("Itu alfabet, anda salah!!!!");
        } else {
            if (options.nextInt() ==1){
                System.out.print("Masukkan jam : ");
                Scanner hours = new Scanner(System.in);
                jamKeMenit(hours.nextInt());
            } else{
                System.out.print("Masukkan detik : ");
                try (Scanner seconds = new Scanner(System.in)){
                detikKeHari (seconds.nextLong());
                    }   
                }
            }
        }
    }

    private static void jamKeMenit(long jam) {
        long menit = jam * 60;
        System.out.println(jam+" jam = " + menit + " menit");
    }

    private static void detikKeHari(long detik) {
        //hari
        int hari = (int) (detik / (60*60*24));
        
        //jam
        detik %= (60 * 60 * 24);
        int jam = (int) (detik / (60 * 60));
        
        //menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        
        //detik
        detik %= 60;
        
        System.out.println( + hari + " hari, " 
                            + jam + " jam, " 
                            + menit + " menit, " 
                            + detik + " detik");
        }
    }


