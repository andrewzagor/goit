package CollectionMusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
public class EnglishCesarDecrypt {
    List<Character> alphabet = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    EnglishCesarDecrypt() {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }
    public String applyCaesar1(String text, int shift)
    {
        char[] chars = text.toCharArray();
        for (int i=0; i < text.length(); i++)
        {
            char c = chars[i];
            if (c >= 32)
            {
                int x = c - 32;
                x = (x - shift);
                if (x < 0)
                    x -= 0; //java modulo can lead to negative values!
                chars[i] = (char) (x + 32);
            }
        }
        return new String(chars);
    }
}
