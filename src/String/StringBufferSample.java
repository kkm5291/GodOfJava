package String;

public class StringBufferSample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        String result = sb.toString();
        System.out.println(result);
    }



}
