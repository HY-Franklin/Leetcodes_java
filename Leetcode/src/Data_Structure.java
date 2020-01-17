import javafx.util.Pair;

import javax.swing.tree.TreeNode;
import java.lang.reflect.Array;
import java.util.*;

public class Data_Structure {
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<Integer>();
        Collections.addAll(a,1,2,3,4);
        List<Integer> l=new ArrayList<Integer>();


        //For arr[]
        int[] arr={1, 4, 6, 7, 8, 9, 10};
        String str=Arrays.toString(arr);  //array to string
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);         // arr[] to ArrayList
        }

        System.out.println(Arrays.toString(arr));

        // For ArrayList
        List<Integer> t = new ArrayList<Integer>(Arrays.asList(7,6,5,4,3,2,1)); //initial
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Collections.sort(list);
        list.add(1);
        list.add(3);
        List<Pair<Integer,Integer>> li = new ArrayList<>();
        li.add(new Pair<>(1,2));
        System.out.println("ArrayList : " + list.toString());

        //Iterator
        Iterator<Integer> it=t.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }


        // For LinkedList
        List<Integer> llist = new LinkedList<Integer>();
        llist.add(2);
        llist.add(4);
        System.out.println("LinkedList : " + llist.toString());

        //Pair
        Pair<Integer,Integer> p=new Pair<>(0,0);
        System.out.println("Pair:"+p.getKey()+" "+p.getValue());

        // For Stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(3);
        stack.add(1);
        System.out.println("Stack : " + stack.toString());

        //queue
        LinkedList<Integer> q = new LinkedList<Integer>();
        Queue<Integer> qq=new LinkedList<>();
        Queue<Pair<Integer,Integer>> qt=new LinkedList<>(); qt.add(new Pair<>(100,2));
        System.out.println(qt.peek().getKey());

        //Sets
        Set<Integer> hashset=new HashSet<Integer>(Arrays.asList(5,4,3,2,1));

        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        Set<Integer> h=new HashSet<Integer>(Arrays.asList(sourceArray));

        Iterator i=h.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }

        //Map
        HashMap<Integer,Integer> m=new HashMap<>();
        Queue<HashMap<Integer,Integer>> qm=new LinkedList<>();

        m.put(1,5);
        Iterator map=m.entrySet().iterator();
        while (map.hasNext()){
            System.out.println(map.next()+" ");
        }





    }
}
