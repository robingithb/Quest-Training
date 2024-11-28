package com.quest.collections;

import javax.imageio.stream.ImageInputStream;
import java.util.Iterator;
import java.util.Stack;

public class Collection2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
//        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(1));
        System.out.println(stack.add(4));
        System.out.println(stack);
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(stack.size());
    }
}
