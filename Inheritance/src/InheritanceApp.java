class Cal{
    public int sum(int v1, int v2){
        return v1+v2;
    }

}

// 상속하지 않고 빼기가 있는 계산기 하나 더 만들기
// class Cal2{
//    기능 중복
//    public int sum(int v1, int v2){
//        return v1+v2;
//    }
//    public int minus(int v1, int v2){
//        return v1-v2;
//    }
//}

class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}