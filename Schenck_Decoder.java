//*****************************************************************************/
//*****************************************************************************/
//
//
//      file: Schenck_Decoder.java
//      author: E. Schenck
//      class: CS 141 Intro to Programming and Problem Solving
//
//      assignment: Program 1
//      date last modified: 1/12/2017
//
//      purpose: Write a program that decodes a secret message contained in a
//      text file. The first line of the text file contains the key-phrase.
//      Then the file contains a sequence of integers, each of which indexes
//      the key-phrase. Find the character corresponding to each integer and
//      output the secret message. Note if a character such as 'e' occurs 
//      several places in the key-phrase it may be encoded as different
//      integers in different parts of the secret message.
//
//*****************************************************************************/
//*****************************************************************************/

import java.util.Scanner;

public class Schenck_Decoder
{
    public static void main(String[] args)
    {
        String keyPhrase; // String to hold keyPhrase from text file
        String secretMessage = ""; // to hold final message once decoded
        int indexNumber; // to hold incoming code indexes 
        
        
        // using Scanner class to read in file info
        Scanner inputFile = new Scanner(System.in);
        
        // saving first line from .txt which is the keyphrase to decode with
        keyPhrase = inputFile.nextLine();
        
        // while loop runs through the index integers
        while(inputFile.hasNextInt())
        {
            // each integer is saved to indexNumber
            indexNumber = inputFile.nextInt();
            
            // then the charAt the indexNumber of the keyPhrase is appended
            // to String secretMessage
            secretMessage += keyPhrase.charAt(indexNumber);
        }
        
        // Print out secret Message
        System.out.println("\nYour secret message is: " + secretMessage + "\n");
    }
}
