class Cal3l{
    int v1,v2;
    Cal3l(int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}

class Cal33 extends Cal3l{
    Cal33(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}

public class InheritanceAppConstructor {
    public static void main(String[] args) {
        Cal3l c = new Cal3l(2,1);
        Cal33 c3 = new Cal33(2, 1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}