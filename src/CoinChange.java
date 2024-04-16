public class CoinChange {
    // 202034723 컴퓨터공학전공 서상효
    // 주어진 동전의 value를 담은 배열 S[]와 거슬러 줘야 할 금액 N이 주어졌을 때, 거스름돈을 구성하는 방법의 수를 반환하는 프로그램

    public static void main(String[] args) {
        int[] S = {1, 2, 3}; // 배열 S 선언
        int m = S.length; // m은 배열 S의 크기
        int N = 4; // 주어진 금액 N(input size)
        System.out.println(count(S, m, N));
    }

    public static int count(int[] S, int m, int N) {
        int[][] table = new int[N + 1][m]; // 중간 결과 저장하기 위한 크기가 N+1, m인 2차원 배열

        // 테이블의 첫 번째 행 1로 초기화 -> 0을 만드는 방법은 정확히 하나 -> 1로 초기화
        for (int i = 0; i < m; i++) {
            table[0][i] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < m; j++) {
                int use = (i - S[j] >= 0) ? table[i - S[j]][j] : 0; // 현재 동전 S[j] 사용하여 금액 만드는 방법의 수
                int notUse = (j >= 1) ? table[i][j - 1] : 0; // 현재 동전 사용하지 않고 이전 상태에서 금액 만드는 방법의 수
                table[i][j] = use + notUse;
            }
        }
        return table[N][m - 1]; // 최종 결과
    }
}