package printStatements;

public class EscapeSequences {
    public static void main(String[] args) {
/*-----------------TASK-1---------------------
        Print below statement
        I like "Apple" and "Oranges"
         */
        System.out.println("\n----------TASK-1----------\n");
        String myFavFruits = "I like \"Apple\" and \"Oranges\"";
        System.out.println(myFavFruits);
/* ---------------TASK-2------------------
        print below statement
        My Favorite country is "Arjantina"
*/
        String MyFavoriteCountries = "Argantina";
        System.out.println(MyFavoriteCountries);
/*--------------------TASK-3-------------
        String myFavFruits = "I like \"Apple\" and \"Orange\"";
        System.out.println(myFavFruits);

        System.out.println("My favorite country is \"Argentina\"");
        System.out.println(" My favorite country is \"Porto\"");
        System.out.println(\"My favorite country is\");
*/
/* ------------------TASK-4------------------
Write 1 print statement to print below text

    TechGlobal provides students a complete educational program
to be a competitive SDET in the professional IT field. With the course,
students learn all the fundamental technologies needed to become an SDET
professional and how important testing is in the Software Development Life Cycle (SDLC)…

    Learn more about the technologies that TechGlobal provides to its participants below
and feel free to reach out to us with any questions.
 */
        System.out.println("\tTechGlobal provides students a complete educational program\n" +
                "to be a competitive SDET in the professional IT field. With the course,\n" +
                "students learn all the fundamental technologies needed to become an SDET\n" +
                "professional and how important testing is in the Software Development Life Cycle (SDLC)…\n" +
                "\tLearn more about the technologies that TechGlobal provides to its participants below\n" +
                "and feel free to reach out to us with any questions.\n");


/*--------------------TASK-5-------------------------
1.    Print each statement below in one println() statement
My favorite author is “Stefan Zweig”
My favorite quote is “All our dreams can come true, if we have the courage to pursue them.”
In my free time:
-I “read books”,
-I “swim”,
-I “watch movies”.
*/
        System.out.println("My favorite author is “Stefan Zweig”\n" +
                "My favorite quote is “All our dreams can come true, if we have the courage to pursue them.\n" +
                "In my free time:\n" +
                "-I “read books”,\n" +
                "-I “swim”,\n" +
                "-I “watch movies”.\n");
    }
}
