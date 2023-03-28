import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VariantsSort {

    public static void main(String[] args) {
        String[] arrays = {"cat", "orange", "elephant", "bird"};


        System.out.println(arrays); // массивы не переопределяют toString, выводит хешкод

        for (int i = 0; i < 4; i++) {

            System.out.println(arrays[i]); // пробуем вывести значения массива иначе
        }


        System.out.println(Arrays.toString(arrays)); // но у класса Arrays есть toString, куда можем передать массив



        Arrays.sort(arrays, 0, 4); // стандартный метод сортировки по возрастанию

        System.out.println("Сортировка через метод sort у Arrays: " + Arrays.toString(arrays));

        // сортируем исходный массив стримом
        Arrays.stream(arrays).sorted().collect(Collectors.toList());
        System.out.println("Сортировка стримом исходного массива: " + Arrays.toString(arrays));


        // а ещё у коллекций есть компаратор
        List<String> arrays2 = new ArrayList<>(Arrays.asList("cat", "orange", "elephant", "bird")); // если бы у нас был динамический массив, то через компаратор
        // можно отсортировать по длине строки

        arrays2.sort((first, second) -> Integer.compare(first.length(), second.length())); // смотрим на метод сорт и метод compare. И идем к ФИ Comparable
        System.out.println("Сортировка через Comparator: " + arrays2);

    }


}
