package interview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> lb=new ArrayList<>();
        for(int i=0;i<10;i++){
            lb.add(String.valueOf(i));
        }
        for(int i=0;i<5;i++){
            lb.add(String.valueOf(i));
        }
        System.out.println(lb);
        System.out.println(duplicateElement(lb));
    }


    public static Set<String> duplicateElement (List<String> listContainDuplicate){
        Set<String> resutSetlist = new HashSet<>();
        Set<String> tempSetlist = new HashSet<>();

        for(String yourInt :listContainDuplicate){
            if(!tempSetlist.add(yourInt)){
                resutSetlist.add(yourInt);
            }
        }
        return resutSetlist;
    }


}
