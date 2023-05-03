import java.util.HashSet;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        int[] arr={1,1,5,3,1,6,5};
        Set<Integer> dublicat=new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(!dublicat.add(arr[i])){
                System.out.println("Dublicat elemnt: " +arr[i]);
            }
        }

    }
}
