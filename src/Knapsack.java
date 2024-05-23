import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Knapsack {
    static int maxProfit = 0; // 지금까지의 best값
    static int numBest = 0; // best 달성했을때의 레벨
    static int[] bestSet; // best 만드는 set 저장
    static int[] include; // 지금까지 어떤 물건 선택했는지("yes"면 선택, "no"면 건너뛴 item)

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\82105\\Desktop\\SSH\\3-1\\소웨공\\SWE\\src\\instance.txt"));

        // 첫 번째 줄: 항목 수, 최대 무게
        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int W = Integer.parseInt(firstLine[1]);

        // 두 번째 줄: 항목의 무게
        String[] secondLine = reader.readLine().split(" ");
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(secondLine[i]);
        }

        // 세 번째 줄: 항목의 이익
        String[] thirdLine = reader.readLine().split(" ");
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(thirdLine[i]);
        }

        reader.close();

        bestSet = new int[n];
        include = new int[n];

        knapsack(0, 0, 0, w, p, W, n);

        // 결과 출력
        System.out.println("Optimal solution: " + Arrays.toString(bestSet).replaceAll("[\\[\\],]", ""));
        System.out.println("Maximum profit: " + maxProfit);
    }

    // 백트래킹 함수
    public static void knapsack(int i, int profit, int weight, int[] w, int[] p, int W, int n) {
        if (weight <= W && profit > maxProfit) {
            maxProfit = profit;
            System.arraycopy(include, 0, bestSet, 0, n);
        }

        if (promising(i, weight, w, p, W, n)) {
            if (i < n) { // 배열 범위를 넘지 않도록 체크
                include[i] = 1; // 현재 항목 포함
                knapsack(i + 1, profit + p[i], weight + w[i], w, p, W, n);
                include[i] = 0; // 현재 항목 포함하지 않음
                knapsack(i + 1, profit, weight, w, p, W, n);
            }
        }
    }

    // 유망한지 검사하는 함수
    public static boolean promising(int i, int weight, int[] w, int[] p, int W, int n) {
        if (weight >= W) return false;
        int j = i;
        int totWeight = weight;
        double bound = 0;

        // 현재 노드의 유망성을 결정하는 범위 계산
        while (j < n && totWeight + w[j] <= W) {
            totWeight += w[j];
            bound += p[j];
            j++;
        }

        // 남은 부분 중 일부를 더함
        if (j < n) {
            bound += (W - totWeight) * ((double)p[j] / w[j]);
        }

        return bound + maxProfit > maxProfit;
    }
}
