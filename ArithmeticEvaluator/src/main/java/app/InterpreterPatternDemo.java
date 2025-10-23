/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import interpreter.Expression;
import interpreter.NumberExpression;
import operations.AddExpression;
import operations.MultiplyExpression;
import operations.SubtractExpression;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        // Expression: 5 + 3 * 2  => 5 + (3*2) = 11
        Expression expr1 = new AddExpression(
                new NumberExpression(5),
                new MultiplyExpression(
                        new NumberExpression(3),
                        new NumberExpression(2)
                )
        );
        System.out.println("5 + 3 * 2 = " + expr1.interpret());

        // Expression: (4 + 6) - 2  => 10 - 2 = 8
        Expression expr2 = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(4),
                        new NumberExpression(6)
                ),
                new NumberExpression(2)
        );
        System.out.println("(4 + 6) - 2 = " + expr2.interpret());
    }
}

