package javaapplication1;

import java.util.HashMap;

public class Directives {
    String name;
    String operands;
    int format;

    public void setFormat(int format) {
        this.format = format;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperands(String operands) {
        this.operands = operands;
    }

    public Directives(String name, String operands,int format) {
        this.name = name;
        this.operands = operands;
        this.format=format;
    }
}
