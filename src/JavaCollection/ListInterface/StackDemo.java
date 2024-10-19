package JavaCollection.ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào ngăn xếp
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Lấy phần tử ra (LIFO)
        System.out.println("Phần tử vừa lấy ra: " + stack.pop());

        // Xem phần tử trên cùng
        System.out.println("Phần tử trên cùng: " + stack.peek());

        // In các phần tử còn lại
        System.out.println("Các phần tử còn lại trong Stack: " + stack);
    }
}
