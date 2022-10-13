package Lambda;

public class CalculateImpl {
    private void calculateClassic() {
        Calculate calculate = new Calculate() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calculate.operation(1, 2));
    }

    private void calculateLambda() {
        Calculate calculate = (x, y) -> x+y;
        System.out.println(calculate.operation(1,2));

        Calculate calculateSubtract = (x, y) -> x-y;
    }


}
