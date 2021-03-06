package Encryption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 31.03.2016.
 */
public class RussianCesarDecrypt {
    List<Character> alphabet = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    RussianCesarDecrypt() {
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }}
        public String decrypt(String text, int k){
            StringBuilder newText = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                int index = alphabet.indexOf(c);
                index = (index - k);
                newText.append(alphabet.get(index));
            }
            return newText.toString();
        }
}
