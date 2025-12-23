
import java.util.Scanner;

class ValidPalindrome{
    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;

        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }

            //compare character ignoring case 
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        ValidPalindrome vp = new ValidPalindrome();
        boolean result = vp.isPalindrome(input);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}

//A man, a plan, a canal: Panama
//Is Palindrome? true
