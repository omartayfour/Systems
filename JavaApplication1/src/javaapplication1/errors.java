package javaapplication1;

import java.util.HashMap;

public final class errors {
    private final static String[] errorsList= new String[13];
    static int OperandCount;

private static void errorPrinter(){
    errorsList[0]="misplaced label";
    errorsList[1]="missing or misplaced operation mnemonic";
    errorsList[2]="missing or misplaced operand field";
    errorsList[3]="duplicate label definition";
    errorsList[4]="this statement can't have label";
    errorsList[5]="this statement can't have operand";
    errorsList[6]="wrong g operation prefix";
    errorsList[7]="unrecognized operation code";
    errorsList[8]="undefined symbol in operand";
    errorsList[9]="not a hexadecimal string";
    errorsList[10]="can't be format 4 javaapplication1.instruction";
    errorsList[11]="illegal address for register";
    errorsList[12]="missing end statement";
}

public int checkOperation(String operation, Data d)
{
    if(!d.optable.containsKey(operation) && !d.getDirtable().containsKey(operation)) // error number 7
    {
        System.out.println("error instruction not known"); //fel error handling part hena fi error
        return 0;

    }
    else {
        if (d.optable.containsKey(operation)) {
            System.out.println("instruction " + operation);
            return d.optable.get(operation).format;
        }else
            return 1;// if return 1, then it's a directive
    }
}


public void errorCheckerDirectives(String operation,String operands, Data d)
{


    if(!operands.matches("[0-9]+")) // error number5
        System.out.println("error this can't contain operand");







}
public void errorCheckerOperands(String operation, String operands, Data d) // not directive
{
    if(operands.contains(","))
        OperandCount=2;
    else
        OperandCount=1;
    if(d.optable.get(operation).operands!=OperandCount)
        System.out.println("error not right number of operands"); // error handle the number  of operands

}

private static int errorCheckThree(HashMap<String, String> hashMap,String label){
    if (hashMap.containsKey(label)){
        System.out.println("javaapplication1.Label '"+label+"' was already used.");

    }
    return 0;
}

}