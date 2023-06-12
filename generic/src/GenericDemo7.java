interface Info7{
    int getLevel();
}

class EmployeeInfo7 implements Info7{
    public int rank;
    EmployeeInfo7(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

// implements가 아닌 extends 임을 주의!
class Person7<T extends Info7>{
    public T info;

    Person7(T info){
        this.info = info;
        // extends Info가 있기 때문에 문제 없는데, 만약 없으면 에러
        info.getLevel();
    }



}

public class GenericDemo7 {
    public static void main(String[] args) {
        Person7 p1 = new Person7(new EmployeeInfo7(1));
//        Person7<String> p2 = new Person7<String>("부장");
    }
}