package JavaCore.Memory;

public class MemoryDemo {

    // Cấp phát tĩnh - Biến instance thuộc class (lưu trên Heap)
    private int instanceVariable = 42;

    // Cấp phát tĩnh - Mảng cố định trên Heap
    private int[] staticArray = {1, 2, 3, 4, 5};

    public void stackAllocation() {
        int localVar = 10;  // Biến cục bộ, cấp phát trên Stack
        System.out.println("Giá trị của localVar: " + localVar);
    }

    public void heapAllocation() {
        // Cấp phát động trên Heap
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = (i + 1) * 10;
        }

        System.out.print("Các phần tử trong dynamicArray: ");
        for (int num : dynamicArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MemoryDemo demo = new MemoryDemo();  // Cấp phát đối tượng trên Heap

        System.out.println("Cấp phát trên Stack:");
        demo.stackAllocation();

        System.out.println("\nCấp phát trên Heap:");
        demo.heapAllocation();
    }
}
