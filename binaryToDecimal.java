
import java.util.Scanner;

public class binaryToDecimal {

    Scanner sc = new Scanner(System.in);

    int binaryNu;
    int decimalNu = 0;

    public int input(){
        return binaryNu = sc.nextInt();
    }

    public int b2d(int y){
        
        int i=1;
        int reminder;
        
        while(true){
            reminder = binaryNu % 10 ;
            decimalNu += reminder*i;
            binaryNu = binaryNu/10;
            i = i*2;
            
            if(binaryNu==0)
                break;
        }
        
        return decimalNu;
    }
    
    public int output(){
        System.out.println("Decimal number = " + decimalNu + "\n");
        return decimalNu;
    }
}