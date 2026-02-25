package cau3;
public class Bai1 {
    public static void check(int[] arr) {
        int n = arr.length;
        int countNeg = 0, countZero = 0, countPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                countNeg++;
            else if (arr[i] == 0)
                countZero++;
            else
                countPos++;
        }
        int[] neg = new int[countNeg];
        int[] zero = new int[countZero];
        int[] pos = new int[countPos];
        int cNeg = 0, cZero = 0, cPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                neg[cNeg++] = arr[i];
            else if (arr[i] == 0)
                zero[cZero++] = arr[i];
            else
                pos[cPos++] = arr[i];
        }
        for (int i = 0; i < neg.length - 1; i++) {
            for (int j = i + 1; j < neg.length; j++) {
                if (neg[i] < neg[j]) {
                    int temp = neg[i];
                    neg[i] = neg[j];
                    neg[j] = temp;
                }
            }
        }

        for (int i = 0; i < pos.length - 1; i++) {
            for (int j = i + 1; j < pos.length; j++) {
                if (pos[i] > pos[j]) {
                    int temp = pos[i];
                    pos[i] = pos[j];
                    pos[j] = temp;
                }
            }
        }

        int index = 0;

        for (int i = 0; i < neg.length; i++)
            arr[index++] = neg[i];

        for (int i = 0; i < zero.length; i++)
            arr[index++] = zero[i];

        for (int i = 0; i < pos.length; i++)
            arr[index++] = pos[i];
    }
    public static void main(String[] args) {
        int[] arr = {4, -1, 0, 2, -5, 0, 9, -2};
        check(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
