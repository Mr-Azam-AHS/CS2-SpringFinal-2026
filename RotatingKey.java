import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RepeatingKeyDecoder
{
    public static void main(String[] args)
    {
        // Step 1: Ask the user for a keyword and clean it up
        // - Convert to uppercase
        // - Strip out any non-alphabetic characters


        // Step 2: Read the encrypted message from "message.txt"
        // Hint: Use a try/catch block for FileNotFoundException


        // Step 3: Decode the message and print the result
        // Hint: Call your decode method here

    }

    // Returns the keyword with any non-alphabetic characters removed, in uppercase
    public static String cleanKeyword(String keyword)
    {
        String clean = "";

        for (int i = 0; i < keyword.length(); i++)
        {
            // TODO: Only add the character if it is alphabetic

        }

        return clean.toUpperCase();
    }

    // Reads all lines from a file and returns them as a single String
    public static String readFile(String filename) throws FileNotFoundException
    {
        String contents = "";
        Scanner file = new Scanner(new File(filename));

        while (file.hasNextLine())
        {
            // TODO: Append each line to contents

        }

        file.close();
        return contents;
    }

    // Decodes a message using a repeating keyword cipher and prints the result
    // Each letter of the keyword gives a shift value: A=1, B=2, ... Z=26
    // Non-alphabetic characters pass through unchanged
    // The keyword position does NOT advance for non-alphabetic characters
    public static void decode(String message, String keyword)
    {
        int keyIndex = 0; // Tracks position in the keyword — only advances for alpha characters

        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);

            if (Character.isLetter(c))
            {
                // Step A: Get the current keyword letter and calculate its shift value (A=1, B=2... Z=26)


                // Step B: Convert c to uppercase and shift it BACKWARDS by the shift value
                // Hint: (upper - 'A' - shift + 26) % 26 + 'A'
                // The + 26 prevents negative values before the modulo


                // Step C: Print the decoded character


                // Step D: Advance the keyword index, wrapping around if needed
                // Hint: keyIndex = (keyIndex + 1) % keyword.length();

            }
            else
            {
                // Non-alphabetic: print as-is, do NOT advance keyIndex
                System.out.print(c);
            }
        }

        System.out.println();
    }
}
