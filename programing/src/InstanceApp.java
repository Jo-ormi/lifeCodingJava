import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {

    public static void main(String[] args) throws IOException{

        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1"); // 글 쓰기 작업
        p1.close(); //파일 닫기 (작업 완료)

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

        // 상속
        System.out.println(p1.toString());
        p2.toString();
        p2.write("Hello 2");

//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
//      PrintWriter.write("result1.txt", "Hello 1");
//      PrintWriter.write("result2.txt", "Hello 2");
// 위와 같은 코드로 이뤄진다고 상상해봐라(실제론 동작하지 않음)
// 쓸 때마다 어떤 파일에 쓸지, 뭐라고 쓸지 계속 작성해야함
// 하지만 위에 주석처리 되지 않은 코드처럼 인스턴스 실행시
// 어떤 파일에 작성할지, 어떤 작업들을 하게 될지 한번씩만 간단하게 쓸 수 있음
// 즉 일회성 사용이 아닌 경우 인스턴스를 만드는 것이 유리함
    }

}

