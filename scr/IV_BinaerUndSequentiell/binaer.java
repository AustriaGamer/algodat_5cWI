package IV_BinaerUndSequentiell;

public class binaer {
    public int bSearchIndex(int[] data, int i){
        long startTime = System.nanoTime() /1000;
        int lastHalf = Math.floorDiv(data.length, 2);
        int tryNum = data[lastHalf];
        int skipArray = 0;
        int skipEndArray =0;
        while (tryNum != i && lastHalf > 1){
            if (tryNum > i){
                skipEndArray = data.length-lastHalf;
                lastHalf = skipArray+ Math.floorDiv(data.length-skipEndArray-skipArray, 2);
            }else{
                skipArray = lastHalf;
                lastHalf =skipArray+ Math.floorDiv(data.length-skipArray-skipEndArray, 2);
            }
            tryNum = data[lastHalf];
        }
        System.out.println("Time taken by binaer: "+ (System.nanoTime()/1000 - startTime)+"ms");
        return lastHalf;
    }
}
