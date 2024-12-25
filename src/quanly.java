import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class quanly {
    private List<nguoi> Nguoi = new ArrayList<>();
    private List<nguoidung> nguoii = new ArrayList<>();
    public void addnguoi(nguoi nguoi) {
        Nguoi.add(nguoi);
    }
   public void innguoi(){
        for(nguoi nguoi : Nguoi){
            nguoi.print();
        }
   }
   Scanner sc = new Scanner(System.in);
   public void timnguoi(){
       System.out.println("nhap ma nguoi dung:");
       String timnguoi = sc.nextLine();
       boolean tim= false;
     for (nguoidung nguoi : nguoii) {
         if (nguoi.manguoidung.toLowerCase().equals(timnguoi)) {
             tim = true;
             nguoi.print();
         }else {
             System.out.println("khong tim duc nguoi");
         }
     }
   }
   public void kiemtra(boolean isbo){
for (nguoidung nguoi : nguoii) {
    if (nguoi.getTrangthai()==isbo){
        nguoi.print();
    }
}
   }
   public void sapxep(){
       nguoii.sort(Comparator.comparing(nguoidung::getNgaymua));
       System.out.println("sao xep theo ngay mua");
       innguoi();
   }
}
