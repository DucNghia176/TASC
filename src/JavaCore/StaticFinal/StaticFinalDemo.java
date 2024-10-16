package JavaCore.StaticFinal;

// File: StaticFinalDemo.java
public class StaticFinalDemo {
    // Thuộc tính static - dùng chung cho tất cả các đối tượng
    static int count = 0;

    // Thuộc tính final - chỉ được khởi tạo một lần và không thể thay đổi
    final int MAX_VALUE;

    // Constructor để khởi tạo giá trị MAX_VALUE và tăng count
    public StaticFinalDemo(int value) {
        MAX_VALUE = value;  // Khởi tạo biến final
        count++;  // Tăng biến static mỗi khi tạo một đối tượng
    }

    // Phương thức static - có thể gọi mà không cần tạo đối tượng
    static void displayCount() {
        System.out.println("Số lượng đối tượng đã tạo: " + count);
    }

    // Phương thức hiển thị giá trị của biến final
    void displayMaxValue() {
        System.out.println("Giá trị MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        // Tạo 2 đối tượng từ class StaticFinalDemo
        StaticFinalDemo obj1 = new StaticFinalDemo(100);
        StaticFinalDemo obj2 = new StaticFinalDemo(200);

        // Gọi phương thức của từng đối tượng
        obj1.displayMaxValue();  // Kết quả: Giá trị MAX_VALUE: 100
        obj2.displayMaxValue();  // Kết quả: Giải trị MAX_VALUE: 200

        // Gọi phương thức static thông qua tên class
        StaticFinalDemo.displayCount();  // Kết quả: Số lượng đối tượng đã tạo: 2
    }
}

