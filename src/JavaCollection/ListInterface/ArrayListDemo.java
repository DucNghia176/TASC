package JavaCollection.ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Thêm phần tử
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Truy cập phần tử theo chỉ số
        System.out.println("Phần tử thứ 2: " + list.get(1));  // Python

        // In tất cả phần tử trong ArrayList
        System.out.println("Các phần tử trong ArrayList: " + list);
    }
}

