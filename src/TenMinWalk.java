
/*
Create a function that determines if a given walk will be exactly ten minutes and return to the starting point.
Directions are given as a char[]. example {'n','s','e','w'}. Each direction is one minute.
 */

//author: Avery Hanulcik
//date: 30 OCT 2021

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        //create integer for each direction
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;

        //increment integer if encountered on walk
        for (char direction : walk) {
            if (direction == 'n') north++;
            if (direction == 's') south++;
            if (direction == 'e') east++;
            if (direction == 'w') west++;
        }

        //calculate sum, if =10, we meet the 10min criteria
        int sum = north + south + east + west;

        //return true if went each direction an equal and opposite number of times
        if (north == south && east == west && sum == 10) return true;
        return false;

    }
}
