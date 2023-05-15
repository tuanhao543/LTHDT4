
package gdnd;

import java.util.Scanner;


public class GiaoDichNha extends GiaoDich{
     private String loaiNha, diaChi;
     private int choose;
    public GiaoDichNha()
    {

    }
    public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, String ngayGiaoDich, Long donGia,Float dienTich)
    {
        super( maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha= loaiNha;
        this.diaChi= diaChi;
        
    }
    public String getloaiNha() { 
        return loaiNha; 
    } 
     
    public void setLoaiNha( String loaiNha ) 
    { 
        this.loaiNha= loaiNha; 
    }
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
     @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Loại Nhà");
        choose = sc.nextInt();
        switch (choose) {
            case 0:
                loaiNha = "cao cấp";
                break;
            case 1: 
                loaiNha = "thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ.");
                break;
        }
        System.out.println("Đía Chỉ");
        diaChi=sc.nextLine();

    }
    @Override
    public String toString() {
        return super.toString() + ", loại nhà: " + this.loaiNha + ", địa chỉ: " + this.diaChi;
    }
}

