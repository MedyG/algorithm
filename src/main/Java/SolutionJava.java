import java.util.ArrayList;
import java.util.List;

public class SolutionJava {

    public static void main(String[] args) {

        InterviewJava interview = new InterviewJava();
        List<Integer> A = new ArrayList<Integer>();
        A.add(2);
        A.add(1);
        A.add(0);
        List<Integer> B = new ArrayList<Integer>();
        List<Integer> C = new ArrayList<Integer>();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        interview.hanota(A,B,C);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }

}
