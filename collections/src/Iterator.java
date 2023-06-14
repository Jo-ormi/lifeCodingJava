import java.util.ArrayList;
import java.util.HashSet;

public class Iterator {
    public static void main(String[] args) {
//        HashSet<Integer> A = new HashSet<>();
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        // Iterator 인스턴스 생성
        java.util.Iterator<Integer> hi = A.iterator();

        while (hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
