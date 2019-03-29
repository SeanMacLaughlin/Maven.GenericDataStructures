package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = (E[])new Object[0];
    }

    public void push(E element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    public Object pop() {
        Object smol = elements[elements.length-1];
        elements=Arrays.copyOf(elements,elements.length-1);
        return smol;
    }


    public Boolean isEmpty() {
        return elements.length == 0;
    }

}
