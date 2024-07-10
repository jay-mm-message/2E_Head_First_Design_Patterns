package headfirst.designpatterns.adapter.TryEnumerationIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Test {

    public static void show(Vector<?> vector) {
        Enumeration<?> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            Object element = enumeration.nextElement();
            System.out.print(element);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static void main(String [] args) {
        Vector<Character> v1 = new Vector<Character>();
        Character ch = 'A';
        for(int i = 0 ; i < 20 ; ++i) {
            v1.add(ch);
            ++ch;
        }

        Vector<Integer> v2 = new Vector<Integer>();
        Integer num = 1;
        for(int i = 0 ; i < 20 ; ++i) {
            v2.add(num);
            ++num;
        }

        show(v1);
        show(v2);

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Iterator<String> iterator = list.iterator();

        // while (iterator.hasNext()) {
        //     String element = iterator.next();
        //     System.out.println(element);
        // }

        Enumeration<String> enumeration = Collections.enumeration(list);
        EnumIterator enumIterator = EnumIterator.getInstance(enumeration);

        while(enumIterator.hasNext()) {
            System.out.print(enumIterator.next());
            System.out.print(' ');
        }
        System.out.println();
    }
}