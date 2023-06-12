public class IfApp {

    public static void main(String[] args) {

        System.out.println("a");
        if(false) { // 실행되지 않는다
            System.out.println(1);
        } else if(true) { // 실행된다
            System.out.println(2);
        } else { // 위에 true 가 있으므로 실행되지 않는다
            System.out.println(3);
        }
        System.out.println("b");

    }

}