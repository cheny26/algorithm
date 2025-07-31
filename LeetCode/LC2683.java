package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-31 8:19
 */
public class LC2683 {
    public boolean doesValidArrayExist(int[] derived) {
        // 第一版
        //int n=derived.length;
        //int[] origin=new int[n];
        //for(int i=0;i<n-1;i++){
        //    if(derived[i]==1){
        //        origin[i+1]=origin[i]^1;
        //    }else{
        //        origin[i+1]=origin[i];
        //    }
        //}
        //return (origin[n-1]^origin[0])==derived[n-1];

        /**
         * d[0]=O[0]^O[1],d[1]=O[1]^O[2].....d[n-1]=O[n-1]^O[0]
         * d[0]^d[1]^...^d[n-1]=(O[0]^O[1])^(O[1]^O[2])^...^(O[n-1]^O[0])
         *                     =O[0]^(O[1]^O[1])^(O[2]^...^O[n-1])O[0]
         *                     =0[0]^0^...^0^O[0]
         *                     =0
         */
        int ans=derived[0];
        for(int i=1;i<derived.length;i++){
            ans=ans^derived[i];
        }
        return ans==0;
    }
}
