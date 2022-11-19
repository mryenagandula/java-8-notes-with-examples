package com.mryenagandula.java8.examples.streams.maps_vs_flapmap;
/*
* Difference Between FlatMap and Map
*
* * Map() Functionalities
* - It processes stream of values
* - It does only mapping
* - Its mapper function produces single value for each input value
* - It is one to one mapping
* - Data Transformation : From Stream To Stream
* - Use this method when the mapper function producing a single value for each input value.
*
* * FlatMap() Functionalities
* - It processes stream of stream values
* - It performs mapping as well as flattering
* - It's mapper function produces multiple values for each input  value.
* - It is a One to Many mapping
* - Data Transformation : From Stream<Stream> To Stream
* - Use this method when the mapper function it producing multiple values for each input value.
*
*
* */
public class DifferenceBetweenMapAndFlatMap {

}
