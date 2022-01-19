package arrays;

import java.util.Arrays;

public class TwoDimentionalArrays {
    public static void main(String[] args) {
        String[][] myFavorites = {
                {"London", "Brugge", "Kyiv", "Chicago"},
                {"Black", "White", "Red"},
                {"Tesla", "Audi"},
                {"1", "2", "3"},
                {},
        };

        System.out.println(myFavorites.length); // 5
        System.out.println(myFavorites[2].length); // 2
        //System.out.println(myFavorites[4][0]); // ArrayIndexOutOfBoundException
        System.out.println(myFavorites[3][2]); //3
        //System.out.println(myFavorites[7][2]); //ArrayIndexOutOfBoundException
        System.out.println(myFavorites[0][2]); //Kyiv

        int[][] studentsFavNumbers = new int[2][3];
        studentsFavNumbers[0][1] = 5;
        studentsFavNumbers[1][0] = 7;
        studentsFavNumbers[1][1] = 10;
        studentsFavNumbers[1][2] = 3;
        System.out.println(Arrays.deepToString(studentsFavNumbers)); // [[0,5,0], [7, 10, 3]]

        /*
        Create a 2 dimensional array as below
        [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]
        [[34, 0, 12], [0, 7, 0], [17, 23, 3], [7, 10, 3]]

        sum of these numbers -> 116
        total count of zeros -> 3
         */
        System.out.println("\n---------TASK-----------\n");
        int[][] myNumbers = new int[4][3];
        myNumbers[0][0] = 34;
        myNumbers[0][2] = 12;
        myNumbers[1][1] =7;
        myNumbers[2][0] = 17;
        myNumbers[2][1] = 23;
        myNumbers[2][2] = 3;
        myNumbers[3][0] = 7;
        myNumbers[3][1] = 10;
        myNumbers[3][2] = 3;
        System.out.println(Arrays.deepToString(myNumbers));

        int sum = 0;
        int zeros = 0;


        /*for (int[] myNumber : myNumbers) {
            //
            for (int i : myNumber) {
                sum += i;
                if(i == 0) zeros++;
            }
        }
         */

        //[[34, 0, 12], [0, 7, 0], [17, 23, 3], [7, 10, 3]]
        for (int i = 0; i < myNumbers.length; i++) {
            //[34, 0, 12]
            for (int j = 0; j < myNumbers[i].length; j++) {
                sum += myNumbers[i][j];
                if(myNumbers[i][j] == 0) zeros++;
            }
        }
        System.out.println("Sum is = " + sum);
        System.out.println("Zeros count = " + zeros);


        String[][] colors = {{"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}};

    }
}
