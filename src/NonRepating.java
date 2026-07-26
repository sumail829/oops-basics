import java.util.Scanner;

public class NonRepating{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String s=scanner.next();
        char[] word=s.toCharArray();


        for(int i=0;i<word.length;i++){
            boolean isRepeating=false;
            int count=0;
            for(int j=0;j<word.length;j++){
                if(word[i]==word[j]) {
                    count++;
                }

            }
            if(count==1){
                System.out.println(word[i]);
                return;
            }
        }
    }
}