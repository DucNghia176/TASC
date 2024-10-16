package JavaCore.String;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1==s2: "+(s1 == s2));
        System.out.println("s1==s3: "+(s1 == s3));

        System.out.println("s1.equals(s3): "+s1.equals(s3));
        String s4 = "HELLO";
        System.out.println("s1.equalsIgnoreCase(s4): "+s1.equalsIgnoreCase(s4));
    }
}
