package ex_27_Collection_Framework.list;

import java.util.LinkedList;
import java.util.List;

public class Lab235_LL_List
{
    public static void main(String[] args) {
//        List mylist  = new ArrayList();
        List mylist  = new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        System.out.println(mylist);
    }
}
