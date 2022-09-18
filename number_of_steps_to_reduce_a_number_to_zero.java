public class number_of_steps_to_reduce_a_number_to_zero {
    public static void main(String[] args) {
        System.out.println(number(4,0));
    }
    public static int number(int num,int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return number(num/2,c+1);
        }
        else{
            return number(num-1,c+1);
        }
    }
}
