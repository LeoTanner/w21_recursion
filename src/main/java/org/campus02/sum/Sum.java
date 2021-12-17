package org.campus02.sum;

import java.util.ArrayList;

public class Sum {

    /**
     * addiere alle zahlen von 0 - n (iterativ)
     *
     * @param n anzahl
     * @return summe
     */
    public int sumUpIterative(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * addiere alle zahlen von 0 - n (rekursiv)
     *
     * @param n anzahl
     * @return summe
     */
    public int sumUpRecursive(int n) {
        //Abbruchbestimmung
        if(n<= 0)
        {
            return n;
        }
        return n + sumUpRecursive(n - 1);
    }

    /**
     * Bilde die Summe aller gegebenen Zahlen (iterativ)
     * @param numbers List von Nummern
     * @return Summe aller enthaltenen Zahlen
     */
    public int iterativeSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Bilde die Summe aller gegebenen Zahlen (iterativ)
     * @param numbers List von Nummern
     * @return Summe aller enthaltenen Zahlen
     */
    public int recursiveSum(ArrayList<Integer> numbers)
    {
        //Abbruchbedingung
        if(numbers.size() == 0)
        {
            return 0;
        }
            Integer n = numbers.remove(0); //nimmt element an stelle 0 und liefert es zurück, dann entfernt es
            return n + recursiveSum(numbers);
    }

    public int recursiveSumAcc(ArrayList<Integer> numbers, int acc)
    {
        //abbruchbestimmung
        if(numbers.size()==0)
        {
            return acc;
        }
        int n = numbers.remove(0);
        acc += n;
        return recursiveSumAcc(numbers,acc);
    }
}
