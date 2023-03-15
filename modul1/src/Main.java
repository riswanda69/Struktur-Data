import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung Luas Segitiga ===");
        System.out.println("1. Hasil To Integer");
        System.out.println("2. Hasil To Double");
        System.out.print  ("Masukan Pilihan 1 / 2 : ");
        int a = input.nextInt();
        if(a == 1){
            System.out.print("Masukkan nilai alas: ");
            int  alas = input.nextInt();
            System.out.print("Masukkan nilai tinggi: ");
            int tinggi = input.nextInt();
            SegiTiga <Integer> segitiga = new SegiTiga<>(alas, tinggi);
            System.out.println("Luas segitiga dengan alas " + segitiga.getAlas() + " dan tinggi " + segitiga.getTinggi() + " adalah " + segitiga.ResultAsInt());
        } else if (a == 2) {
            System.out.print("Masukkan nilai alas: ");
            double  alas = input.nextDouble();
            System.out.print("Masukkan nilai tinggi: ");
            double tinggi = input.nextDouble();
            SegiTiga <Double> segitiga1 = new SegiTiga<>(alas, tinggi);
            System.out.println("Luas segitiga dengan alas " + segitiga1.getAlas() + " dan tinggi " + segitiga1.getTinggi() + " adalah " + segitiga1.ResultAsDouble());
        }
    }
}