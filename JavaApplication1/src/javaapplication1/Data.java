package javaapplication1;

import java.util.HashMap;

public class Data {
     static HashMap<String, op> optable = new HashMap<String, op>();
     static HashMap<String, Label> symtable= new HashMap<String, Label>();
     private static HashMap<String, Directives> dirtable= new HashMap<String, Directives>();

    public final void loadData()
    {
        getOptable().put("RMO",new op("RMO",2,2, "reg"));
        getOptable().put("LDr",new op("LDr",1,3, "mem"));
        getOptable().put("STr",new op("STr",1,3, "mem"));
        getOptable().put("LDCH",new op("LDCH",1,3, "mem"));
        getOptable().put("STCH",new op("STCH",1,3, "mem"));
        getOptable().put("ADD",new op("ADD",1,3, "mem"));
        getOptable().put("SUB",new op("SUB",1,3, "mem"));
        getOptable().put("ADDR",new op("ADDR",2,3, "reg"));
        getOptable().put("SUBR",new op("SUBR",2,2, "reg"));
        getOptable().put("COMP",new op("COMP",1,3, "mem"));
        getOptable().put("COMR",new op("COMR",2,2, "reg"));
        getOptable().put("J",new op("J",1,3, "mem"));
        getOptable().put("JEQ",new op("JEQ",1,3, "mem"));
        getOptable().put("JLT",new op("JLT",1,3, "mem"));
        getOptable().put("JGT",new op("JGT",1,3, "mem"));
        getOptable().put("TIX",new op("TIX",1,3, "mem"));
        getOptable().put("TIXR",new op("TIXR",1,2, "reg"));



        getDirtable().put("START", new Directives("START", "0"));
        getDirtable().put("ORG", new Directives("ORG","0"));
        getDirtable().put("END",new Directives("END","0"));
        getDirtable().put("BYTE",new Directives("BYTE","0"));

    }

    public static HashMap<String, op> getOptable() {
        return optable;
    }

    public static void setOptable(HashMap<String, op> optable) {
        Data.optable = optable;
    }

    public static HashMap<String, Label> getSymtable() {
        return symtable;
    }

    public static void setSymtable(HashMap<String, Label> symtable) {
        Data.symtable = symtable;
    }

    public static HashMap<String, Directives> getDirtable() {
        return dirtable;
    }

    public static void setDirtable(HashMap<String, Directives> dirtable) {
        Data.dirtable = dirtable;
    }
}
