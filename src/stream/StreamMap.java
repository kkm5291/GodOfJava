package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        intList.stream().forEach(value-> System.out.println(value*3));
        intList.stream().map(value -> value * 3).forEach(System.out::println);
    }


}
