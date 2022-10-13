package Optional;

import jdk.jshell.spi.ExecutionControlProvider;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalPractice {

    private void createOptionalObjects() { // Optional 객체 만드는 방법 3가지
        Optional<String> emptyString = Optional.empty(); // 데이터가 없는 Optional 객체
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common); // null이 추가될 수 있는 객체
        common = "common";
        Optional<String> commonString = Optional.of(common); // 반드시 데이터가 들어가야만 하는 객체
    }

    private void checkOptionalData() {
        System.out.println(Optional.of("present").isPresent()); // true
        System.out.println(Optional.ofNullable(null).isPresent()); // false
    }

    private void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";
        String result1 = data.get(); // 가장 많이 쓰는 데이터 뽑아내기
        String result2 = data.orElse(defaultValue); // 값이 없을 경우 orElse() 사용해서 기본값 지정
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GodOfJava";
            }
        };
        String result3 = data.orElseGet(stringSupplier); // 값이 없으면 예외 발생시켜버리기
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);
    }

    public static void main(String[] args) {
        OptionalPractice opt = new OptionalPractice();
        opt.checkOptionalData();
    }
}
