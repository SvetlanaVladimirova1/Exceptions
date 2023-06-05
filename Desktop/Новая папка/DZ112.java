import java.util.ArrayList;
import java.util.Arrays;
public class DZ112 {
public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9, 11};
    int[] arr2 = {2, 4, 4, 6, 7};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(sumArr(arr1, arr2));
}

public static ArrayList<Integer> sumArr(int[] a1, int[] a2) {
    ArrayList<Integer> res = new ArrayList<>();
    if (a1.length != a2.length){
        throw new RuntimeException("Длины массивов не равны!");
    }
    for (int i = 0; i < a1.length; i++) {
        res.add(a1[i] - a2[i]);
    }
    return res;
}
}
