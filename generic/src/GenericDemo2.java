class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person2{
    public Object info;
    Person2(Object info){ this.info = info; }
}
public class GenericDemo2 {
    public static void main(String[] args)  {
        Person2 p1 = new Person2("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
    }
}