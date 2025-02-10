import java.util.Scanner;
public class Array {
    public static void main(String[] args) {       
        int[] arr; 
        arr = new int[5];
        for(int i = 0; i <5; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}