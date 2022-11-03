
package com.kharileigh.staticblockdemo;

/**
 *
 * @author kharileigh
 */

class StaticBlockDemo {

    // static block
    static {
        System.out.println("I am STATIC block");
    } 
		

    // instance block
    {
        System.out.println("I am INSTANCE block");
    }


    // constructor
    public StaticBlockDemo() {
        System.out.println("I am CONSTRUCTOR of class");
    }

}

class Derived extends StaticBlockDemo {

    // static block
    static {
        System.out.println("I am STATIC block - Derived");
    } 
		

    // instance block
    {
        System.out.println("I am INSTANCE block - Derived");
    }


    // constructor
    public Derived () {
        System.out.println("I am CONSTRUCTOR of Derived class");
    }

}


public class StaticBlockDemoClass {
    
    public static void main(String args[]) {

        // StaticBlockDemo ob1 = new StaticBlockDemo();
        // StaticBlockDemo ob2 = new StaticBlockDemo();

        Derived dObj = new Derived();
        
    }
}
