import java.util.*;

class First{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String>  strList = new ArrayList<>();


        // adding elements to arraylist
       
        list.add(56);
        list.add(5);
       
        System.out.println(list);

        // get elements
        int elements= list.get(1);
        System.out.println(elements);


        // adding elements in between 

        list.add(1, 59);
        System.out.println(list);


        // set element
        list.set(0, 48);
        System.out.println(list);
    }
}