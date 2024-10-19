package JavaCollection.QueueInterface;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Thêm phần tử vào đầu và cuối
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);

        // Lấy và xóa phần tử đầu và cuối
        System.out.println("Phần tử đầu tiên: " + deque.pollFirst());  // Kết quả: 0
        System.out.println("Phần tử cuối cùng: " + deque.pollLast());  // Kết quả: 2

        // In ra các phần tử còn lại
        System.out.println("Các phần tử còn lại: " + deque);
    }
}

