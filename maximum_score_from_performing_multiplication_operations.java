public class maximum_score_from_performing_multiplication_operations {
    public static void main(String[] args) {
        int nums[]={555,526,732,182,43,-537,-434,-233,-947,968,-250,-10,470,-867,-809,-987,120,607,-700,25,-349,-657,349,-75,-936,-473,615,691,-261,-517,-867,527,782,939,-465,12,988,-78,-990,504,-358,491,805,756,-218,513,-928,579,678,10};
        int multipliers[]={783,911,820,37,466,-251,286,-74,-899,586,792,-643,-969,-267,121,-656,381,871,762,-355,721,753,-521};
        int i,score=0,j=nums.length-1,n=1,c=0;
        
            if(nums.length==multipliers.length){
                for(i=0;i<multipliers.length;i++)
                score=score+(multipliers[i]*nums[j-i]);
            }
            else{
                n=(multipliers.length/2)+1;
                for(i=0;i<n;i++){
                    score=score+(multipliers[i]*nums[i]);
                    c++;
                }
                i=0;
                while(c<multipliers.length){
                    score=score+(multipliers[c]*nums[j-i]);
                    i++;
                    c++;
                }
            }
        
     System.out.println(score);
    }
}
