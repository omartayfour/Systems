package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template javaapplication1.file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BCC
 */
public class assembler {

     ArrayList<instruction> array = new ArrayList<instruction>();
    String operation;
    String operands;
    String label;
     String CurrentLoc;


    public void handleInstruction(String currentLine, Data d) throws FileNotFoundException{
        String garbage;
        String[] middlepart;
        String [] operationsRead;
        int i=0;
        int OperandCount;
        int cOffset;
        errors e = new errors();
        int state;//operation checker

        label=currentLine.substring(0,8);

        //if (!(label.startsWith(" ")))
        operation=currentLine.substring(9,16);
        middlepart=operation.split(" "); // taking part before spaces only
        operation=middlepart[0];

        if(currentLine.length()>=16){
            operands=currentLine.substring(17,30);
        // checking operands w kda
        }
        else {

        }





        //for directives
  /*String address=array.get(0).getOperand(); //ex prog 1000 ,here 1000 is the operand and starting adress for the next instr as well
    for(int i=1;i<array.size();i++){
        javaapplication1.instruction x=array.get(i);
        x.setAddress(address);
        String javaapplication1.op=x.operation;
        if(optable.get(javaapplication1.op)!=null) //operation found in the optable
        {   File f=new File("operation.txt");
    Scanner sc=new Scanner(f); 
    while(sc.hasNext()){
        String name=sc.next();
        String opcode=sc.next();
        String format=sc.next();
        if(javaapplication1.op.equals(name)){
        if(format.equals(1))
            address+=1;
        else if (format.equals(2))
            address+=2;
         else if (format.equals(3))
              address+=3;
         else if(format.equals(4))
             address+=4;
                     }
        }}
        else {
        if(x.getOperation().equals("BYTE")){
            int value;
            if(x.getOperand().startsWith("X'"))
                value=(x.getOperand().length()-3)/2; // "-3 "to remove 'x'(3 characters) 
            else if(x.getOperand().startsWith("C'"))
                value=(x.getOperand().length()-3);
        }
        else if(x.getOperation().equals("WORD")){
            int value=Integer.parseInt(x.getOperand());}
        
        else if(x.getOperation().equals("RESW")){
           int value=Integer.parseInt(x.getOperand());
           value=3*value;
        }
        else if(x.getOperation().equals("RESB")){
           int value=Integer.parseInt(x.getOperand());}
        
        }
        if(!x.getLabel().trim().equals("")){
        symbtable.put(x.getLabel(), x.getAddress());
    }
    
    }
    
    }*/}}