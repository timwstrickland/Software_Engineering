
/**
 * Write a description of Wordplay here.
 * 
 * Author: Timothy Strickland
 * @version 1
 */
import java.util.*;
public class Wordplay {
    public boolean isVowel (char ch) {
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
}
