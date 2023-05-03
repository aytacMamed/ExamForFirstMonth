import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
    public static void main(String[] args) {
        String text="salam necesen salam yaxsiyam sen necesen";
        String[] words=text.split(" ");
        Map<String,Integer> map=new HashMap<>();

       for(String word:words) {
           if(map.containsKey(word)){
               int count=map.get(word);
               count++;
               map.put(word,count);
           }
           else {
               map.put(word,1);
           }
       }

        System.out.println(map);


    }
}
