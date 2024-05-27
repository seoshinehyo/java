import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Knapsack {
    static int maxProfit = 0; // 지금까지의 best값
    static int numBest = 0; // best 달성했을때의 레벨
    static int[] bestSet; // best 만드는 set 저장
    static int[] include; // 지금까지 어떤 물건 선택했는지("yes"면 선택, "no"면 건너뛴 item)

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\82105\\Desktop\\SSH\\3-1\\소웨공\\SWE\\src\\instance3.txt")); // 파일 읽기

        // 첫 번째 줄 : # of items - n, maximum weight - W
        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int W = Integer.parseInt(firstLine[1]);

        // 두 번째 줄 : list of weights of items separated by space - w[]
        String[] secondLine = reader.readLine().split(" ");
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(secondLine[i]);
        }

        // 세 번째 줄 : list of profits of items separted by space - p[]
        String[] thirdLine = reader.readLine().split(" ");
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(thirdLine[i]);
        }

        reader.close(); // 파일 닫기

        bestSet = new int[n];
        include = new int[n];

        // 아이템들을 pi/wi 비율에 따라 정렬
        sortItems(w, p, n); // 정렬 메서드 호출

        knapsack(0, 0, 0, w, p, W, n); // index, profit, weight의 초기값은 전부 0

        // 결과 출력
        System.out.println("Optimal solution: " + Arrays.toString(bestSet).replaceAll("[\\[\\],]", "")); // 출력 형식에 맞게 변경
        System.out.println("Maximum profit: " + maxProfit); // Maximum profit값 출력
    }

    private static void sortItems(int[] w, int[] p, int n) {
        Double[] ratios = new Double[n]; // pi/wi 값을 담을 배열
        Integer[] indices = new Integer[n]; // 원래 배열의 인덱스를 담는 배열
        for (int i = 0; i < n; i++) {
            ratios[i] = (double) p[i] / w[i];
            indices[i] = i;
        }

        // 람다식을 사용해 ratios를 기준으로 indices 정렬
        Arrays.sort(indices, (i, j) -> Double.compare(ratios[j], ratios[i]));

        int[] sortedW = new int[n]; // 정렬된 W
        int[] sortedP = new int[n]; // 정렬된 P

        for (int i = 0; i < n; i++) {
            sortedW[i] = w[indices[i]];
            sortedP[i] = p[indices[i]];
        }

        // 정렬된 배열을 원래 배열에 복사
        System.arraycopy(sortedW, 0, w, 0, n);
        System.arraycopy(sortedP, 0, p, 0, n);
    }

    // Backtracking Method
    public static void knapsack(int i, int profit, int weight, int[] w, int[] p, int W, int n) {
        if (weight <= W && profit > maxProfit) {
            maxProfit = profit;
            numBest = i;
            bestSet = include.clone(); // include 배열을 bestSet 배열로 복사
        }

        if (promising(i, profit, weight, w, p, W, n)) {
            include[i] = 1; // 해당 item 포함하면 1, include 배열의 0번째 index부터 값을 넣어야 되므로 include[i + 1]이 아닌 include[i] 사용
            // 왼쪽 노드, i + 1을 불러 recursion을 하는 것이 맞는데, 배열 p에 0번째 요소부터 profit 값이 들어있으므로 ppt처럼 p[i + 1]과 w[i + 1]을 더하는 것이 아닌 p[i]값과 w[i]값을 더해주는 것이 맞음
            knapsack(i + 1, profit + p[i], weight + w[i], w, p, W, n);
            include[i] = 0; // 해당 item 포함하지 않으면 0
            knapsack(i + 1, profit, weight, w, p, W, n); // 해당 item 포함하지 않고 오른쪽 노드로

        }
    }

    // promising한지 검사하는 메서드
    public static boolean promising(int i, int profit, int weight, int[] w, int[] p, int W, int n) {
        int j, k;
        int totWeight;
        double bound;

        if (weight >= W) {
            return false; // weight 넘치면 nonpromising
        } else {
            j = i;
            totWeight = weight;
            bound = profit;

            // 남은 항목들의 이익을 무게에 맞게 추가함
            while (j < n && totWeight + w[j] <= W) {
                totWeight += w[j];
                bound += p[j];
                j++;
            }
            k = j;
            // 쪼갤 수 있기때문에, W 여유값이 있으면 쪼개서 bound 값에 더해줌
            if (k < n) {
                bound += (W - totWeight) * ((double) p[k] / w[k]);
            }
            return bound > maxProfit; // true면 promising해서 리턴
        }
    }
}