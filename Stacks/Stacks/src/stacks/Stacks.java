package stacks;

import java.util.*;

public class Stacks {

    public static ArrayList<Integer> stack = new ArrayList<>();
    public static int stacksize;
    public static int push = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finished = false;

        while (finished == false) {

            Collections.sort(stack, Collections.reverseOrder());
            stacksize = stack.size();
            for (int i = 0; i < stacksize; i++) {
                System.out.println(stack.get(i));
            }
            System.out.println("");
            System.out.println("add, remove, or end");
            String select = sc.next();

            switch (select) {
                case ("add"):
                    add();
                    break;
                case ("remove"):
                    remove();
                    break;
                case ("end"):
                    finished = true;
                    break;
            }
        }
    }

    public static void add() {
        System.out.println("");
        if (stacksize < 6) {
            stack.add(push);
            push++;
        } else {
            System.out.println("Stack is full...");

            System.out.println("");
        }
    }
    public static void remove(){
        System.out.println("");
        if(stacksize>0){
            stack.remove(0);
            push--;
        }else{
            System.out.println("Stack is empty...");
        }
        System.out.println("");
    }
}
