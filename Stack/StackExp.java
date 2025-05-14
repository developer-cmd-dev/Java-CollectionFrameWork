package Stack;

import java.util.List;
import java.util.Stack;

public class StackExp {
    public static void main(String[] args) throws InterruptedException {
        char[] name={'D','E','V',' ','K','U','M','A','R'};
        Stack<Character> chars= new Stack<>();
        for (int i = 0; i < name.length; i++) {
            Thread.sleep(300);
            chars.add(name[i]);
            System.out.print(chars.get(i));
        }



        System.out.println(chars);

    }
}
