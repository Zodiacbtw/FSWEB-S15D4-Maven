package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

}
