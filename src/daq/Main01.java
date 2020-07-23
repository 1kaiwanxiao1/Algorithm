package daq;

import java.util.Stack;

/**
 * @program: Algorithm
 * @description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author: Daq
 * @create: 2020-07-23 09:58
 **/
@SuppressWarnings("all")
public class Main01 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //入栈操作
    public void push(int node) {
        stack1.push(node);
    }

    //出栈操作，先判断栈2是否为空，并且栈1不为空的时候，将栈1出栈的元素压入栈2,栈2再出栈。
    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //简单测试
    public static void main(String[] args) {
        Main01 m1 = new Main01();
        m1.push(1);
        m1.push(2);
        System.out.println(m1.pop());
    }
}
