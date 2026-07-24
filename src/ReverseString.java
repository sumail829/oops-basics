import java.util.Scanner;


public class ReverseString{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String s=scanner.nextLine();
        System.out.println(s);
        char[] rev=s.toCharArray();
        System.out.println(rev);
        for(int i=rev.length-1;i>=0;i--){
            System.out.print(rev[i]);
        }
        System.out.println(" ");
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}