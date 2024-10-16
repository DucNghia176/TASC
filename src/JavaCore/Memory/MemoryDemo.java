package JavaCore.Memory;

public class MemoryDemo {
    static class student {
        String name;

        public student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("studen name: " + name);
        }
    }

    public static void main(String[] args) {
        // Cấp phát tĩnh: biến local trên stack
        int number = 42;
        System.out.println("Number: " + number);

        // Cấp phát động: đối tượng trên heap
        student st = new student("Alice");
        st.display();  // Truy xuất đối tượng từ heap
    }
}
