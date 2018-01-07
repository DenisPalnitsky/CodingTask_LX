package com.company.btn;

public class BTNComparer {

    public static boolean areEqual(BTN a, BTN b){

       return traverseTree ( a, b );
    }

    static boolean traverseTree (BTN a, BTN b){

        if (a == null && b== null)
            return true;

        if ((a == null && b != null) || (a != null && b == null) ||
                a.val != b.val)
            return false;

        if (!traverseTree(a.left, b.left ))
            return false;

        if (!traverseTree(a.right , b.right ))
            return false;

        return true;
    }
}
