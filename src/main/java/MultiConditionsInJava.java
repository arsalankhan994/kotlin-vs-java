import java.util.ArrayList;
import java.util.List;

public class MultiConditionsInJava {
    public static void main(String[] args) {
        /*
        switch case -> with Enum value
        */
        State state = State.NOT_STARTED;
        switch (state) {
            case STARTED, NOT_STARTED, CANCELLED, COMPLETED, IN_PROGRESS -> System.out.println("State is: " + state);
            default -> {
                System.out.println("Some Default State");
            }
        }

        /*
        switch case -> with Int value
        */
        List<Integer> integerList = new ArrayList<Integer>(List.of(1,2,3));
        switch (integerList.get(0)) {
            case 1:  {
                System.out.println("Integer value: " + 1);
                break;
            }
            case 2:  {
                System.out.println("Integer value: " + 2);
                break;
            }
            case 3:  {
                System.out.println("Integer value: " + 3);
                break;
            }
            default:  {
                System.out.println("Some Default Int");
            }
        }

        /*
        switch case -> with String value
        */
        List<String> stringList = new ArrayList<>(List.of("Erselan", "Khan", "Android", "KotlinVsJava"));
        switch (stringList.get(0)) {
            case "Erselan":  {
                System.out.println("String value: " + stringList.get(0));
                break;
            }
            case "Khan":  {
                System.out.println("String value: " + stringList.get(1));
                break;
            }
            case "Android":  {
                System.out.println("String value: " + stringList.get(2));
                break;
            }
            case "KotlinVsJava":  {
                System.out.println("String value: " + stringList.get(3));
                break;
            }
            default:  {
                System.out.println("Some Default String");
            }
        }
    }
}

