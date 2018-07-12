package com.xiaweizi.design.p15_interpreter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p15_interpreter.TerminalExpression
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
