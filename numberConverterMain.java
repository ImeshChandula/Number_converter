
import java.util.Scanner;

public class numberConverterMain {
    
    static Scanner sc = new Scanner(System.in);

    static decimalToBinary obj1 = new decimalToBinary();
    static decimalToOcta obj2 = new decimalToOcta();
    static binaryToDecimal obj4 = new binaryToDecimal();
    static octaToDecimal obj5 = new octaToDecimal();


    public static void main(String []args){

        int x = selectMethod();
        
        if(x==1){
            System.out.print("Enter the Decimal number : ");
            int a = obj1.input();
            obj1.d2b(a);
            obj1.output();
        }
        else if(x==2){
            System.out.print("Enter the Decimal number : ");
            int b = obj2.input();
            obj2.d2o(b);
            obj2.output();
        }
        else if(x==4){
            System.out.print("Enter the Binary number : ");
            int d = obj4.input();
            obj4.b2d(d);
            obj4.output();
        }
        else if(x==5){
            System.out.print("Enter the octal number : ");
            int e = obj5.input();
            obj5.o2d(e);
            obj5.output();
        }
        /*else if(x==7){
            System.out.print("Enter the Binary number : ");
            binaryIntoOctal();
        }*/

    }

    static int meNu;

    public static int selectMethod(){
        System.out.println("Decimal into Binary => 1");
        System.out.println("Decimal into Octa => 2");
        //System.out.println("Decimal into Hexa => 3");
        System.out.println("Binary into decimal => 4");
        System.out.println("Octa into decimal => 5");
        //System.out.println("Hexa into decimal => 6");
        //System.out.println("Binary into octa => 7");
        //System.out.println("Binary into hexa => 8");
        //System.out.println("Octa into hexa => 9");
        //System.out.println("Octa into binary => 10");
        //System.out.println("Hexa into binary => 11");
        //System.out.println("Hexa into octa => 12");
        
        System.out.print("\nWhich method do you want to run : ");
        meNu = sc.nextInt();
        System.out.println(" ");
        
        return meNu;
    }

    public static void binaryIntoOctal(){

        int f = obj4.input();
        int j = obj4.b2d(f);
        obj2.d2o(j);
        obj2.output();
    }
}
