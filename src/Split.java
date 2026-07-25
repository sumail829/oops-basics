import java.util.Scanner;

public class Split{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word to split");
        String s=scanner.nextLine();
        String sam=s.trim();
        System.out.println(sam);
    }
}