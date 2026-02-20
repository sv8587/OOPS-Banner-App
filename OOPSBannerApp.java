/**
 * OOPSBannerApp
 * This program prints "OOPS" to the console.
 
public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("OOPS");
    }
}

public static void main(String[] args) {

    System.out.println("  *****  " + "  *****  " + "  ****** " + "  *****  ");
    System.out.println(" **   ** " + " **   ** " + " **   ** " + " **   ** ");
    System.out.println("**     **" + "**     **" + "**     **" + "**       ");
    System.out.println("**     **" + "**     **" + "******   " + " *****   ");
    System.out.println("**     **" + "**     **" + "**       " + "     **  ");
    System.out.println(" **   ** " + " **   ** " + "**       " + " **   ** ");
    System.out.println("  *****  " + "  *****  " + "**       " + "  *****  ");
} */

/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends UC2 by using String.join()
 * instead of '+' operator for better efficiency.
 *
 * @author Developer
 * @version 3.0
 

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
    "  *****  ",
                "  *****  ",
                "  ****** ",
                "  *****  "));

        System.out.println(String.join(" ",
    " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** "));

        System.out.println(String.join(" ",
    "**     **",
                "**     **",
                "**     **",
                "**       "));

        System.out.println(String.join(" ",
    "**     **",
                "**     **",
                "******   ",
                " *****   "));

        System.out.println(String.join(" ",
    "**     **",
                "**     **",
                "**        ",
                "     **   "));

        System.out.println(String.join(" ",
    " **   ** ",
                " **   ** ",
                "**         ",
                " **   **  "));

        System.out.println(String.join(" ",
    "  *****  ",
                "  *****  ",
                "**          ",
                "  *****   "));
    }
} */

/**
 * OOPSBannerApp UC4 – Render OOPS using String Array and Loop
 *
 * Improves UC3 by storing banner lines in a String array
 * and printing them using a for-each loop.
 *
 * @author Developer
 * @version 4.0
 

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array for 7 banner lines
        String[] lines = new String[7];

        // Step 2: Populate each index using String.join()
        lines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  *****  ");

        lines[1] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ");

        lines[2] = String.join(" ",
                "**     **",
                "**     **",
                "**     **",
                "**       ");

        lines[3] = String.join(" ",
                "**     **",
                "**     **",
                "******   ",
                " *****   ");

        lines[4] = String.join(" ",
                "**     **",
                "**     **",
                "**        ",
                "     **   ");

        lines[5] = String.join(" ",
                " **   ** ",
                " **   ** ",
                "**         ",
                " **   **  ");

        lines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "**          ",
                "  *****   ");

        // Step 3: Use for-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
*/

/**
 * OOPSBannerApp UC5 – Render OOPS using Inline Array Initialization
 *
 * Improves UC4 by declaring and initializing the String array
 * in a single statement using String.join().
 *
 * @author Developer
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] lines = {

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "  ****** ",
                        "  *****  "),

                String.join(" ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**       "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        "******   ",
                        " *****   "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        "**        ",
                        "     **   "),

                String.join(" ",
                        " **   ** ",
                        " **   ** ",
                        "**         ",
                        " **   **  "),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "**          ",
                        "  *****   ")
        };

        // for-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
