
import java.util.Scanner;

public class octaToDecimal {
    
    Scanner sc = new Scanner(System.in);

    int octalNu;
    int decimalNu = 0;

    public int input(){
        return octalNu = sc.nextInt();
    }

    public int o2d(int y){
        
        int i=1;
        int reminder;
        
        while(true){
            reminder = octalNu % 10 ;
            decimalNu += reminder*i;
            octalNu = octalNu/10;
            i = i*8;
            
            if(octalNu==0)
                break;
        }
        
        return decimalNu;
    }
    
    public int output(){
        System.out.println("Decimal number = " + decimalNu + "\n");
        return decimalNu;
    }

}
