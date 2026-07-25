import java.util.Scanner;

public class FrequencyChar{
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word to find the number of character");
        String s=scanner.next();
        System.out.println("Enter the character u want to find the frequency of");
        char m = scanner.next().charAt(0);
        char[] word=s.toCharArray();
        int count=0;
        for(int i=0;i< word.length;i++){

            if(word[i]==m){
                count++;
            }

        }
        System.out.println("The frequency of '" + m + "' is: " + count);

    }
}