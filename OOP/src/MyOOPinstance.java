public class MyOOPinstance {
    public static void main(String[] args) {
        PrintInstance p1 = new PrintInstance();
        p1.delimiter = "----";
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        PrintInstance p2 = new PrintInstance();
        p2.delimiter = "****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();


        p1.A();
        p2.A();
        p1.A();
        p2.A();
    }
}
