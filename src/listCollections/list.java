package listCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class list {
void Test1 ()
{
LinkedList<Integer> ls = new LinkedList<Integer>();
ls.add(45);
ls.add(78);
ls.add(90);
ls.add(12);
ls.add(23);
ls.add(11);
ls.add(67);
ls.add(45);
System.out.println(ls);
System.out.println(ls.size());

}

void test2()
{
ArrayList<Integer> ar = new ArrayList<Integer>();
ar.add(45);
ar.add(78);
ar.add(90);
ar.add(12);
ar.add(23);
ar.add(11);
ar.add(67);
ar.add(45);
System.out.println(ar);
System.out.println(ar.size());
}

void test3()
{
Vector<Integer> vs = new Vector<Integer>();
vs.add(45);
vs.add(78);
vs.add(90);
vs.add(12);
vs.add(23);
vs.add(11);
vs.add(67);
vs.add(45);
System.out.println(vs);
System.out.println(vs.size());
}
}