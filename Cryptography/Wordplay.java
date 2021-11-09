
/**
 * Write a description of Wordplay here.
 * 
 * Author: Timothy Strickland
 * @version 1
 */
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
}
