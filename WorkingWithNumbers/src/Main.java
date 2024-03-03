import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> List = new ArrayList<>();
        for (Integer intLists : intList) {
            if (intLists > 0 && intLists % 2 == 0) {
                List.add(intLists);
            }
        }
        List.sort(Comparator.naturalOrder());
        intList = List;
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}