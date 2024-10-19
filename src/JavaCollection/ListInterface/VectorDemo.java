package JavaCollection.ListInterface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Thêm phần tử
        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Scala");

        // Duyệt qua các phần tử
        for (String language : vector) {
            System.out.println(language);
        }
    }
}
