package com.company;

/*
Function that implements a difference function, which subtracts oen list from another and returns the result.
Should remove all values from a, which are present in b.
If a value is present in b, all occurrences must be removed from the other.
example: arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

//author: Avery Hanulcik
//date: 30 OCT 2021

import java.util.ArrayList;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        // convert args[] to array list
        ArrayList listA = new ArrayList();
        ArrayList listB = new ArrayList();
        for (int i : a) listA.add(i);
        for (int i : b) listB.add(i);

        //logic
        listA.removeAll(listB);

        //convert array list back to int[]
        int[] answer = new int[listA.size()];
        for (int i = 0; i < listA.size(); i++) answer[i] = (int) listA.get(i);
        return answer;
    }
}
