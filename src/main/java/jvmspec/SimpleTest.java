package jvmspec;

public class SimpleTest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
}