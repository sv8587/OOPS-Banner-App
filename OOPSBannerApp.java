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
 */

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
}
