// 꼭 abstract일 필요는 없지만, EmployeeInfo의 부모 클래스 지정
abstract class Info6{
    public abstract int getLevel();
}

class EmployeeInfo6 extends Info6{
    public int rank;
    EmployeeInfo6(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

class Person6<T extends Info6>{
    public T info;
    Person6(T info){ this.info = info; }
}

public class GenericDemo6 {
    public static void main(String[] args) {
        Person6 p1 = new Person6(new EmployeeInfo6(1));
//        Person6<String> p2 = new Person6<String>("부장");
    }
}