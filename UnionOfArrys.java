import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArrys {
    public static void main(String[] args) {
        int arr[]  = {1 , 1 ,2,3,4,4,5,6};
        int arr2[] = {4,5,6,6};


        Set<Integer> unionSet = new HashSet<>();

        for(int i=0;i<arr.length; i++)
        {
            unionSet.add(arr[i]);
        }

         for(int i=0;i<arr2.length; i++)
        {
            unionSet.add(arr2[i]);
        }

        List<Integer> unionList = new ArrayList<>(unionSet);
        Collections.sort(unionList);

        System.out.println("Union");
        for(int i=0 ;i<unionList.size();i++)
        {
            System.out.print(unionList.get(i) + " ");
        }
        
    }
    
}
