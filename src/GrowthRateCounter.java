public class GrowthRateCounter {
    public static void main(String[] args) {
        int[] sizes = {10, 50, 100, 200, 400, 500};

        System.out.printf("%-8s%-12s%-12s%-12s%-12s%-12s\n",
                "n", "log n", "n", "n log n", "n^2", "n^3");

        for (int n : sizes) {
            long logN = countLogN(n);
            long nCount = countN(n);
            long nLogN = countNLogN(n);
            long nSquare = countN2(n);
            long nCube = countN3(n);

            System.out.printf("%-8d%-12d%-12d%-12d%-12d%-12d\n",
                    n, logN, nCount, nLogN, nSquare, nCube);
        }
    }

    static long countN(int n){
        long count = 0;
        for (int i = 1; i <= n; i++) count++;
        return count;
    }

    static long countLogN(int n){
        long count = 0;
        for (int j = n; j > 1; j /= 2)
            count++;
        return count;
    }

    static long countNLogN(int n){
        long count = 0;
        for (int i = 1; i <= n; i++)
            for (int j = n; j > 1; j /= 2)
                count++;
        return count;
    }

    static long countN2(int n){
        long count = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                count++;
        return count;
    }

    static long countN3(int n){
        long count = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                for (int k = 1; k <= n; k++)
                    count++;
        return count;
    }
}