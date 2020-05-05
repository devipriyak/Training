
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {
    public static void main(String args[])
    {
        Set<Double> hashset=new HashSet<Double>();//Creating Hash Set Object for Double
        hashset.add(12.89);
        hashset.add(13.89);
        hashset.add(14.89);
        hashset.add(15.89);
        System.out.println(hashset);
        System.out.println(hashset.add(12.89));//returns false if element is already existed
        System.out.println(hashset);
        System.out.println(hashset.contains(15.89));//verifies element is in set or not
        TreeSet<String> treeset=new TreeSet<String>();//Elements displayed in sorted oreder
        treeset.add("Welcome");
        treeset.add("Java");
        treeset.add("Training");
        System.out.println(treeset);
        HashSet<Double> hs=new HashSet<Double>(hashset);
        System.out.println(hs);
        hs.add(1234.78);
       LinkedHashSet<String> ls=new LinkedHashSet<String>();//Elements stored in the inserted order
       ls.add("Aditya");
       ls.add("Aditya Degree");
       ls.add("Aditya Poly");
       System.out.println(ls);
      
    }
}
