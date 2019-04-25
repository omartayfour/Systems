package javaapplication1;

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class file {


public void filePass1() throws FileNotFoundException {
    String currentLine;
    int i = 1;
    LocationCounter l = LocationCounter.getInstance();
    assembler a = new assembler();
    Data d = new Data();
    BufferedReader reader = new BufferedReader(new FileReader("JavaApplication1/src/javaapplication1/src.txt"));


    try {
        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.startsWith(".")) {
                continue;
            } else {
                a.handleInstruction(currentLine, d);
            }
        }
    }
    catch (IOException e){
        e.printStackTrace();
    }
}
        }
