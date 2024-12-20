import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa yang ingin didaftarkan:");
        int jumlahSiswa = input.nextInt();
        input.nextLine();

        inputdatasiswa(jumlahSiswa, input, daftarSiswa);

        System.out.println("Daftar Siswa:");
        for (Siswa siswa : daftarSiswa) {
            siswa.tampilkanInfo();
            System.out.println();
        }
        input.close();
    }
}