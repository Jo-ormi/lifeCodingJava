public class MyOOPconstructor {
    public static void main(String[] args) {
        PrintConstructor p1 = new PrintConstructor("----");
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        PrintConstructor p2 = new PrintConstructor("****");
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
