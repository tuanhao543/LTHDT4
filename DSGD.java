
package gdnd;

import java.util.ArrayList;
import java.util.Scanner;
public class DSGD {
    ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
        ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        
        public DSGD() { 
        arrGiaoDichDat = new ArrayList<>();
        arrGiaoDichNha = new ArrayList<>();
    }
        public void menuChinh() { 
        System.out.println("Hãy chọn mục bạn muốn"); 
        System.out.println("1. Nhập thong tin giao dịch đất"); 
        System.out.println("2. Nhập thong tin giao dịch nhà");
        System.out.println("3. Thông tin giao dịch đất");
        System.out.println("4. Thông tin giao dịch nhà");
        System.out.println("5. Trung binh thành tiền của giao dịch đất");
        System.out.println("6. Các giao dịch đất của tháng 9 năm 2013");
        System.out.println("7. Các giao dịch nhà của tháng 9 năm 2013");
        System.out.println("Nhấn phím 0 để thoát"); 
    }
        public  void trungbinh(){
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia() * 1.5;
            } else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
        }
        public void hienttgdn(){
            System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
        }
        public void hienttgdd(){
            System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
        }
        public void nhapttgdn(){
             Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giao dịch nhà: ");
        soGiaoDichNha = scanner.nextInt();
        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            arrGiaoDichNha.add(giaoDichNha);
        }
        }
        public void nhapttgdd(){
             Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giao dịch đất: ");
        soGiaoDichDat = scanner.nextInt();
        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            arrGiaoDichDat.add(giaoDichDat);
        }
        }
        public void gdd(){
        System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }
        }
        public void gdn(){
        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }
        }
}
