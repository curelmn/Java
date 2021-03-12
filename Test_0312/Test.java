package Test_0321;

import java.util.Stack;

public class Test {
    public boolean isValid(String s) {
        // 首先需要创建一个栈. (最好不要自己写栈)
        Stack<Character> stack = new Stack<>();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 如果遇到左括号, 就需要入栈
            // '(' 和 "("
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            // 右括号的情况了(题目中要求了字符串只包含括号, 没有其他字符)
            // 取栈顶元素和当前的括号进行匹配
            // 标准库的 Stack, 在针对空栈进行 peek 的时候会直接抛异常.
            if (stack.isEmpty()) {
                return false;
            }
            // 此处直接使用 pop, 把栈顶元素出栈. 一旦匹配的情况, 就直接 continue 进入下次循环就好了.
            Character top = stack.pop();
            if (top == '(' && c == ')') {
                continue;
            }
            if (top == '[' && c == ']') {
                continue;
            }
            if (top == '{' && c == '}') {
                continue;
            }
            // 如果没有触发到上面的三种合法情况, 此时就认为是非法情况, 就直接返回 false
            return false;
        }
        // 循环结束, 说明字符串就遍历完了.
        // 还需要判定一下, 栈是否为空.
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
