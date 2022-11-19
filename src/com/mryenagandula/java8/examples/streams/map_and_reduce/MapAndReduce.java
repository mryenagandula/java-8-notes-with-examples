package com.mryenagandula.java8.examples.streams.map_and_reduce;
/*
* Map and Reduce will be introduced in java 8 features inside stream api
* As you guys already know
*
* * Map is used for Transforming data
* * Reduce is used for Aggregating data
* (Combine elements of stream and produces a single value)
*
* * E.g.Stream : [2,4,6,9,1,3,7] Sum of numbers present in stream ?
*
* * Map() -> Transform Stream<Object> tp Stream of int
* * Reduce() -> Combine stream of int and produces the sum result.
*
*
* Reduce Method():
* T reduce( T identity , BinaryOperator<T> accumulator);
* identity is initial value of type T
* accumulator is a function for combining two values
*
* E.g. Integer sumResult =  Stream.of(2,4,6,9,1,3,7).reduce(0,( a , b ) -> a + b );
*
* Here  Identity : 0 which is nothing initial value
*       Accumulator : (a,b) -> a+b function.
*
* */
public class MapAndReduce {

}
