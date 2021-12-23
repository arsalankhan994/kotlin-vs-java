import java.util.ArrayList;
import java.util.List;

public class LoopsInJava {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Erselan");
        list.add("Khan");

        /*
        1. for loop
        */
        for (int i=0; i<5; i++) {
            System.out.println("Erselan Khan");
        }

        /*
        2. foreach loop
        */
        for (String value : list) {
            System.out.println(value);
        }

        /*
        3. while loop
        */
        int loopValue = 5;
        while (loopValue > 0) {
            System.out.println("Erselan Khan");
            loopValue--;
        }

    }
}
