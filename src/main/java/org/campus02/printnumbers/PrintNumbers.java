package org.campus02.printnumbers;

public class PrintNumbers {

    public static void main(String[] args) {
       // fromNToZero(5);
        //fromNToZeroRecursive(5);
        fromZeroToNRecursive(5);
    }

    public static void fromNToZero(int n)
    {
        while(n >= 0) {
            System.out.println("n = " + n);
            n--;
        }
    }

    // rekursiver Ansatz
    public static void fromNToZeroRecursive(int n){
        // Zuerst: Abbruchbestimmung
        if(n < 0)
            return;

        System.out.println("n = " + n);
        fromNToZeroRecursive(n - 1); // Tail Recursion -> Fußgesteuerte Rekursion
    }

    public static void fromZeroToNRecursive(int n){
        if (n < 0)
            return;

        fromZeroToNRecursive(n - 1); // Head Recursion -> Kopfgesteuerte Rekursion
        System.out.println("n = " + n);
    }

}
