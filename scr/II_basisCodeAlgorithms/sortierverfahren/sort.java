package II_basisCodeAlgorithms.sortierverfahren;

import java.util.ArrayList;

public class sort {
    public static int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }
    public static int[] bubbleSort(int[] data) {
        int changes;
        do {
            changes = 0;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                    changes++;
                }
            }
        } while (changes != 0);
        return data;
    }
    public static int[] insertionSort(int[] data) {
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int integer : data) {
            for (int i = 0; i < data.length; i++) {
                if (sorted.size() == 0) {
                    sorted.add(integer);
                    break;
                }
                if (sorted.get(i) < integer) {
                    sorted.add(i, integer);
                    break;
                }
            }
        }
        int[] res = new int[sorted.size()];
        int cnt = 0;
        for (Integer integer : sorted) {
            res[cnt] = integer;
            cnt++;
        }
        return res;
    }

}
