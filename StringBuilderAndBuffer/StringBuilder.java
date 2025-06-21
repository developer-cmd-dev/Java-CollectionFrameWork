package StringBuilderAndBuffer;

public class StringBuilder {
    public static void main(String[] args) {

        String str = "Hello"; // String is immutable in java
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append(" world").append("!").reverse();
        System.out.println(sb);
    }
}
