package edu.neu.mseg;

import java.util.ArrayList;

public class lab1 {
    public static void main( String[] args ){
        // lab 1 part 1 - Array
        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 100;
        x[4] = 200;
        y[0] = 100;
        y[1] = 200;
        y[2] = 300;
        y[3] = 1;
        y[4] = 2;
        String outputX = "Array x = {";
        String outputY = "Array y = {";
        String outputZ = "Array z = {";
        for (int i = 0; i<5; i++){
            z[i] = Math.max(x[i], y[i]);
            outputX += x[i] + ";";
            outputY += y[i] + ";";
            outputZ += z[i] + ";";
        }
        outputX += "}";
        outputY += "}";
        outputZ += "}";
        System.out.println(outputX);
        System.out.println(outputY);
        System.out.println(outputZ);

        // lab 1 part 2 - ArrayList
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesSwitched = new ArrayList<>();
        names.add("Tom");
        names.add("Jack");
        names.add("Jane");
        names.add("Talia");
        names.add("Joe");
        System.out.println(names.get(0).charAt(0));
        String outputOrigin = "Names = {";
        String outputSwitched = "Names(switched) = {";
        for (int i =0; i<5; i++){
            String name = names.get(i);
            int nameLength = name.length();
            char firstChar = name.charAt(0);
            char lastChar = name.charAt(nameLength - 1);
            char lastCharUpdated = Character.toLowerCase(firstChar);
            char firstCharUpdated = Character.toUpperCase(lastChar);
            String nameSwitched;
            nameSwitched = firstCharUpdated + name.substring(1, nameLength-1)+ lastCharUpdated;
            namesSwitched.add(nameSwitched);
            outputOrigin += name + ";";
            outputSwitched += nameSwitched+";";
        }
        outputOrigin +="}";
        outputSwitched +="}";
        System.out.println(outputOrigin);
        System.out.println(outputSwitched);
    }
}
