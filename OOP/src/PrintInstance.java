public class PrintInstance {
    // static을 없앴다.
    public String delimiter = "";

    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

}
