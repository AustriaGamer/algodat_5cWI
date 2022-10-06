package II_basiscoedeAlgorithms;

public class dataGenerator {
    public static void main(String[] args) throws Exception {
        int[] arr1 = generateDataArray(12);
        int[] arr2 = generateDataArray(13);
        int[] arr3 = generateDataArray(14);
        int[] arr4 = generateDataArray(15,10,900);
        int[] arr5 = generateDataArray(16,-12220,0);
        int[] arr6 = generateDataArray(17,-900,-12);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);
    }

    public static int[] generateDataArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int posOrNeg;
            if (Math.random() < 0.5) {
                posOrNeg = -1;
            } else {
                posOrNeg = 1;
            }

            array[i] = Math.round((float) Math.random() * 2147483647) * posOrNeg;
        }
        return array;
    }

    public static int[] generateDataArray(int size, int min, int max) throws IllegalArgumentException {
        if (min >= max) {
            throw new IllegalArgumentException("Max Value must be greater than Min Value");
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int posOrNeg;
            if (Math.random() < 0.5) {
                posOrNeg = -1;
            } else {
                posOrNeg = 1;
            }

            array[i] = Math.round((float) Math.random() * ((posOrNeg < 0) ? min : max)) * posOrNeg;
        }
        return array;
    }

public static void printArray(int[] data){
    for (int i = 0; i < data.length; i++) {
        System.out.print(String.valueOf(data[i]) + " ");
    }
}
}