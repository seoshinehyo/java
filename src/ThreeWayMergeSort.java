public class ThreeWayMergeSort {
    // 202034723 서상효 Three-Way MergeSort를 사용해 정렬하는 프로그램

    public static void main(String args[]) {
        Integer[] S = new Integer[] {1, 4, 6, 2, 8, 5, 3, 9, 7}; // 정렬되지 않은 배열 S 선언
        mergeSort(S); // mergeSort 호출
        System.out.print("정렬된 배열 S : ");
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
    }

    public static void mergeSort(Integer[] S) {
        if (S == null) {
            return; // 배열이 비어있으면 종료
        }

        Integer[] U = new Integer[S.length]; // 배열 S 크기만큼의 배열 U 선언

        for (int i = 0; i < U.length; i++) {
            U[i] = S[i]; // 배열 복사
        }

        // sort function
        mergeSortRec(U, 0, S.length, S);

        for (int i = 0; i < U.length; i++)
            S[i] = U[i]; // 정렬된 배열 U의 값들 배열 S로 copy
    }
    public static void mergeSortRec(Integer[] U, int low, int high, Integer[] V)
    {
        if (high - low < 2) {
            return; // 배열 size가 1이면 종료 (1이면 정렬할 필요가 없음)
        }

        // mid1, mid2를 사용해 배열 3개로 Devide
        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;

        // recursion을 사용해 각 배열 정렬
        mergeSortRec(V, low, mid1, U);
        mergeSortRec(V, mid1, mid2, U);
        mergeSortRec(V, mid2, high, U);

        merge(V, low, mid1, mid2, high, U); // 정렬된 3개의 배열 합치기
    }

    public static void merge(Integer[] S, int low, int mid1, int mid2, int high, Integer[] U) {
        int i = low, j = mid1, k = mid2, l = low;

        // 3개의 배열 중 가장 작은 값 넣기
        while ((i < mid1) && (j < mid2) && (k < high)) {
            if (S[i].compareTo(S[j]) < 0) {
                if (S[i].compareTo(S[k]) < 0) {
                    U[l++] = S[i++];
                } else {
                    U[l++] = S[k++];
                }
            }
            else {
                if (S[j].compareTo(S[k]) < 0) {
                    U[l++] = S[j++];
                } else {
                    U[l++] = S[k++];
                }
            }
        }

        // 첫번째, 두번째 배열 중 하나 끝날때까지 비교
        while ((i < mid1) && (j < mid2)) {
            if (S[i].compareTo(S[j]) < 0) {
                U[l++] = S[i++];
            } else {
                U[l++] = S[j++];
            }
        }

        // 두번째, 세번째 배열 중 하나 끝날때까지 비교
        while ((j < mid2) && (k < high)) {
            if (S[j].compareTo(S[k]) < 0) {
                U[l++] = S[j++];
            } else {
                U[l++] = S[k++];
            }
        }

        // 첫번째, 세번째 배열 비교,
        while ((i < mid1) && (k < high)) {
            if (S[i].compareTo(S[k]) < 0) {
                U[l++] = S[i++];
            } else {
                U[l++] = S[k++];
            }
        }

        // 첫번째 배열에서 남는값 복사
        while (i < mid1) {
            U[l++] = S[i++];
        }

        // 두번째 배열에서 남는값 복사
        while (j < mid2) {
            U[l++] = S[j++];
        }

        // 세번째 배열에서 남는값 복사
        while (k < high) {
            U[l++] = S[k++];
        }
    }
}