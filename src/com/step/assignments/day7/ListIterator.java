package com.step.assignments.day7;

import java.util.List;

public class ListIterator {
    private List list;
    private int counter = 0;

    public ListIterator(List list){
        this.list = list;
    }

    public boolean hasNext(){
        return this.list.size() > this.counter;
    }

    public Object next() {
        int index = this.counter;
        this.counter++;
        if(this.list.size() > index)
            return this.list.get(index);
        return "No such element it contains" ;

    }
}
