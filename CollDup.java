import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollDup 
{
  public static void main( String[] args )
  {
    List<String> list = new ArrayList<String>();
    list.add("JAVA");
    list.add("JAVASCRIPT");
    list.add("SPRING");
    list.add("JAVA");
    list.add("ANGULAR");
    System.out.println("The items in List are:");
    for (String temp : list)
    {
      System.out.println(temp);
    }
    System.out.println("\n======== ");
    Set<String> set = new HashSet<String>(list);
    System.out.println("\nSet collections removes the duplicates and the items in set are now:");
    for (String temp : set)
    {
      System.out.println(temp);
    }
  }
}
