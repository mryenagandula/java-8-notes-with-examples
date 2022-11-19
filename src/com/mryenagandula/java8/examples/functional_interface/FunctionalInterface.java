package com.mryenagandula.java8.examples.functional_interface;
/*
* The Expression through which we can represent an Anonymous function.
*
* The Interface who contains only one abstract method but can have multiple default and static method
* is called functional interface
*
* E.g.
* Runnable -> run()
* Callable -> call()
* Comparable -> compareTo()
* Comparator -> compare()
*
*/

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    String message = "Hello";
    void greetings();

    default String sayHello(){
      return "Hello";
    }
    default String sayBye() {
        return "Hello";
    }

    static String getDefaultMessage(){
        return "Hello";
    }
}
