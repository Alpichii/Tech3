package arrayList;

import arrays.CharArray;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('5');
        chars.add('&');
        chars.add(3, 'Z');

        System.out.println(chars);
    }
}
