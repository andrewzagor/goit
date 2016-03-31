package Encryption;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 31.03.2016.
 */
public class CesarEncryption {
    public static void main(String[] args) {
        String input;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:"+" ");
        input=sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите ключ:"+" ");
        key=sc1.nextInt();
        RussianCesarEncrypt rusces= new RussianCesarEncrypt();
        System.out.println("Зашифрованный текст:"+" "+rusces.encrypt(input,key));
    }
}




