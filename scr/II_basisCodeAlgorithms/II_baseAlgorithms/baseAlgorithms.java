package II_basisCodeAlgorithms.II_baseAlgorithms;

public class baseAlgorithms {
    public static int[] revert(int[] data){
        int[] result = new int[data.length];
        
        int cnt = 0;
        for(int i = data.length - 1; i >= 0; i--) {
            result[cnt] = data[i];
            cnt++;
        }
        return result;
    }
    public static int max(int[] data){
        int result = data[0];
        for(int i = 1; i < data.length; i++){
            if(result < data[i]) result = data[i];
        }
        return result;
    }
    public static int min(int[] data){
        int result = data[0];
        for(int i = 1; i < data.length; i++){
            if(result > data[i]) result = data[i];
        }
        return result;
    }
    
}
