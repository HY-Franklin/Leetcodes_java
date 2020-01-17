import java.util.*;

public class launchcode {
    static void smallest(List<Integer> x) {

        int lowest = Integer.MAX_VALUE;
        HashMap<Integer,ArrayList<Integer>> indices=new HashMap<>();

        for (int i = 0; i < x.size(); i++) {
            if (lowest>x.get(i)) lowest=x.get(i);
            if (indices.containsKey(x.get(i)))  indices.get(x.get(i)).add(i);
            indices.putIfAbsent(x.get(i),new ArrayList<Integer>(Arrays.asList(i)));
        }

        System.out.println(lowest); //the smallest value
        System.out.println(indices.get(lowest).toString());  //all indices of the smallest values


    }

    public static void main(String[] args) {
        List<Integer> test=new ArrayList<>();
        //test cases below
//        Collections.addAll(test,-1, -7, 1, 5, -7, 0);
//        Collections.addAll(test,1,2,34,5,6,1,1,1);
        Collections.addAll(test,123,234,5236,1235,-100,111,-100,50);
        smallest(test);
    }

}

