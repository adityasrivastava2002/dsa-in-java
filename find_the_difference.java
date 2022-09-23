import java.util.*;
public class find_the_difference {
    public char findTheDifference(String s, String t) {
        int[] ch1=new int[s.length()];
        int[] ch2=new int[t.length()];
        int i;
        for(i=0;i<s.length();i++){
            ch1[i]=s.charAt(i);
        }
        for(i=0;i<t.length();i++){
            ch2[i]=t.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                break;
            }
        }
        return (char)ch2[i];
    }
}
