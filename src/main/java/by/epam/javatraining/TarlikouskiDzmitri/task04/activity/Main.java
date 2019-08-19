package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.regex.*;

public class Main {
    public static void main(String []args) {

        TakeListFromFile takeListFromFile = new TakeListFromFile();

        ArrayList<String> str = takeListFromFile.importText("./src/main/resources/Resource.txt");


    }
}
