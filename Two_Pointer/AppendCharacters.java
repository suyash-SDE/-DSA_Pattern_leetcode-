import java.util.Scanner;

public class AppendCharacters {
    public static int appendCharacters(String s, String t){
        int i=0,j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                i++;
            }else{
                i++;
            }
        }
        return t.length()-j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        int result = appendCharacters(s, t);
        System.out.println("Characters to append: " + result);

        sc.close();
    }
}
