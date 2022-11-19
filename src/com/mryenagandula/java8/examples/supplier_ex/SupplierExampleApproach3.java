package com.mryenagandula.java8.examples.supplier_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExampleApproach3 {
    public static void main(String[] args) {
        System.out.println("SupplierExampleApproach3.main");
        Supplier supplier = ()-> {
            return "Hello Java 8";
        };
        System.out.println(supplier.get());
        List list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()-> "Result not found"));
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
