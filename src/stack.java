import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(4);
        stack.add(6);
        stack.add(9);
        stack.add(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.remove(3);
        System.out.println(stack);


    }
}
