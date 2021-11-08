import java.util.LinkedList;
import java.util.Queue;

public class JosephusSurvivor {
    public static int josephusSurvivor(int n, int k) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) queue.add(i);


        while (!queue.isEmpty()) {
            for (int i = 0; i < n-1; i++)
                queue.add(queue.remove());
            sb.append(queue.remove());
        }
        System.out.println();

    return Integer.parseInt(sb.substring(sb.length()-1));
    }

}
