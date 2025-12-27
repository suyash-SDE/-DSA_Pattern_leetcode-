import java.util.Scanner;
public class ValidWordAbbreviation  {
    
    public boolean validWordAbbreviation(String word, String abbr){
        int i=0, j=0;
        while(i<word.length() && j < abbr.length()){
            char a_c = abbr.charAt(j);

            if(Character.isDigit(a_c)){
                if(a_c == '0'){
                    return false;
                }

                int curr =0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    curr = curr * 10 +(abbr.charAt(j)-'0');
                    j++;
                }
                i += curr;
            }else{
                if(word.charAt(i) != a_c) return false;
                i++;
                j++;
            }
        }
        return i == word.length() && j== abbr.length();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        System.out.println("Enter abbreviation: "); 
        String abbr = sc.nextLine();

        ValidWordAbbreviation vwa = new ValidWordAbbreviation();
        System.out.println("Valid Abbreviation? " + vwa.validWordAbbreviation(word, abbr));
        sc.close();
    }
}
