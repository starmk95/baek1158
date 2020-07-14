import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>(); // Queue는 LinkedList 인터페이스를 사용하여 구현되었다.
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i=0;i<N;i++) {
            queue.add(i+1);
        }
        while (queue.size() > 1) {
            for (int i=0;i<K-1;i++) {
                int temp = queue.poll();
                queue.offer(temp);
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.print(sb);
    }
}
