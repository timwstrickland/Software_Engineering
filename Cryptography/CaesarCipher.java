
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.FileResource;
import java.lang.*;

public class CaesarCipher {
    public String encrypt(String input, int key) {
        String UpperInput = input.toUpperCase();
        StringBuilder encrypted = new StringBuilder(UpperInput);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if(idx != -1) {
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
        StringBuilder finalEncrypt = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                finalEncrypt.append(encrypted.charAt(i));
            }
            else {
                char newChar = Character.toLowerCase(encrypted.charAt(i));
                finalEncrypt.append(newChar);
            }
        }
        return finalEncrypt.toString();
    }
    
    public String encryptTwoKeys(String input, int key1, int key2) {
        String UpperInput = input.toUpperCase();
        StringBuilder encrypted = new StringBuilder(UpperInput);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if(idx != -1) {
                
                if (i % 2 == 0 || i == 0) {
                    char newChar = shiftedAlphabet1.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
                else if (i % 2 != 0 && i != 0) {
                    char newChar = shiftedAlphabet2.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        StringBuilder finalEncrypt = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                finalEncrypt.append(encrypted.charAt(i));
            }
            else {
                char newChar = Character.toLowerCase(encrypted.charAt(i));
                finalEncrypt.append(newChar);
            }
        }
        return finalEncrypt.toString();
    }
    
    public void testCaesar() {
        //int key = 23;
        //int key = 17;
        int key1 = 23;
        int key2 = 17;
        //FileResource fr = new FileResource();
        //String message = fr.asString();
        //String message = "FIRST LEGION ATTACK EAST FLANK!";
        String message = "My Name is Timothy Strickland";
        //String encrypted = encrypt(message, key);
        String encryptedMessage = encryptTwoKeys(message, key1, key2);
        System.out.println(encryptedMessage);
        // Should print out "Czojq Ivdzle"
        String decryptedMessage = encryptTwoKeys(encryptedMessage, 26-key1, 26-key2);
        System.out.println(decryptedMessage);
        // Should print out "First Legion"
    }
}
