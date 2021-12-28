package n1exercici3;

public class Main {

    public static void main(String[] args) {

        GenericMethods<Integer> integerGenericMethods = new GenericMethods<>();
        integerGenericMethods.f(1, 2, "Hola");

        GenericMethods<String> stringGenericMethods = new GenericMethods<>();
        stringGenericMethods.f("Hola", "Que", "tal");
    }

}
