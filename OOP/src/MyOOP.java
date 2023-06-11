public class MyOOP {
    public static String delimiter = "";
    public static void main(String[] args) {
        delimiter = "---";
        printA(delimiter);
        printA(delimiter);

        delimiter = "***";
        printA(delimiter);
        printA(delimiter);
    }

    public static void printA(String delimiter) {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}