import java.util.Scanner;
import java.util.Arrays;
public class LongestWord{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String s=scanner.nextLine();
        String[] sentence=s.split("\\s+");
        System.out.println(Arrays.toString(sentence));
        int maxLength=0;
        String LongestWord="";
        for(int i=0;i<sentence.length;i++){

            int a=sentence[i].length();
            if(a>maxLength){
                maxLength=a;
                LongestWord=sentence[i];
            }
        }
        System.out.println("Longest word:"+LongestWord);
        System.out.println("length:"+maxLength);
    }
}