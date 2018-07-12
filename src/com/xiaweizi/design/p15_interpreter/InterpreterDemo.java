package com.xiaweizi.design.p15_interpreter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p15_interpreter.InterpreterDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class InterpreterDemo {
    private static Expression getMaleExpression() {
        Expression rebert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(rebert, john);
    }

    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("john is male?" + isMale.interpret("John"));
        System.out.println("julie is a married women?" + isMarriedWoman.interpret("married julie"));
    }
}
