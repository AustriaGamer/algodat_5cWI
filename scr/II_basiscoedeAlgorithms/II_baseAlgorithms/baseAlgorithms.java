package II_basiscoedeAlgorithms.II_baseAlgorithms;

public class baseAlgorithms {
    public static int[] revert(int[] data){
        int[] result = new int[data.length];
        
        for(int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < data.length; j++){
                result[j] = data[i];
            }
        }
        return result;
    }
    public static int max(int[] data){
        int result = 0;
        
        return result;
    }
    
}
