package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.validation.Validation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class takeListFromFile {
    public static void Import(String path) {

        String expText = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("Resources.txt"))){
            String str;
            while ((str=reader.readLine())!=null) {
 //               expText=expText + Validation.validation(str); нужен метод, для добавления в список
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
