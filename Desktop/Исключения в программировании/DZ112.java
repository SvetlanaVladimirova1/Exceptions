import java.util.ArrayList;
import java.util.Arrays;
public class DZ112 {
    public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9, 11};
    int[] arr2 = {2, 4, 4, 6, 7};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arr3(arr1, arr2));
}

public static ArrayList<Integer> Arr3(int[] arr1, int[] arr2) {
    ArrayList<Integer> res = new ArrayList<>();
    if (arr1.length != arr2.length){
        throw new RuntimeException("Длины массивов не равны!");
    }
    for (int i = 0; i < arr1.length; i++) {
        res.add(arr1[i] - arr2[i]);
    }
    return res;
}
}
