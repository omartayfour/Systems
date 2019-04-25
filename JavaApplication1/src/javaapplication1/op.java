package javaapplication1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template javaapplication1.file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;


public class op {
    String name;
    int operands;
    int format;
    String optype;

    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public void setOperands(int operands) {
        this.operands = operands;
    }
    public void setoptype(String optype)
    {
        this.optype= optype;
    }

    public op(String name, int operands, int format, String optype) {
        this.name = name;
        this.operands = operands;
        this.format = format;
        this.optype = optype;
    }


 
  

   
}
