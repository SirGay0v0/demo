import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1","a2","a3","b1","b2","b3");

        myList.stream().filter(s->s.startsWith("b")).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
    }
}
