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
} */

/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * Refactors UC5 by moving banner pattern logic into
 * separate helper methods for modularity and reusability.
 *
 * @author Developer
 * @version 6.0
 

public class OOPSBannerApp {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble O O P S
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + " " +
                    oPattern[i] + " " +
                    pPattern[i] + " " +
                    sPattern[i]
            );
        }
    }
} */

/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * Implements CharacterPatternMap class to encapsulate
 * character-to-pattern mappings for better structure.
 *
 * @author Developer
 * @version 7.0
 

public class OOPSBannerApp {

    /**
     * Inner class to hold character and its ASCII pattern
     
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create all character pattern mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                "  *****  "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return maps;
    }

    // Retrieve pattern for given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // default to space pattern
        return maps[3].getPattern();
    }

    // Print message as banner
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, maps);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
} */

/**
 * OOPSBannerApp UC8 – Use HashMap for Character Patterns
 *
 * Uses Java Collections Framework (HashMap) to store
 * ASCII character patterns in a flexible way.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates and returns a HashMap containing
     * character-to-pattern mappings.
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                "  *****  "
        });

        // Space character pattern
        charMap.put(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMap;
    }

    /**
     * Displays the banner message using the character map.
     */
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}