package II_basisCodeAlgorithms.I_basis;

import java.util.concurrent.ThreadLocalRandom;

public class dataGenerator {
    public static int[] generateDataArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            long nextInt=Math.round((float) Math.random() * 2147483647*2);
            array[i] = (int) (nextInt - 2147483647);
        }
        return array;
    }

    public static int[] generateDataArray(int size, int min, int max) throws IllegalArgumentException {
        if (min >= max) {
            throw new IllegalArgumentException("Max Value must be greater than Min Value");
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    public static String timeTaken(long time) {
        long res = System.nanoTime() - time;
        return Long.toString(res);
    }

    public static void printArray(String s, int[] data) {
        System.out.print(s);
        printArray(data, true);
    }

    public static void printArray(int[] data, boolean takeTime) {
        long time = System.nanoTime();
        printArray(data);
        System.out.print("  Time: " + timeTaken(time) + "ns");
        System.out.println();
    }

    public static void printArray(int[] data) {
        System.out.println();
        for (int i = 0; i< data.length && i < 100; i++) {
            System.out.print(String.valueOf(data[i]) + " ");
            if(i == 99) System.out.print(" ...");
        }

    }
}