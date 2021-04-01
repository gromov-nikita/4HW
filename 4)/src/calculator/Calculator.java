package calculator;

public class Calculator<S extends Number> {
    public S sum(S[] arr) {
        Double sum = 0.0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return (S)sum;
    }
}
