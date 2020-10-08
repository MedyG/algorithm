import java.util.List;

public class InterviewJava {

    /**
     *  In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower.
     *  The puzzle starts with disks sorted in ascending order of size from top to bottom
     *  (i.e., each disk sits on top of an even larger one). You have the following constraints:
     *  (1) Only one disk can be moved at a time.
     *  (2) A disk is slid off the top of one tower onto another tower.
     *  (3) A disk cannot be placed on top of a smaller disk.
     *
     *  Write a program to move the disks from the first tower to the last using stacks.
     *
     *  Example1:
     *
     *  Input: A = [2, 1, 0], B = [], C = []
     *  Output: C = [2, 1, 0]
     *  Example2:
     *
     *  Input: A = [1, 0], B = [], C = []
     *  Output: C = [1, 0]
     *
     *  来源：力扣（LeetCode）
     *  链接：https://leetcode-cn.com/problems/hanota-lcci
     *  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param A
     * @param B
     * @param C
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {

        move(A.size(), A, B, C);
    }
    // move top n in A to C by B
    private void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {

        if (n == 1) {
            // move the top of A to C
            C.add(A.remove(A.size() - 1));
            return;
        }
        move(n - 1, A, C, B);
        C.add(A.remove(A.size() - 1));
        move(n - 1, B, A, C);
    }


}
