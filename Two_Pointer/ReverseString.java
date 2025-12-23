
import java.util.Scanner;

public class ReverseString {
    public void reverseString(char[] s){
        int i=0, j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(arr);
        System.out.println("Reversed String: " + new String(arr));
        sc.close();


    }
    
}
