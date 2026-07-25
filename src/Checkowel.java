import java.util.Scanner;

public class Checkowel{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entert the letter to check vowels");
        String s = scanner.next().toLowerCase();
        System.out.println(s);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='o'|| arr[i]=='i'||arr[i]=='u'){
                System.out.print("Its vowel:");
                System.out.println(arr[i] + " ");
            }else{
                System.out.println("Its not vowel");
            }
        }
    }
}