import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Scanner scanner = new Scanner(System.in);

//        input nilai jari-jari
        System.out.print("Jari-jari: ");
        double r = scanner.nextDouble();

//        assign hasil kalkulasi luas & keliling ke variabel
        double keliling = lingkaran.hitungKeliling(r);
        double luas = lingkaran.hitungLuas(r);

//        tampilkan hasil kalkulasi ke cli
        System.out.printf("Keliling: %.2f\n", keliling);
        System.out.printf("Luas: %.2f",  luas);
    }
}