
import java.util.Scanner;

public class decimalToOcta {

    Scanner sc = new Scanner(System.in);
    
    int i=0;
    int decimalNum;
    int octa[] = new int[100];
    
    public int input(){
        //System.out.print("Enter the Decimal number : ");
        return decimalNum = sc.nextInt();
    }
    
    public int d2o(int y){
        
        while(true){
            octa[i] = decimalNum%8;
            decimalNum = decimalNum/8;
            i++;
            if(decimalNum==0)
                break;
        }
        
        return octa[i];
    }
    
    public void output(){
        System.out.print("Octa number = ");
        for(int j=i-1; j>=0; j--)
            System.out.print(octa[j]);
        
        System.out.println("");
    }
    
}
