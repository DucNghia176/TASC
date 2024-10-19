package JavaCollection.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // 1. HashSet - Không duy trì thứ tự chèn
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java");  // Bị bỏ qua vì trùng lặp

        System.out.println("HashSet: " + hashSet);

        // 2. LinkedHashSet - Duy trì thứ tự chèn
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");  // Bị bỏ qua vì trùng lặp

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 3. TreeSet - Duy trì thứ tự tăng dầns
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("Java");  // Bị bỏ qua vì trùng lặp

        System.out.println("TreeSet: " + treeSet);
    }
}

