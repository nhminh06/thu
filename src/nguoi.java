import java.util.Date;

public class nguoi implements in{
    private String ten;
    private String diachi;
    private int tuoi;


    public nguoi(String ten, String diachi, int tuoi, Date ngaymua) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }



    @Override
    public void print() {
        System.out.println("ten: " + ten);
        System.out.println("diachi: " + diachi);
        System.out.println("tuoi: " + tuoi);
    }
}
