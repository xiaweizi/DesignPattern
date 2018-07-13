package com.xiaweizi.design.p23_visitor;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p23_visitor.VisitorPatternDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}