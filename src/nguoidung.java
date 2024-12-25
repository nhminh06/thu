import java.util.Date;

public class nguoidung extends nguoi{
    String manguoidung;
private boolean trangthai;
private Date ngaymua;
    public nguoidung(String ten, String diachi, int tuoi, Date ngaymua, String manguoidung, boolean trangthai) {
        super(ten, diachi, tuoi, ngaymua);
        this.manguoidung = manguoidung;
        this.trangthai = trangthai;
    }

    public boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("ma nguoi dung"+manguoidung);
    }
}
