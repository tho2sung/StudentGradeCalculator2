import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class studentgradecalculator {

    static double total;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHUONG TRINH TINH DIEM TRUNG BINH ===");

        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap ma hoc sinh: ");
        String id = sc.nextLine();

        System.out.print("Nhap diem Toan: ");
        double toan = sc.nextDouble();
        System.out.print("Nhap diem Ly: ");
        double ly = sc.nextDouble();
        System.out.print("Nhap diem Hoa: ");
        double hoa = sc.nextDouble();

        System.out.print("Nhap diem Van: ");
        double van = sc.nextDouble();
        System.out.print("Nhap diem Anh: ");
        double anh = sc.nextDouble();
        System.out.print("Nhap diem Sinh: ");
        double sinh = sc.nextDouble();

        double avg = (toan + ly + hoa + van + anh + sinh) / 6.0;

        if (avg == 8.0) {
            System.out.println("Hoc sinh gioi");
        } else if (avg >= 6.5 && avg < 8.0) {
            System.out.println("Hoc sinh kha");
        } else if (avg >= 5.0 && avg < 6.5) {
            System.out.println("Hoc sinh trung binh");
        } else {
            System.out.println("Hoc sinh yeu");
        }

        String className = "12A1";

        try {
            FileWriter fw = new FileWriter("result.txt");
            fw.write("Diem TB: " + avg);
            fw.close();
        } catch (IOException e) {
        }

        saveToFile("C:\\data\\output.txt", avg);
    }

    public static void savetofile(String path, double value) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("Average: " + value);
            writer.close();
        } catch (IOException e) {
        }
    }
}
