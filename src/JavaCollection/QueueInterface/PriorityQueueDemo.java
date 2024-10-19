package JavaCollection.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Thêm phần tử vào hàng đợi ưu tiên
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);

        // Lấy và xóa phần tử có độ ưu tiên cao nhất (phần tử nhỏ nhất)
        System.out.println("Phần tử được lấy ra: " + priorityQueue.poll());  // Kết quả: 1

        // In ra các phần tử còn lại
        System.out.println("Các phần tử còn lại: " + priorityQueue);
    }
}

