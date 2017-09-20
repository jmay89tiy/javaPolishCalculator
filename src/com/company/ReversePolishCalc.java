package com.company;

public class ReversePolishCalc {

        public int keepTrackOfStack = 0;
        // You'll need a variable here to keep track of the top of the stack


        private String[] tokens;
        // The array of the input string split up
        // each number or operator in the string becomes a token
        // the first array


        private String[] stack;
        // The stack
        // the second array

        public double calculate(String input) {

            // 1. Use the String split method to split the string into tokens at the commas
            tokens = input.split(",");


            // 2. Allocate a stack as big as the number of tokens
            stack =  new String [tokens.length];

            // 3. write the algorithm
            for(int i = 0; i < tokens.length; ++i) {
                if (tokens[i].equals("+")|| tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                    double numOne = pop();
                    double numTwo = pop();
                    if(tokens[i].equals("+")){
                        push(numOne + numTwo);
                    } else if (tokens[i].equals("-")){
                        push(numTwo - numOne);
                    } else if (tokens[i].equals("/")) {
                        push(numTwo / numOne);
                    } else if (tokens[i].equals("*")) {
                        push(numOne * numTwo);
                    }
                    } else {
                        push(tokens[i]);
                }
            }
                // 4. return the result
                return pop();
        }

        private void push(String number) {
                stack[keepTrackOfStack]=number;
                keepTrackOfStack += 1;
            // write a code that adds the operand to the stack

        }

        private void push(double d) {
            String temporary = Double.toString(d);
            stack[keepTrackOfStack] = temporary;
            keepTrackOfStack +=1;
            // change the double to a string and then push it on the stack
        }

        private double pop() {
            double parseNum = Double.parseDouble(stack[keepTrackOfStack -1]);
            //double.parseDouble converts from a string to a double, saved as a double variable
                keepTrackOfStack -= 1;
                return parseNum;
            // remove the string from the top of the stack and convert it to a double and return it
        }
    }


