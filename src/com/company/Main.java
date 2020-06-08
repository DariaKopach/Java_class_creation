/*
 * Java class creation
 *
 * Version from 07.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 * Create a class from the attached document according
 * to the order in your group (4. Parallelogram). The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        // create the first parallelogram

        Parallelogram FirstParallelogram = new Parallelogram(7,
                5,
                Math.PI / 4);

        // Example of using toString() method

        System.out.println(FirstParallelogram);

        // Example of using hash() method

        System.out.println("Hash Code of First Parallelogram = "
                + FirstParallelogram.hashCode());

        // create the second parallelogram

        Parallelogram SecondParallelogram = new Parallelogram(4,
                4,
                Math.PI / 4);

        System.out.println(SecondParallelogram);

        System.out.println("Hash Code of the Second Parallelogram = "
                + SecondParallelogram.hashCode());

        // Comparison of parallelograms using the equals() method

        System.out.println("Is the First Parallelogram equal to" +
                " the Second Parallelogram - " +
                FirstParallelogram.equals(SecondParallelogram));

    }
}
