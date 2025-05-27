import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void funcArrayList(){
        ArrayList<Integer> listNum = new ArrayList<>();
        System.out.println("Is Empty : " + listNum.isEmpty());

        for(int i = 0; i <= 4; i++){
            listNum.add(i+1 * 100);
        }

        System.out.println("Is Empty : " + listNum.isEmpty());

        System.out.println("add element");
        listNum.add(0,0);
        System.out.println(listNum);

        System.out.println("add element by index");
        listNum.set(1, 201);
        System.out.println(listNum);

        System.out.println("remove element by index");
        listNum.remove(5);
        System.out.println(listNum);

        System.out.println("remove element by value");
        //listNum.remove(103);
        System.out.println(listNum);

        System.out.println("Size of List: " + listNum.size());

       System.out.println("Is Contains value '0': " + listNum.contains(0)); 

        System.out.println(listNum);
        System.out.println(listNum.get(4));
        
    }

    public static void funcIterator(){
        
        ArrayList<Integer> listNum = new ArrayList<>();

        for(int i = 0; i <= 4; i++){
            listNum.add(i+1 * 100);
        }
        Iterator<Integer> itList = listNum.iterator();
        System.out.println(listNum);

        System.out.println("Is Empty : " + listNum.isEmpty());

        System.out.println("First Element : " + itList.next());
        System.out.println("Second Element : " + itList.next());

        while (itList.hasNext()) {
            int num = itList.next();
            if ( num == 103) {
                itList.remove();
            }else{
                System.out.println(num);
            }
        }
    }

    public static void main(String args[]){
        //funcArrayList();
        funcIterator();
    }
}