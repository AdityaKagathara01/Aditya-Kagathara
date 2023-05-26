
package arraydemos23friam;

import java.util.Scanner;



public class ArrayDemoS23FriAM {
    //helloo
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    public static void main(String[] args) {
       System.out.println("Enter a word");
       Scanner input = new Scanner(System.in);
       String myWord = input.nextLine();
       
       char[] myLetters =new char[myWord.length()];
       //helloooooo
       
       for(int i = 0;i<myLetters.length;i++){
           myLetters[i] = myWord.charAt(i);
           System.out.print(myLetters[i]);
       }//end of for loop
       System.out.println();
       System.out.println("printing in reverse");
       //printing in reverse
       
       for(int i =myLetters.length-1;i>=0;i--){
           System.out.print(myLetters[i]);
       }//end of for
    }//end of main
    
}//end of class
