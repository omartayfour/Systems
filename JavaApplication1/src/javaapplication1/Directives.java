package javaapplication1;

import java.util.HashMap;

public class Directives {
    private String name;
    private String operands;

    public void setName(String name) {
        this.name = name;
    }

    public void setOperands(String operands) {
        this.operands = operands;
    }

    public Directives(String name, String operands) {
        this.name = name;
        this.operands = operands;
    }
}
