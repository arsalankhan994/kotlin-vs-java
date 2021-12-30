public class KeywordsJava {
    public static void main(String[] args) {

        /*
        using final, to assign value only one time
        */
        final String nonChangeableVariable = "Erselan Khan";
        /*nonChangeableVariable = "Arsalan Khan";*/

        try {
            String name = null;
            name.toString(); // this line will throw null pointer exception
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally called");
        }

        /*
        Accessing object bound method
        */
        SomeClass someClass = new SomeClass();
        someClass.objectBoundMethod();

        /*
        using static keyword, for accessing class bound method
        */
        SomeClass.classBoundMethod();

    }
}

class SomeClass {
    static void classBoundMethod() {
        System.out.println("This is class bound method");
    }

    void objectBoundMethod() {
        System.out.println("This is object bound method");
    }
}


