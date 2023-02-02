import java.util.Stack;

public class stack_problem {
    public static void main(String[] args) {
//        addAtBottom();
        ReverseStack();

    }
    public static void addAtBottom(){
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack);
        Stack<Integer> stack1 = new Stack<>();
        stack1.add(45678);
        for (int i = 0; i < stack.size(); i++) {
            stack1.add(i);

        }
        System.out.println("This is stack 1 "+ stack1);
    }
    public static void ReverseStack(){
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println("This is frist stack");
        System.out.println(stack);

       Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i <= stack.size(); i++) {
            int top = stack.pop();
            stack1.add(top);

        }
        System.out.println(stack1);


    }

}
