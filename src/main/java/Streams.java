import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 10, 100, 100, 55, 33, 88, 0);
//        List<String> strings = List.of("Eugene", "Marta", "Vika", "Julia1", "julia2");

//        list.stream().filter(x-> x > 33).forEach(System.out::println);
//        list.stream().sorted().limit(4).forEach(System.out::println);
//        list.stream().sorted().skip(2).forEach(x-> System.out.println(x));
//        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(x-> System.out.println(x));
//        list.stream().map(x-> x + 1).forEach(x-> System.out.println(x));
//        long a = list.stream().distinct().count();
//        System.out.println(a);

//        OptionalInt b = list.stream().mapToInt(x -> x).max();
//        System.out.println(b);

//        Optional<Integer> a = list.stream().reduce(Integer::sum);
//        System.out.println(a.get());

//        Optional<Integer> optionalInteger = list.stream().filter(x -> x  >= 1).findFirst();
//        System.out.println(optionalInteger.get());


//        Stream<String> stream = strings.stream();

        List<String> countries = Arrays.asList("Costa Rica", "Hungary", "Saint Kitts and Nevis", "Norway");
        List<Integer> numbers = countries.stream()
                .map(country -> country.split("\\s+"))
                .map(country -> country.length)
                .collect(Collectors.toList());

        for (Integer i : numbers){
            System.out.println(i);
        }



    }
}
