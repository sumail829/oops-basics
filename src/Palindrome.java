import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        String pal=scanner.next();
        System.out.println(pal);
        int newPal=Integer.parseInt(pal);
        int orignal=newPal;
        int reverse=0;
        while(newPal>0){
            int original=newPal;
            int digit=newPal%10;
           reverse= reverse*10+digit;
            newPal=newPal/10;


        }
        System.out.println(reverse);
        if(reverse==orignal){
            System.out.println("Its the palindrome");
        }else{
            System.out.println("Its not");
        }

    }
}