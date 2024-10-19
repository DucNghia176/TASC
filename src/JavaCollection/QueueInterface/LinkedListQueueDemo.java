package JavaCollection.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // Lấy và xóa phần tử đầu tiên
        System.out.println("Phần tử được lấy ra: " + queue.poll());  // Kết quả: A

        // In ra các phần tử còn lại
        System.out.println("Các phần tử còn lại: " + queue);
    }
}
