import java.util.Scanner;

public class Anagram{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Check anagram");
        String firstLetter=scanner.next();
        String secondLetter=scanner.next();
        char[] firstWord=firstLetter.toCharArray();
        char[] secondWord=secondLetter.toCharArray();
        if(firstWord.length!=secondWord.length){
            System.out.println("Not a a anagram");
        }

        int[] count=new int[26];

        for(int i=0;i<firstWord.length;i++){
            count[firstWord[i]-'a']++;
            count[secondWord[i]-'a']--;
        }

        boolean isAnagram=true;

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                isAnagram=false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("itss an anagram");
        }else{
            System.out.println("Not an anagram");
        }

    }
}