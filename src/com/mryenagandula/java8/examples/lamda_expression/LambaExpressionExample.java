package com.mryenagandula.java8.examples.lamda_expression;
/*
* The Expression through which we can represent an Anonymous function.
*
* Anonymous : Nameless / Unknown
* Anonymous function : A method don't have any name or modifier
*
* Syntax:   Parameter       Expression      Body
*           ()                  ->          System.out.println("Lamda Expression");
*
* () -> {body}
*/
public class LambaExpressionExample {

    public static void main(String[] args) {
        /* Without lamda expression*/
        Mobile mobile = new Mobile() {
            @Override
            public void pressLock() {
                System.out.println("Please press the lock button to open the mobile");
            }
        };
        mobile.pressLock();

        /* with lamda expression */
        Mobile samsungMobile = () -> System.out.println("Please press the lock button and draw pattern to open the mobile");
        samsungMobile.pressLock();

        Laptop laptop = new Laptop() {
            @Override
            public void start() {
                System.out.println("Laptop started and windows 10 is loading....");
            }
        };

        laptop.start();

        Laptop hpLaptop = () -> System.out.println("Hp laptop is started and windows 11 is loaded.");
        hpLaptop.start();

        Car car = new Car(){
            @Override
            public void startEngine() {
                System.out.println("Car engine started");
            }
        };
        car.startEngine();

        Car suzukiCar = () -> System.out.println("Suzuki Car Engine Started.");
        suzukiCar.startEngine();
    }
}
