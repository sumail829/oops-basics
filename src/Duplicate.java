import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the words to remove duplicate character");
        String s=scanner.next();
        char[] word=s.toCharArray();
        int count=0;
        for(int i=0;i<word.length;i++){
            boolean duplicate = false;
            for(int j=0;j<i;j++){
                if(word[i]==word[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(word[i]);
            }
        }
    }
}
//programming