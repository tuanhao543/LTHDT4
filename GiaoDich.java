
package gdnd;

import java.util.Scanner;


public class GiaoDich {
    
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    public GiaoDich()
    {

    }
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, Long donGia,Float dienTich)
    {
        this.maGiaoDich= maGiaoDich;
        this.ngayGiaoDich= ngayGiaoDich;
        this.donGia= donGia;
        this.dienTich= dienTich;
    }
    public String getMaGiaoDich() { 
        return maGiaoDich; 
    } 
     
    public void setMaGiaoDich( String maGiaoDich ) 
    { 
        this.maGiaoDich= maGiaoDich; 
    }
    public String getNgayGiaoDich() { 
        return ngayGiaoDich; 
    } 
 
    public void setNgayGiaoDich(String ngayGiaoDich) 
    { 
        this.ngayGiaoDich= ngayGiaoDich; 
    } 
     
    public Long getDonGia() { 
        return donGia; 
    } 
 
    public void setDonGia(Long donGia) 
    { 
        this.donGia= donGia; 
    } 
    public Float getDienTich() { 
        return dienTich; 
    } 
 
    public void setDienTich(Float dienTich) 
    { 
        this.dienTich= dienTich; 
    }
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ma Giao Dich");
        maGiaoDich=sc.nextLine();
        System.out.println("Ngày Giao Dich");
        ngayGiaoDich=sc.nextLine();
        System.out.println("Đơn Giá");
        donGia=sc.nextLong();
        System.out.println("Diện Tích");
        dienTich=sc.nextFloat();

    }
   @Override
    public String toString() {
        return "Mã giao dịch: " + this.maGiaoDich + ", ngày giao dịch: " + this.ngayGiaoDich + 
            ", đơn giá: " + this.donGia + ", diện tích: " + this.dienTich;
    }
    
}


