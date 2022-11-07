
import java.util.Scanner;

public class decimalToBinary {

    Scanner sc = new Scanner(System.in);
    
    int i=0;
    int decimalNum;
    int binary[] = new int[100];

    public int input(){
        //System.out.print("Enter the Decimal number : ");
        return decimalNum = sc.nextInt();
    }
    
    public int d2b(int y){
        
        while(true){
            binary[i] = decimalNum%2;
            decimalNum = decimalNum/2;
            i++;
            if(decimalNum==0)
                break;
        }
        
        return binary[i];
    }
    
    public void output(){
        System.out.print("Binary number = ");
        for(int j=i-1; j>=0; j--)
            System.out.print(binary[j]);
        
        System.out.println("");
    }
    
}
