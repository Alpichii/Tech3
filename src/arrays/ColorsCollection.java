package arrays;

public class ColorsCollection {
    public static void main(String[] args) {
        /*
        Create an array to store your favorite 5 colors
        Print the color one by one
         */

        String[] colors = new String[5];
        colors[0] = "black";
        colors[1] = "white";
        colors[2] = "gray";
        colors[3] = "dark-blue";
        colors[4] = "mustard";

        System.out.println("\n--------Looping an array----------\n");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Favorite color " + (i + 1) + " = " + colors[i]);
        }
        System.out.println("\n------looping an array------");

        for (int i = 0; i <= 4 ; i++) {
            System.out.println(colors[i]);
        }
    }
}
