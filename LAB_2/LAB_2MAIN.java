package com.company.LAB_2;

public class LAB_2MAIN {
    public static void main(String[] args) {
        ///////////////////////////////////////////5-6//////////////////////////////////////////////////////////////////
        Box b1 = new Box();
        Box b2 = new Box(8, 4, 5);
        Box b3 = new Box(10);
        //////////////////////////////////////////7-8///////////////////////////////////////////////////////////////////
        Queue queue1 = new Queue(3);
        queue1.push(88);
        queue1.push(9);
        queue1.push(76);
        queue1.pop();// will delete the 88 number from queue
        queue1.push(33);

        Queue queue2 = new Queue();
        queue2.push(90);
        queue2.push(332);
        queue2.push(21);

        Queue queue3 = new Queue(3);


        System.out.println("Last added value in queue1 is: " + queue1.list.get(queue1.elements - 1));
        System.out.println("Last added value in queue2 is: " + queue2.list.get(queue2.elements - 1));
        ///////////////////////////////////////9-10/////////////////////////////////////////////////////////////////////
        System.out.println("b2 Area is: " + b2.area() + " b2 volume is: " + b2.volume());
        System.out.println(queue3.ver_if_empty());
        System.out.println(queue2.ver_if_empty());

        System.out.println(queue1.ver_if_full());
        System.out.println(queue2.ver_if_full());
        System.out.println(queue3.ver_if_full());


    }
}
