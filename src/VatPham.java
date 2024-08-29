import java.util.Scanner;

public class VatPham {
    protected String TenVp;
    protected int ChiSoSucManh ;
    protected double HeSoSucManh ;
    protected  int SoVangQuyDoi;


    public VatPham() {
    }

    public String getTenVp() {
        return TenVp;
    }

    public void setTenVp(String tenVp) {
        TenVp = tenVp;
    }

    public int getChiSoSucManh() {
        return ChiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        ChiSoSucManh = chiSoSucManh;
    }

    public double getHeSoSucManh() {
        return HeSoSucManh;
    }

    public void setHeSoSucManh(double heSoSucManh) {
        HeSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return SoVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        SoVangQuyDoi = soVangQuyDoi;
    }

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap ten san pham : ");
       this.TenVp = scanner.nextLine();
        System.out.print("nhap chi so suc manh san pham : ");
        this.ChiSoSucManh = scanner.nextInt();
        System.out.print("nhap he so suc manh  san pham : ");
        this.HeSoSucManh = scanner.nextInt();
        System.out.print("nhap so vang quy doi ten san pham : ");
        this.SoVangQuyDoi = scanner.nextInt();



    }
    public void xuat(){
        System.out.println("-------------------------------");
        System.out.println(" --ten vat pham: " + getTenVp());
        System.out.println(" --He so suc manh: " + getHeSoSucManh());
        System.out.println(" --chi so suc manh: " + getChiSoSucManh());
        System.out.println(" --so vang quy doi: " + getSoVangQuyDoi());
        System.out.println(" --suc cong pha: " + SucCongPha());

    }

    public double SucCongPha(){
        return  getHeSoSucManh()*getChiSoSucManh();

    }
        public double vang(){
        return   (getHeSoSucManh()*getChiSoSucManh()) * getSoVangQuyDoi();
        }

}
