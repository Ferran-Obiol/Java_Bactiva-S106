package n1exercici1;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = " que";
        String s3 = " tal";

        NoGenericMethods noGenericMethods1 =  new NoGenericMethods(s1,s2,s3);
        NoGenericMethods noGenericMethods2 =  new NoGenericMethods(s2,s3,s1);
        NoGenericMethods noGenericMethods3 =  new NoGenericMethods(s3,s1,s2);

    }

}
