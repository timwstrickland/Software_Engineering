
/**
 * Write a description of Wordplay here.
 * 
 * Author: Timothy Strickland
 * @version 1
 */
import java.util.*;
public class Wordplay {
    public boolean isVowel (char ch) {
        // This method checks to see if the paramter passed in is a vowel or not.
        boolean vowelCheck = false;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
            vowelCheck = true;
        }
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            vowelCheck = true;
        }
        return vowelCheck;     
    }
    
    public String replaceVowels (String phrase, char ch) {
        // This method replaces all vowels with the character that is passed in.
        char[] stringToChar = new char[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            if(isVowel(phrase.charAt(i)) == true) {
                stringToChar[i] = ch;
            }
            else {
                stringToChar[i] = phrase.charAt(i);
            }
        }
        String charString = String.valueOf(stringToChar);
        return charString;
    }
    
    public String emphasize (String phrase, char ch) {
        // This method only replaces the phrase with the character passed in with a * if its odd, and + if its even.
        // Depending on the location of the location.
        char[] stringToChar = new char[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == Character.toUpperCase(ch) || phrase.charAt(i) == Character.toLowerCase(ch))  {
                if(i % 2 == 0 || i == 0) {
                    stringToChar[i] = '*';
                }
                else {
                    stringToChar[i] = '+';
                }
            }
            else {
                stringToChar[i] = phrase.charAt(i);
            }
        }
        String charString = String.valueOf(stringToChar);
        return charString;
    }
    
    public void testIsVowel() {
        System.out.println(isVowel('f'));
        // should return false
        System.out.println(isVowel('A'));
        // should return true
        System.out.println(isVowel('o'));
        // should return true
        System.out.println(isVowel('S'));
        // should return false
    }
    
    public void testReplaceVowels() {
        String testString = replaceVowels("Hello World", '*');
        //this should return H*ll* W*rld
        System.out.println(testString);
    }
    
    public void testEmphasize() {
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
        // Should return "M+ry Bell+ +br*c*d*br+"
    }
}
