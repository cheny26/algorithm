package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author chen_y
 * @date 2025-07-06 8:28
 */
public class LC1865 {
    class FindSumPairs {

        int[] arr1;
        int[] arr2;
        int[] arr3=new int[10000000];
        HashMap<Integer,Integer> help=new HashMap<>();

        public FindSumPairs(int[] nums1, int[] nums2) {
            arr1 = Arrays.copyOf(nums1, nums1.length);
            arr2=new int[nums2.length];
            for(int i=0;i< nums2.length;i++){
                arr2[i]=nums2[i];
                arr3[arr2[i]]++;
                //help.put(nums2[i],help.getOrDefault(nums2[i],0)+1);
            }
        }

        public void add(int index, int val) {
            int pre=arr2[index];
            arr3[pre]--;
            arr3[pre+val]++;
            //help.put(pre,help.get(pre)-1);
            //help.put(pre+val,help.getOrDefault(pre+val,0)+1);
            arr2[index]=pre+val;
        }

        public int count(int tot) {
            int count=0;
            for(int i: arr1){
                //count+= help.getOrDefault(tot-i,0);
                count+=(tot-i>0 && tot-i< arr3.length)?arr3[tot-i]:0;
            }
            return count;
        }
    }

}
