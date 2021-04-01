import subjects.*;
import subjects.Math;

import java.util.HashMap;
import java.util.Map;

/*
1. Создать класс Предмет, а также наследников от него (несколько) - математика, рус. язык и т.д.
Добавить несколько полей, характеризующих школьный предмет: название, продолжительность урока, сложность...
Создать массив школьных предметов.
Посчитать количетсво одинаковых предметов в массиве
Вывести о них информацию в виде - Название_предмета (параметры) - количество
 */
public class Runner {
    public static void main(String[] args) throws ClassNotFoundException {
        Subject[] array= new Subject[5];
        array[0] = new Math(21, "easy");
        array[1] = new English(14, "hard");
        array[2] = new PE(16, "easy");
        array[3] = new Math(30, "hard");
        array[4] = new Math(10, "easy");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
        for(int i = 0, n = 1; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getName() == array[i].getName()) {
                    n++;
                }
            }
            if (!map.containsKey(array[i].getName())) {
                map.put(array[i].getName(), n);
            }
            n = 1;
        }
        System.out.println(map.toString());
    }
}

