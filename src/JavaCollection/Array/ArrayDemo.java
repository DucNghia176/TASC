package JavaCollection.Array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo và khởi tạo mảng số nguyên với kích thước 5
        int[] arr = new int[5];

        // Nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // In ra các phần tử và tổng của chúng
        System.out.print("Các phần tử trong mảng: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\nTổng các phần tử: " + sum);

        scanner.close();
    }
}
