package IV_BinaerUndSequentiell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] data;
        if(true) {
            data = readFromFile();
            System.out.println(printArray(data));
        }else {
            data = new int[10000];
            for (int i = 0; i < 10000; i++) {
                data[i] = i;
            }
        }
        sequentiell s = new sequentiell();
        binaer b = new binaer();
        System.out.println((s.sSearch(data, 9520845)));
        System.out.println((b.bSearchIndex(data, 9520845)));

    }
    public static int[] readFromFile()
            throws FileNotFoundException
    {
        File f = new File("/home/patrick/Documents/Git-Repos/algodat_5cWI/scr/IV_BinaerUndSequentiell/test.txt");
        Scanner fileIn = new Scanner (f);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(Integer.parseInt("34"));
        System.out.println(fileIn.hasNext());
        while (fileIn.hasNext()){ // quit when you encounter ‘Q’
            String t = fileIn.next().replace(",","");
            int num =Integer.parseInt(t);
            list.add(num);

        }// end while
        fileIn.close();
        int[] back = new int[list.size()];
        for (int i:list) {
            back[list.indexOf(i)] = i;
        }
        return back;
    } // end readFromFile

    public static String printArray(int[] readFromFile){
        String str = "";
        for(int i = 0; i < 10; i++){
            str = str + Integer.toString(readFromFile[i]) + " ";
        }
        return str;
    }
}
