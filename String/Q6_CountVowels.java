package String;

import java.util.Scanner;

public class Q6_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String  you  want to  count the vowels : ");
        String str = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonents++;
            }
        }
        System.out.println("Vowels : "+ vowels  +  "  consonets : "+consonents);
    }
    
}
