package String;

public class StringBuilderSample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // "DEF"
                .insert(0, "ABC") //"ABCDEF"
                .delete(3, 4) //3~4번째 전까지 삭제
                .toString(); // "ABCEF"

        System.out.println(data);
    }
}
