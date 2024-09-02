import java.util.Scanner;
public class GuruTester {
      //constructor
      public static void main(String[] args) {
        //String-->int-->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = input.nextLine();
        System.out.println("Mapel: ");
        String mapel = input.nextLine();
        System.out.println("Status: ");
        String Status = input.nextLine();
        System.out.println("NIP: ");
        int nip = input.nextInt();
        input.close();

        Guru cinta = new Guru(nip, nama, mapel, Status);
        cinta.print();

        //Constructer Parameter
        Guru Pasha = new Guru(4657, "Pasha", "Pengembangan game", "Tetap");
        Guru Falah = new Guru(1945, "Falah", "Bahasa Indonesia", "Full-Time");
        Guru Widi = new Guru(2009, "Widi", "Seni Budaya", "Tetap");
        Guru Nasya = new Guru(2010, "Nasya", "Teknik Komputer dan Jaringan", "Tetap");
        Guru Kiya = new Guru(2018, "Kiya", "Bahasa Jawa", "Tetap");
    

        Pasha.print();
        Falah.print();
        Widi.print();
        Nasya.print();
        Kiya.print();

    }
}
