package ReaderFile;

import java.io.IOException;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class RussianCesarEncryptNew {
    public String encrypt(String s, int key) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Я')
            {
                int t1=t-'А'+key;
                t1=t1%33;
                sb.append((char)(t1+'А'));
            }
            else if(t>='а' && t<='я')
            {
                int t1=t-'а'+key;
                t1=t1%33;
                sb.append((char)(t1+'а'));
            }
        }
        return sb.toString();
    }
}
