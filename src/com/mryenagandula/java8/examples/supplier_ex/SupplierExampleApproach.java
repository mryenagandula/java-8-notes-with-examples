package com.mryenagandula.java8.examples.supplier_ex;

import java.util.function.Supplier;

public class SupplierExampleApproach implements Supplier {

    @Override
    public Object get() {
        return "Hello MrYenagandula";
    }

    public static void main(String[] args) {
        System.out.println("SupplierExampleApproach.main");
        SupplierExampleApproach supplierExampleApproach = new SupplierExampleApproach();
        System.out.println(supplierExampleApproach.get());
    }
}
