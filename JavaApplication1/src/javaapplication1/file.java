package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class file {


private static void filePass1() throws FileNotFoundException {
    String operation;
    String label;
    String currentLine;
    String operands;

    File code=new File("src.txt");
    Scanner s=new Scanner(code);
    while(s.hasNext()){
        currentLine=s.nextLine();
        if(s.nextLine().startsWith(".")) {
            continue;
        }



    }}

        }
