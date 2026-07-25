import java.util.Scanner;

public class Anagram{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Check anagram");
        String firstLetter=scanner.next();
        String secondLetter=scanner.next();
        char[] firstWord=firstLetter.toCharArray();
        char[] secondWord=secondLetter.toCharArray();
        for(int i=0;i<firstWord.length;i++){
            for(int j=0;j<secondWord.length;j++){
                if(firstWord[i]==secondWord[j]){

                }
            }
        }
    }
}