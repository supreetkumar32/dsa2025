package ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class numberAppearsOnce {

	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 1, 2,3};
        int n = arr.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                System.out.println(it.getKey());
            }
        }
        //optimal
        // XOR all the elements:
//        int xorr = 0;
//        for (int i = 0; i < n; i++) {
//            xorr = xorr ^ arr[i];
//        }
//        System.out.println(xorr);

	}

}
