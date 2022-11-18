package IV_BinaerUndSequentiell;

public class sequentiell {
    public int sSearch(int[] data, int i){
        long startTime = System.nanoTime() /1000;
        int tryIndex;
        for (tryIndex = 0; tryIndex < data.length ; tryIndex++) {
            if (data[tryIndex] == i){
                break;
            }
        }
        System.out.println("Time taken by sequentiell: "+ (System.nanoTime()/1000 - startTime) +"ms");
        return tryIndex;
    }
}
