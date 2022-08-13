package jenkins;

import java.util.Scanner;
import java.util.Stack;

public class Stack001 {

    static String str;
    static Stack stack =new Stack<>();

    public static void main(String[] args) {

        stackMethod();
        System.out.println("stack = " + stack.contains("hello"));


    }

    public static void stackMethod(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Write a String to add, Enter 'X' to exit");
            str = scan.nextLine();
            if (!str.equals("X")){
                stack.push(str);
            }
        }while (!str.equals("X"));
        scan.close();
        System.out.println(stack);

    }
}
