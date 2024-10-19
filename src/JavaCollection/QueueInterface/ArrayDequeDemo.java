package JavaCollection.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Thêm phần tử vào đầu và cuối
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");

        // Lấy và xóa phần tử đầu và cuối
        System.out.println("Phần tử đầu tiên: " + deque.pollFirst());  // Kết quả: C
        System.out.println("Phần tử cuối cùng: " + deque.pollLast());  // Kết quả: B

        // In ra các phần tử còn lại
        System.out.println("Các phần tử còn lại: " + deque);
    }
}

