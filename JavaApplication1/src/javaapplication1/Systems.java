/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template javaapplication1.file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Systems {

    public static void main(String[] args) throws FileNotFoundException {
        Data d = new Data();
        String test = "         ADDR    X";
        assembler a = new assembler();
        a.handleInstruction(test,d);


        
    }
    
}
