package headfirst.designpatterns.adapter.TryEnumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumIterator implements Iterator<String> {

    public volatile static EnumIterator uniqueInstance;
    private Enumeration<String> enumeration;

    private EnumIterator(Enumeration<String> e) {
        this.enumeration = e;
    }

    public static EnumIterator getInstance(Enumeration<String> e) {
        if (null == uniqueInstance) {
            synchronized(EnumIterator.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new EnumIterator(e);
                }
            }
        }
        return uniqueInstance;
    }
    
    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public String next() {
        return this.enumeration.nextElement();
    }
}