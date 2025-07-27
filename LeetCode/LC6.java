package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-05 19:17
 */
public class LC6 {
    public static String convert(String s, int numRows) {
        int l=s.length()/(2*numRows-2)+numRows+5;
        char[] tmp=s.toCharArray();
        char[][] t=new char[numRows][l];
        t[0][0]=tmp[0];
        boolean flag=true;
        int count=numRows-1;
        int x=1,y=0;
        for(int i=1;i<tmp.length;){
            while(count>0 && i<tmp.length){
                if(flag){
                    t[x][y]=tmp[i++];
                    x++;
                }else{
                    t[x-1][y+1]=tmp[i++];
                    x--;
                    y++;
                }
                count--;
            }
            flag=!flag;
            count=numRows-1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<l;j++){
                if(t[i][j]!=' '){
                    sb.append(t[i][j]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
