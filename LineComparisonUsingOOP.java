package com;

public class LineComparisonUsingOOP {
    public static void main(String[] args) {

        LengthOfLine line = new LengthOfLine();
        double lengthOfLine1 = line.computeLength();
        System.out.println("Length of line-1 =" + lengthOfLine1);

        double lengthOfLine2 = line.computeLength();
        System.out.println("Length of line-2 =" + lengthOfLine2);

        EqualMethod equal = new EqualMethod();
        boolean result = equal.equalMethod( lengthOfLine1, lengthOfLine2);
        if(result)
            System.out.println("Line-1 and Line-2 are equal");
         else
            System.out.println("Line-1 and Line-2 are not equal");

        CompareToMethod compare = new CompareToMethod();
        double resultOfCompare = compare.compareToMethod( lengthOfLine1,lengthOfLine2 );
        if( resultOfCompare == 1 )
            System.out.println("Line-1 is greater then Line-2");
        else if( resultOfCompare == 2 )
            System.out.println("Line-2 is greater then Line-1");
        else
            System.out.println("Both lines are equal");

    }
}
