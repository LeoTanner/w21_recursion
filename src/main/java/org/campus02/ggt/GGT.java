package org.campus02.ggt;

public class GGT {

    /**
     * Finde den größen gemeinsamen Teiler (iterativ)
     * @param a Zahl 1
     * @param b Zahl 2
     * @return größter gemeinsamer teiler
     */
    public int ggtIterative(int a, int b) {
        int rest = 0;

        while ((a % b) != 0){
            rest = a % b;
            a = b;
            b = rest;
        }

        return rest;
    }

    /**
     * Finde den größen gemeinsamen Teiler (rekursiv)
     * @param a Zahl 1
     * @param b Zahl 2
     * @return größter gemeinsamer teiler
     */
    public int ggtRecursive(int a, int b)
    {
        if (b==0)
        {
            return a;
        }
        return ggtRecursive(b, a % b);
    }
}
