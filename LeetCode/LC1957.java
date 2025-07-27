package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-21 10:43
 */
public class LC1957 {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char[] cs=s.toCharArray();
        char pre=cs[0];
        int count=1;
        sb.append(pre);
        for(int i=1;i<cs.length;i++){
            if(cs[i]!=pre){
                sb.append(cs[i]);
                pre=cs[i];
                count=0;
            }else if(count<2){
                sb.append(cs[i]);
                count++;
            }
        }
        return sb.toString();
    }
}
