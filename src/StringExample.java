import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scanner.nextLine();
        System.out.println(s);
        String regex= Pattern.quote(".");
        String[] ltr=s.split(regex);
                System.out.println(Arrays.toString(ltr));
    }
}