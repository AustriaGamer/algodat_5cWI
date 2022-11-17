package IV_BinaerUndSequentiell;

public class binaer {
    public int bSearchIndex(int[] data, int i){
        int lastHalf = Math.floorDiv(data.length, 2);
        int tryNum = data[lastHalf];
        while (tryNum != i && lastHalf > 1){
            if (tryNum > i){
                lastHalf = Math.floorDiv(lastHalf, 2);
            }else{
                lastHalf =lastHalf+ Math.floorDiv(lastHalf, 2);
            }
            tryNum = data[lastHalf];
        }
        return lastHalf;
    }
}
