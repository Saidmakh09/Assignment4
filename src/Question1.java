import java.util.Stack;

public class Question1 {


//The capacity of k = 10
    //Therefore when a stack is created, it made with 10 nodes?

    //.peak -> peaks at the head node


    public static void main(String []args ){
        Stack k = new Stack<>();
        k.push(3);
        k.push(4);
        k.push(k.pop());

        System.out.println(k.pop());


        System.out.println(k.capacity());
        System.out.println(k.peek());



//        for(int i = 0; i < k.capacity(); i++){
//            System.out.println(k.peek());
//
//        }




    }


}
