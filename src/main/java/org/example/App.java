/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 04 - Mad Lib
 */

package org.example;
import java.util.Scanner;

public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Prompt and scan in user's input for noun
        System.out.println("Enter a noun: ");
        Scanner nounInput = new Scanner(System.in);
        String noun = nounInput.next();

        // Prompt and scan in user's input for verb
        System.out.println("Enter a verb: ");
        Scanner verbInput = new Scanner(System.in);
        String verb = verbInput.next();

        // Prompt and scan in user's input for adjective
        System.out.println("Enter an adjective: " );
        Scanner adjectiveInput = new Scanner(System.in);
        String adjective = adjectiveInput.next();

        // Prompt and scan in user's input for adverb
        System.out.println("Enter an adverb: ");
        Scanner adverbInput = new Scanner(System.in);
        String adverb = adverbInput.next();

        // Print out complete mad lib using string interpolation
        String mad_lib = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(mad_lib);
    }
}
