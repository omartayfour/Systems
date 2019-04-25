package javaapplication1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template javaapplication1.file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BCC
 */
public class instruction {
    String address;
    String operand;
    String operation;
    String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
}
