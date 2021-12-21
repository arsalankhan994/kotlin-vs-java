public class HandleNullObjectJava {
    public static void main(String[] args) {
        String object = "Erselan Khan";
        String nullObject = null;

        // Accessing both objects

        /*
        First Start with non-null object
        */
        boolean value = object.equals("Erselan Khan");
        System.out.println("value: " + value);


        /*
        Handle null object using try/catch
        */
        try {
            nullObject.equals("Erselan Khan");
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        }

        /*
        Handle null object using if check
        */
        if (nullObject != null) {
            System.out.println("nullObject: " + nullObject);
        } else {
            System.out.println("nullObject is null");
        }
    }
}
