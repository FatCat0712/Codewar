import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List_Filtering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> lst = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Integer){
                lst.add( list.get(i));
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        List<Object> sample = new ArrayList<>(List.of(1, 2, "a", "b"));
        System.out.println(filterList(sample));
        
    }
}
