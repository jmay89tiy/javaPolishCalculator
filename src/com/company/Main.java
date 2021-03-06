package com.company;

public class Main {

    public static void main(String[] args) {

        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "10.5,5.0,-";
        expectedResult = 5.5;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "10.0,5.0,*";
        expectedResult = 50.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "5.0,1.0,/";
        expectedResult = 5.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

    }

        //DONEZO - Write tests for the other operators (-, *, /)


//         rpnExpression = "5,1,2,+,4,*,+,3,-";
//         expectedResult = 14.0;
//         actualResult = rpn.calculate(rpnExpression);
//         checkResult(rpnExpression, expectedResult, actualResult);
//

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
