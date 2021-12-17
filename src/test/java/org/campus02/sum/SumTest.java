package org.campus02.sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private Sum sum;
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;
    @BeforeEach
    void setUp() {
        sum = new Sum();

        list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);

        list2 = new ArrayList<>();
        list2.add(4);
        list2.add(4);
        list2.add(1);
        list2.add(1);
    }

    @Test
    void sumUp() {
        assertEquals(6, sum.sumUpIterative(3));
        assertEquals(10, sum.sumUpIterative(4));
    }

    @Test
    void sumUpRecursive() {
        assertEquals(6, sum.sumUpRecursive(3));
        assertEquals(10, sum.sumUpRecursive(4));
    }

    @Test
    void iterativSum() {
        assertEquals(4, sum.iterativeSum(list1));
        assertEquals(10, sum.iterativeSum(list2));
    }

    @Test
    void recursivSum() {
        assertEquals(4, sum.recursiveSum(list1));
        assertEquals(10, sum.recursiveSum(list2));
    }

    @Test
    void recursivSumAcc() {
        assertEquals(4, sum.recursiveSumAcc(list1, 0));
        assertEquals(10, sum.recursiveSumAcc(list2,0));
    }
}
