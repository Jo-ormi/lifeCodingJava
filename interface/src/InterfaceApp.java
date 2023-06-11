//// 외부 업체가 만들어준 것 -> 우리가 생각했던 것과 달라서 사용하기 어려움
//class RealCal {
//    public double plus(double v1, double v2, double v3){
//		return v1+v2+v3;
//    }
//}

// 인터페이스 정의
interface Calculable{
    // 변수 정의 가능 실제 값 있어야 함
    double PI = 3.14;
    int sum(int v1, int v2);
}

// 여러개의 인터페이스를 구현할 수 있으려나? -> 가능
interface Printable{
    void print();
}

// 외부 업체에서 인터페이스를 따라 만들면?
class RealCal implements Calculable, Printable{
    public int sum(int v1, int v2) {
        return v1+v2;
    }
    public void print() {
        System.out.println("This is RealCal!!");
    }
}

class AdvancedPrint implements Printable{
    public void print() {
        System.out.println("This is RealCal!!");
    }

}

// 우리가 기대한 것
class DummyCal{
    public int sum(int v1, int v2){
		return v1+v2;
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        // 더하기 기능이 있는 클래스를 만들어주세요
        RealCal c = new RealCal();
        System.out.println(c.sum(1,2));
        c.print();
        System.out.println(c.PI);

        Printable a = new AdvancedPrint();
        a.print();
    }
}