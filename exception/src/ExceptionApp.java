public class ExceptionApp {
    public static void main(String[] args) {
//        예외 발생
//        System.out.println(1);
//        System.out.println(2/0);
//        System.out.println(3);

        // 예외 처리

        System.out.println(1);
        int[] scores = {10,20,30};
        try {
            System.out.println(2);
            System.out.println(scores[3]); // 없는 값을 가지고 오려고 함 (ArrayIndexOutOfBoundsException)
            System.out.println(3);
            System.out.println(2 / 0); // 0으로 나눌 수 없음 (ArithmeticException)
            System.out.println(4);
        } catch(ArithmeticException e){
            System.out.println("잘못된 계산이네요.");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("없는 값을 찾고 계시네요 ^^");
        } catch(Exception e){
            System.out.println("먼가 이상합니다. 오류가 발생했습니다. ");
        }
        System.out.println(5);
    }
}