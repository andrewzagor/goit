package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by andrew on 01.04.16.
 */
public class CesarDescryptionFile {
    public static void main(String[] args) {
        String input;
        int key;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите ключ:"+" ");
        key=sc1.nextInt();
        File f=new File("/home/andrew/Завантаження/homework9.txt");
        try(FileReader reader = new FileReader(f))
        {
            char[] buffer = new char[(int)f.length()];
            reader.read(buffer);
            RussianCesarDecrypt rusces1= new RussianCesarDecrypt();
            System.out.println("Расшифрованный текст из файла:"+" "+rusces1.decrypt(new String(buffer),key));
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

}}
