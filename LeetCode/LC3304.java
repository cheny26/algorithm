package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-03 9:17
 */
public class LC3304 {
    private final char[] s="abbcbccdbccdcddebccdcddecddedeefbccdcddecddedeefcddedeefdeefeffgbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghcddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhibccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghcddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhicddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhideefeffgeffgfggheffgfgghfgghghhieffgfgghfgghghhifgghghhighhihiij\n".toCharArray();
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder("a");
        for(int i=1;i<k;i*=2){
            for(char c:s.toString().toCharArray()){
                s.append((char)(c+1));
            }
        }
        return s.toString().toCharArray()[k-1];
    }
}
