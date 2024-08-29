import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListVp {

    private List<VatPham> arr;

    public ListVp() {
        this.arr = new ArrayList<>();
    }

    public void nhap(){


        System.out.println("1. nhap thong tin 5 san pham: ");
        System.out.println("2. xuat  thong tin san pham: ");
        System.out.println("3. san phan ton nhieu vang nhat  : ");
        System.out.println("4.nhap so xu spon thu duoc : ");
        System.out.println("5.thoat: ");
        System.out.println("---------------------------------------");

        while (true) {
            int n =0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("moi ban chon: ");
             n = scanner.nextInt();
            if (n==1){
                for (  int a =1;a<=5;a++){

                    System.out.println("nha san pham thu "+a);
                    VatPham vatPham = new VatPham();
                    vatPham.nhap();
                    arr.add(vatPham);
                }
            } else if (n==2) {
                for (VatPham vatPham : this.arr){
                    vatPham.xuat();
                }


            } else if (n==3) {
                cau3();
            }
            else if (n==4) {
                cau4();
            }
            else{
                break;
            }

        }


    }
    public double maxVang() {

        return this.arr.stream().mapToDouble(VatPham::vang)

                .max().getAsDouble();
    }

    public double TongVang(){
        return this.arr.stream().mapToDouble(VatPham::vang)

                .sum();

    }
    public void cau4(){
        int Vang =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so vang thu duoc:");
        Vang =scanner.nextInt();

        if (Vang>TongVang() ){
            System.out.println("spon giai cuu duoc ");
        }else {
            System.out.println("can " + TongVang() +"de cuu thanh cong");
            System.out.println(" giai cuu that bai !");
        }

    }
    public void cau3() {

        System.out.println("Cau 3: ");
        double maxDien = maxVang();
        for (VatPham vatPham : this.arr) {
            if (vatPham.vang() == maxDien) {
                System.out.println("vat pham  " + vatPham.getTenVp() + " ton nhieu vang nhat!");
                System.out.println("----------------------------------");
            }


        }
    }

}
