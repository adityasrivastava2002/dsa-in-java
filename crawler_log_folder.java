public class crawler_log_folder {
    public int minOperations(String[] logs) {
        int c=0;
        for(int i=0;i<logs.length;i++){
            if("./".equals(logs[i])){
                continue;
            }
            else if("../".equals(logs[i])){
                c--;
                if(c<=0){
                    c=0;
                }
            }
            else{
                c++;
            }
        }
        if(c<=0) {
            return 0;
        }
        return c;
    }
}
