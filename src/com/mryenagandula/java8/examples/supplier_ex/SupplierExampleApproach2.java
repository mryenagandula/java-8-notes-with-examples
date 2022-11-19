package com.mryenagandula.java8.examples.supplier_ex;

import java.util.function.Supplier;

public class SupplierExampleApproach2 {

    public static void main(String[] args) {
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "Hello !!!";
            }
        };
        System.out.println(supplier.get());
    }
}
