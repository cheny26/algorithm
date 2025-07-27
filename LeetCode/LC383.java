package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-13 15:28
 */
public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countR=new int[26];
        int[] countM=new int[26];
        for(char c:ransomNote.toCharArray()){
            countR[c-'a']++;
        }
        for(char c:magazine.toCharArray()){
            countM[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(countR[i]!=0 && countM[i]<countR[i])
                return false;
        }
        return true;
    }
}
