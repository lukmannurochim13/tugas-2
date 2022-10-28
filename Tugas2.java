import javax.xml.namespace.QName;
import java.util.Scanner;

class Out{

    String nama;
    String ttl;
    int umur;
    String live;
    boolean endSchool;
    boolean alReadywork;
    String keahlian;
    boolean menikah;
    int gaji;

    @Override
    public String toString() {
        return "Out{" +
                "nama='" + nama + '\'' +
                ", ttl='" + ttl + '\'' +
                ", umur=" + umur +
                ", live='" + live + '\'' +
                ", endSchool=" + endSchool +
                ", alReadywork=" + alReadywork +
                ", keahlian='" + keahlian + '\'' +
                ", menikah=" + menikah +
                ", gaji=" + gaji +
                '}';
    }
}


public class Tugas2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama");
        String name = scanner.nextLine();
        System.out.println("Tempat tanggal Lahir");
        String born = scanner.nextLine();
        System.out.println("umur");
        int age = scanner.nextInt();
        System.out.println("Alamat");
        scanner.nextLine();
        String alamat = scanner.nextLine();
        System.out.println("End School");
        boolean school = scanner.nextBoolean();
        System.out.println("Already work");
        boolean work = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Keahlian");
        String skill = scanner.nextLine();
        System.out.println("Allready Married");
        boolean married = scanner.nextBoolean();
        System.out.println("Gaji Expexted");
        int nominal = scanner.nextInt();


        Out all = new Out();
        all.nama = name;
        all.ttl = born;
        all.umur = age;
        all.live = alamat;
        all. endSchool = school;
        all.alReadywork = work;
        all.keahlian = skill;
        all.menikah = married;
        all.gaji = nominal;

        System.out.println(all);
    }

}


