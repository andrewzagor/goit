package ReaderFile;

import java.io.IOException;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */

public class RussianCesarDecryptNew {
    public String decrypt(String s, int key) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='А' && t<='Я')
            {
                int t1=t-'А'-key;
                if(t1<0)t1=33+t1;
                sb.append((char)(t1+'А'));
            }
            else if(t>='а' && t<='я')
            {
                int t1=t-'а'-key;
                if(t1<0)t1=33+t1;
                sb.append((char)(t1+'а'));
            }
        }
        return sb.toString();
    }
}
