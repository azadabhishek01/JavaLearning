import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> n1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 5, 6));

        LinkedHashSet<Integer> uni = new LinkedHashSet<>(n1);

        ArrayList<Integer> nwd = new ArrayList<>(uni);

        System.out.println(nwd);
        System.out.println("----------------");

        // with java jdk 8 - stream

        ArrayList<Integer> n2 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 5, 6));
        List<Integer> unique = n2.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
