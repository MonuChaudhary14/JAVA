package Java_Collection_Framework;

import java.util.List;
import java.util.Stack;

public class Stackk {

    public static void main(String[] args) {

        /*
        Stack is a data structure that follows the LIFO principle meaning that last element added is the first to be removed.
        It is a part of java.util package and extends vector class methods means it has all vector methods

        Vector is similar to ArrayList, difference being vector are synchronized, whereas ArrayList are not.
        since stack extends Vector and Vector implements List , so all the methods of list are available
         */

        Stack<Integer> num = new Stack<>();   // All the methods of list and vector can be used
        List<Integer> stack = new Stack<>();   // In which we cannot use Stack methods like push
        num.push(45);
        num.push(65);
        num.push(75);
        num.push(85);
        num.push(95);
        num.push(78);
        num.add(45);


        System.out.println(num);

        System.out.println(num.search(75));  // The count start from the last so its value is 5

        System.out.println(num.pop());  // It removes the element from the stack and also returns it , it throws EmptyStackException if the stack is empty
        num.pop();  // It can also be used like this

        System.out.println(num);

        System.out.println(num.get(2));   // This is the function of vector we get result from the index 0 and starting with the first input

        System.out.println(num.indexOf(1));
        System.out.println(num.indexOf(85));










    }

}
