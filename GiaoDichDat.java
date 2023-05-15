
package gdnd;

import java.util.Scanner;


public class GiaoDichDat extends GiaoDich{
    
    private String loaiDat;
    public GiaoDichDat()
    {

    }
    public GiaoDichDat(String loaiDat, String maGiaoDich, String ngayGiaoDich, Long donGia,Float dienTich)
    {
        super( maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat= loaiDat;
        
    }
    public String getLoaiDat() { 
        return loaiDat; 
    } 
     
    public void setLoaiDat( String loaiDat ) 
    { 
        this.loaiDat= loaiDat; 
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Loại Đất");
        loaiDat=sc.nextLine();
        

    }
    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.loaiDat;
    }

    
}


