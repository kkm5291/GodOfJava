package String;

import java.util.StringTokenizer;

public class StringToknizerSample {
    public static void main(String[] args) {
//        String data = "홍길동&이수홍,박연수,김자바-최영호";
//        String[] names = data.split("&|,|-");
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);

/*
        String data = "이수홍/홍길동/박연수";
        StringTokenizer st = new StringTokenizer(data, "/");

*/
//        System.out.println(st.hasMoreTokens());

        String data1 = "이수홍&홍길동,박연수";
        String[] arr = data1.split("&|,");
        for (String token : arr) {
            System.out.print(token + " ");
        }

        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
