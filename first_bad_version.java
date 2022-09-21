public class first_bad_version {
    public int firstBadVersion(int n) {
        int s=1,e=n;
        return search(s,e);
        
    }
    public int search(int s, int e){
        if(s>e){
            return s;
        }
        int mid=s+(e-s)/2;
        if(isBadVersion(mid)){
             return search(s,mid-1);
        }
        else{
             return search(mid+1,e);
        }
        // return s;
    }
}
