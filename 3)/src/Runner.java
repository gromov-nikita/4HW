/*
Создать обобщенный класс с двумя параметрами (T, S).
Класс содержит переменные типа (T, S),
конструктор, принимающий параметры (T, S),
методы для использования переменных(придумываете сами).
 */
public class Runner {
    public static void main(String[] args) {
        General<String, Integer> obj1 = new General<>("str1",1);
        General<Double, Boolean> obj2 = new General<>(2.3,true);
        obj1.print();
        obj2.print();
    }
}
