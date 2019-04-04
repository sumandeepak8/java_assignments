package com.step.assignments;
public class temp implements temp1{
    private String name;
    private int age;

    public String getName(){
      return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age > 16;
    }

    public temp(String name, int age){
        this.name =  name;
        this.age = age;
    }


    public static void main(String[] args) {

        temp tmp = new temp("Annapoorna", 20);
        System.out.println(tmp.isTeen());
        System.out.println(tmp.getAge() + " this is age " + tmp.getName() + " this is name ");

        temp1 temp1 = new temp("suman", 21);
        System.out.println("this is my name " + temp1.getName());
        System.out.println("this is my age " + temp1.getAge());
        System.out.println(((temp) temp1).isTeen()); //  it is typecasting from type temp to temp1 .so that isTeen method will be available for temp1 object variable.

//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.add(i+1);
//            System.out.println(linkedList.get(i) + " element of list");
//            System.out.println(linkedList.size() + " it is size of this list");
//        }
//        ListIterator listIterator = linkedList.listIterator(5);
//        System.out.println(listIterator.hasPrevious() + " is has previous");
//        System.out.println(listIterator.hasNext() + " is has next" );

    }
}
