package com.will;

public class Arrays {

    public static void main(String[] args) {

        // retrieving an element from an array only takes 3
       /* the number of steps does not change
        as the number of items changes.
        So if the number of elements is equal to n,
        the steps to retrieve never changes.
        And when we have this situation,
        we have what's known as constant time complexity
        and that's designated by O of one.*/

        int intArray[] = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

        /*retrieval when we know the index,
        we can do that in O of one time constant time complexity.
        But retrieval when we do not know the index,
        the O value for that is O of n
        because we have to find the item first
        and in the worse case,
        we'd have to loop over the entire array.
        so this is linear time complexity*/

        /*is if the code requires a loop,
        it's gonna be linear time.
        If the code does not require a loop,
        then it's constant time!*/

    }
}
