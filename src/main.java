import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanly ql = new quanly();
        while(true) {
            System.out.println("1.nhap nguoi dung");
            System.out.println("2.in ra nguoi dung");
            System.out.println("3.tim kiem nguoi dung");
            System.out.println("kiem tra nguoi dung");
            System.out.println("sap xep nguoi dung");
            System.out.println("chon:");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("nhap ten");
                    String ten = sc.nextLine();
                    System.out.println("nhap dia chi");
                    String diaChi = sc.nextLine();
                    System.out.println("nhap tuoi");
                    int tuoi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhap ngay mua:");


            }
        }


    }
}
