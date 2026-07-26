import java.util.Scanner;
import java.util.Arrays;

public class ReverseWord{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence to reverese a word");
        String s=scanner.nextLine();
        System.out.println("Enter the word to reverse:");
        String target = scanner.next();

        String[] reverse=s.split("\\s+");
        System.out.println(Arrays.toString(reverse));
        for(int i=0;i<reverse.length;i++) {

            if (reverse[i].equals(target)) {
               reverse[i]=new StringBuilder(reverse[i]).reverse().toString();

            }

        }
        for (String word : reverse) {
            System.out.print(word + " ");
        }

    }
}