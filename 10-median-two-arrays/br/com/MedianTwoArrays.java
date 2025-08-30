public class MedianTwoArrays {
    public double findMedian (int [] n1, int [] n2) {
        if (n1.length > n2.length) {
            return findMedian(n2, n1);
        }

        int m = n1.length;
        int n = n2.length;
        int low = 0;
        int high = m;
        int halfTotal = (m + n + 1) / 2;

        while (low <= high) {
            int participation1 = (low + high) / 2;
            int participation2 = halfTotal - participation1;

            int maxEsquerda1 = (participation1 == 0) ? Integer.MIN_VALUE : n1[participation1 - 1];
            int minDireita1 = (participation1 == m) ? Integer.MAX_VALUE : n1[participation1];

            int maxEsquerda2 = (participation2 == 0) ? Integer.MIN_VALUE : n2[participation2 - 1];
            int minDireita2 = (participation2 == n) ? Integer.MAX_VALUE : n2[participation2];

            if (maxEsquerda1 <= minDireita2 && maxEsquerda2 <= minDireita1) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxEsquerda1, maxEsquerda2) + Math.min(minDireita1, minDireita2)) / 2;
                } else {
                    return Math.max(maxEsquerda1, maxEsquerda2);
                }
            } else if (maxEsquerda1 > minDireita2) {
                high = participation1 - 1;
            } else {
                low = participation1 + 1;
            }
        }
        return 0.0;
    }
}
