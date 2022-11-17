package IV_BinaerUndSequentiell;

public class sequentiell {
    public int sSearch(int[] data, int i){
        int tryIndex;
        for (tryIndex = 0; tryIndex < data.length ; tryIndex++) {
            if (data[tryIndex] == i){
                break;
            }
        }
        return tryIndex;
    }
}
