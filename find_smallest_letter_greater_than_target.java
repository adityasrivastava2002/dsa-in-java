public class find_smallest_letter_greater_than_target {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0,e=letters.length-1;
        char ans=letters[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]==target){
                s=mid+1;
            }
            else if(letters[mid]>target){
                ans=letters[mid];
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
