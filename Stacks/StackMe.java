package Stacks;
import java.util.*;
public class StackMe {
    public static String stackreverser(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for(char a:str.toCharArray())
            stack.push(a);
        StringBuilder s = new StringBuilder();
        while(!stack.isEmpty())
            s.append(stack.pop());
        return s.toString();
    }
}
