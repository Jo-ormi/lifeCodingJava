class Cal2{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading
    public int sum(int v1, int v2, int v3){
        return this.sum(v1,v2)+v3;
    }
}

class Cal23 extends Cal2{
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        //부모의 메소드 sum 을 이용하겠다!
        return super.sum(v1,v2);
    }

}

public class InheritanceAppSuper {
    public static void main(String[] args) {
        Cal2 c = new Cal2();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));

        Cal23 c3 = new Cal23();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}

class Cal22{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
}