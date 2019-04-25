package javaapplication1;

import java.util.ArrayList;

public class LocationCounter {
    private static LocationCounter LC;
    public ArrayList<String> Locations;
    // Integer.parseInt(sHex,16)
    int pc=0;

    private LocationCounter(){
        Locations = new ArrayList<>();
    }

    public static LocationCounter getInstance(){
        if (LC == null){
            LC = new LocationCounter();
        }
        return LC;
    }


    public void LocationCalculator(int AddedAmount)
    {
        int temp=Integer.parseInt(Locations.get(pc),16);
        temp=temp+AddedAmount;
        Locations.add(Integer.toHexString(temp));
        pc++;
    }

    public void getStartingLocation(String operand)
    {
        Locations.add(operand);
        // i is starting with 1 anyways so first location in the code is 0

    }

    public String printingLocation(int i)
    {
        i++;
        return Locations.get(i-1);
    }
}
