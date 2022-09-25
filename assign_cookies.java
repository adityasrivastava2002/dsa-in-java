import java.util.*;
public class assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        // int c=0;
        int j=0;
        for(j=0;i<g.length && j<s.length;j++){
            // if(j>s.length-1){
            //     return c;
            // }
            if(s[j]>=g[i]){
                // c++;
                i++;
            }
        }
        return i;
    }
}
