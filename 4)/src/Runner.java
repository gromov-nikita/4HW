import calculator.Calculator;

/*
4. Написать обобщенный класс Калькулятор, который позволяет посчитать сумму/разность элементов массива.


5. Создать обобщенный метод для получения минимального/максимального значения из двух переменных,
переданных в качестве параметров
 */
public class Runner {
    public static <T extends Number> T max(T obj1, T obj2) {
        if (obj1.doubleValue() > obj2.doubleValue()) {
            return obj1;
        }
        else {
            return obj2;
        }
    }
    public static void main(String[] args) {
        //5
        System.out.println(max(10,5));
        //4
        Calculator<Integer> obj = new Calculator<>();
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(obj.sum(arr));
    }
}
