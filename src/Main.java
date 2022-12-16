import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /**
         * List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
         * 1) Стримди колдонуп жогорудагы листтин элементтердин суммасын,
         * орточо арифметикалык санын жана канча жолу кайталанганын консольго чыгарыныз
         */

        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);

        System.out.println("All numbers: " + list);
        System.out.println("The array numbers sum is: " + list.stream().reduce(Integer::sum).get());
        System.out.println("The Arithmetic mean is: " + list.stream().mapToInt((s) -> s).average().getAsDouble());
        Set<Integer> newInteger = new TreeSet<>();
        System.out.println("The same numbers are: " + list.stream().filter(n -> !newInteger.add(n)).collect(Collectors.toSet()));


    }
}