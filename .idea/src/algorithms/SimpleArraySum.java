package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(23);

        System.out.println(simpleArraySum(list));
    }


    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int i = 0 ; i < ar.size();i++){
            sum+=ar.get(i);
        }
        return sum;
    }
}
