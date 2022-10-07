package II_basisCodeAlgorithms.I_basis;

public class dataGenerator {
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
    System.out.println("\n");
}
}