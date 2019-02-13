import java.util.Scanner;
//nice to implement max size

public class rectangle2 {
    public static void main (String[] args) {
        int sideLength, sideWidth;
        Scanner input = new Scanner(System.in);

        //If not enough commandline arguments
        if (args.length < 1) {
            System.out.println( "You need to pass two sizes that the defines the rectangles size. \nPlease enter one now: " );
            sideLength = input.nextInt(); 
            System.out.println( "Great Job! Please enter another one: " );
            sideWidth = input.nextInt(); 
        }
        else {
            sideLength = Integer.parseInt(args[0]);
            sideWidth = Integer.parseInt(args[1]);
        }

        //If dimentions of the rectangle is to small
        if (sideLength <= 4 && sideWidth <= 4) {
            System.out.println("This program draws a rectangle inside a rectangle, that means that the dimensions need to exceed 4.");
            System.out.println("Please enter some number larger then 4 now: ");
            sideLength = input.nextInt(); 
            System.out.println( "Great Job! Please enter another one: " );
            sideWidth = input.nextInt(); 
        }

        //Limit the size of the square to sides of 40 symbols
        if (sideLength > 40) {
            sideLength = 40;
            System.out.println( "The square will be limited to a sidelenght of 40. " ); 
        }
        if (sideWidth > 40) {
            sideWidth = 40;
            System.out.println( "The square will be limited to a sidewidth of 40. " ); 
        }

        //MODIFY TO DRAW A RECTANGLE
        for (int i=0; i < sideLength; i++) {
            System.out.println( "" );
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength-1 || j == 0 || j == sideLength-1 ) {
                    System.out.print( "#" );
                }                
                else if ( (( j == 2 || j == sideWidth-3) && i!=1 && i!=sideLength-2 )  ) {
                    System.out.print( "0" );
                }
                else if ( (i==2 && (j>=2 && j<sideWidth-3)) || (i==sideLength-3 && (j>=2 && j<sideWidth-3))  ) {
                    System.out.print( "-" );
                }                
                else {
                    System.out.print( " " );
                }
            }
        } 
    }
}


        