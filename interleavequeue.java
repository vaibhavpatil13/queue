import java.util.*;

public class interleavequeue{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        q.add(4);
        q.add(5);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();

        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());     //[1,2,3,4,5]
        }

        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove()); //[6,7,8,9,10,1]
            q.add(q.remove());  //[7,8,9,10,1,6]
            
        }
    }
}