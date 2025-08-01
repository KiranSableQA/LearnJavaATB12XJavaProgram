package ex_27_Collection_Framework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_ArrayList
{
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        list.add(4);  //4
        list.add(true);  //5

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list


        System.out.println(list);
        System.out.println(" ----- ");
// Ways to print element in array list
//        1st way
        for (int i = 0; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(" ----- ");
//        2nd way
        for (Object o:list)
        {
            System.out.println(o);
        }
        System.out.println(" ----- ");
//       3rd way
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
