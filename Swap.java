
import java.util.Scanner;

//Swapping 2 numbers without using temp Variable....ACHALA Question...

class Swap{
    public static void main(String[] args) {
        
        int a;
        int b;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        a = scn.nextInt();

        System.out.println("Enter the value of b:");
        b = scn.nextInt();

        System.out.println("Before Swapping:\n a = " + a +" b = "+b);

        a = a + b;       //a = 5 + 10 =15
        b = a - b;      //b= 15 - 10 = 5
        a = a - b;     //a = 15 - 5 = 10

        System.out.println("After Swapping:\n a = "+a +" b = "+b );


    }


}