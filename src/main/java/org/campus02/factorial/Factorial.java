package org.campus02.factorial;

public class Factorial {

    /**
     * Multipliziere alle Zahlen von 0 - n
     * @param n anzahl
     * @return Produkt der Multiplikationen
     */
    public int fact(int n) {
        if (n == 1)
        {
            return n;
        }
        return n*fact(n-1);
    }
}
