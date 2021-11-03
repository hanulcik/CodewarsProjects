/**
 * A function that accepts an array representing a que of people.
 * Each person buys a ticket worth $25. Each index is how much money they hold.
 * Determine if the clerk can give change with the bills he has on hand.
 */

//author: Avery Hanulcik
//date: 03 NOV 2021


public class VasyaClerk {
    public static String tickets(int[] peopleInLine) {
        int cash = 0;

        for (int i : peopleInLine) {
            if (cash < 0) return "NO";

            if (i == 25) cash += i;
            if (i == 50) cash -= 25;
            if (i == 100) cash -= 75;
        }
        return "YES";
    }
}
