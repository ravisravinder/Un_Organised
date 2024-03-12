// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] array = {6,9,8};  
List<Integer> list = new ArrayList<>();  
list.add(array[0]);   
list.add(array[2]);  
list.set(1, array[1]);     
list.remove(0);   
System.out.println(list);   
        System.out.println("Try programiz.pro");
    }
}
