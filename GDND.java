package gdnd;
import java.util.Scanner;
public class GDND {

 
    public static void main(String[] args) {
        
        
        DSGD a= new DSGD();
        
        Scanner sc = new Scanner(System.in);
        int n; 
            
            do { 
                a.menuChinh();              
                n= sc.nextInt(); 
                switch(n)             
                { 
        
         case 1: { 
             
             a.nhapttgdd();
         break;
         }
         
         case 2: { 
             
             a.nhapttgdn();
         
         break;}
         case 3: { 
        a.hienttgdd();
         break;}
         case 4: { 
        a.hienttgdn();
                  break;
}
         case 5: { 
        a.trungbinh();
        break;
         }
         case 6: { 
        
        a.gdd();
         break;}
         case 7: { 
        a.gdn();
    break;}
    
    
}
       }
      while(n!=0); 
            }
}
            
            


