package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by andrew on 01.04.16.
 */
public class CesarEncryptionFile {public static void main(String[] args) {
    String input;
    int key;
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите текст:"+" ");
    input=sc.nextLine();
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Введите ключ:"+" ");
    key=sc1.nextInt();
    RussianCesarEncrypt rusces= new RussianCesarEncrypt();
    String output=rusces.encrypt(input,key);
    try (FileWriter writer = new FileWriter("/home/andrew/Завантаження/homework9.txt", false)) {
        String text = output;
        writer.write(output);
    } catch (IOException ex) {

        System.out.println(ex.getMessage());
    }
}
}
