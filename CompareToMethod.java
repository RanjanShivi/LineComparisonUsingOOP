package com;

public class CompareToMethod {

    public int compareToMethod(Integer lengthOfLine1, Integer lengthOfLine2) {

        System.out.println("Compare To Method Result:");
        int res = lengthOfLine1.compareTo(lengthOfLine2);

        if(res > 0)
            return 1;
        else if(res < 0)
            return 2;
        else
            return 0;

    }
}

