package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(2, 2, 4, 7, 5));

        int collector = list.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.collectingAndThen(Collectors.toSet(), Set::size),
                (count, sortCount) -> (int) (((double) sortCount / count) * 100)));
        System.out.printf("Percentage of uniqueness = %s%%", collector);
    }
}

