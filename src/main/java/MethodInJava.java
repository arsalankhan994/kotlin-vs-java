public class MethodInJava {
    public static void main(String[] args) {
        SomeContent someContent = new SomeContent();
        someContent.methodWithoutReturnTypeAndNoParameter();
        String first = someContent.methodWithReturnTypeAndNoParameter();
        System.out.println("return type of methodWithReturnTypeAndNoParameter: " + first);
        someContent.methodWithoutReturnTypeWithParameter("Erselan Khan");
        String second = someContent.methodWithReturnTypeWithParameter("Erselan Khan");
        System.out.println("return type of methodWithReturnTypeWithParameter: " + second);
    }
}

class SomeContent {
    public void methodWithoutReturnTypeAndNoParameter() {
        System.out.println("called method methodWithoutReturnTypeAndNoParameter");
    }

    public String methodWithReturnTypeAndNoParameter() {
        return "Erselan Khan";
    }

    public void methodWithoutReturnTypeWithParameter(String name) {
        System.out.println("called method methodWithoutReturnTypeAndNoParameter, Print my name:" + name);
    }

    public String methodWithReturnTypeWithParameter(String name) {
        return name;
    }
}