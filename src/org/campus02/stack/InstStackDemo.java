package org.campus02.stack;

import org.campus02.stack.exceptions.StackEmptyExceptions;

public class InstStackDemo {
    public static void main(String[] args) {
        try {

            //kritischer code
            IntStack stack = new IntStack(2);
            stack.pop();
            stack.push(1);
            int value = stack.pop();
            System.out.println(value);

            stack.pop();
            stack.push(3);
            stack.push(4);
            stack.push(4);
        /*}
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Exception gefangen");
        }*/
        }
        catch (StackEmptyExceptions e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
