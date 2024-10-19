package JavaCollection.ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Thêm phần tử vào đầu và cuối danh sách
        list.addFirst(10);
        list.addLast(20);
        list.add(1, 15);  // Thêm vào vị trí thứ 2

        // Xóa phần tử đầu tiên
        list.removeFirst();

        // In tất cả phần tử trong LinkedList
        System.out.println("Các phần tử trong LinkedList: " + list);
    }
}

