package com.mryenagandula.java8.examples.streams.maps_vs_flapmap;
/*
* Map() & Flatmap() is introduced in java8
* Java 8 Stream API provides map() and flatMap() method. Both these Methods
* Are intermediate and returns another stream as part of the output.
*
* - map() method is used for transformation
* - flatMap() method is used for transformation and flattering.
*
* If I simply say flatMap() is map()+flattering().
*
* ***map() method -> Data Transformation
* Stream<R> map(Stream<T> input){}
*
* -It's mapper function produces the single value for each input value.
*  Hence, it is also called One-To-One mapping.
*
*  flatMap() method -> map() + Flattering
*  - flatMap() takes Stream<Stream<T>> as input and return Stream<R>
*  - Stream<R> map(Stream<Stream<T>> input)
*  - It's mapper function produces multiple value for each input value.
*    Hence, it is also called One-To-Many mapping.
*
*  Data Transformation
*  Stream.of("a","b","c","d"); -> ["A","B","C","D"]  (lowercase data -> uppercase data)
*
*  Flattering
*  Stream of stream data     ->  stream of data
*  [[1,2],[2,3],[3,4,5],[6,7,8]]; -> [1,2,2,3,3,4,5,6,7,8]
*
* */
public class MapAndFlatmap {
}
