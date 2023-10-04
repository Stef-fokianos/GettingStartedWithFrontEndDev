import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args){
        
        int rowsFirst, columnsFirst, rowsSecond, columnsSecond, x, y, z;
        Scanner scanner = new Scanner(System.in);
        boolean tried = false;

        //get user inputs for matrix one 
        System.out.println("Enter rows and columns of first matrix.");

        
        do {
            System.out.println("Rows: ");
            if(tried)
                System.out.println("That's not a valid integer. Please try again.");
            rowsFirst = scanner.nextInt();
            tried = true;
        } while (rowsFirst <= 0);
        tried = false;


        do {
            System.out.println("Columns: ");
            if(tried)
                System.out.println("That's not a valid integer. Please try again.");
            columnsFirst = scanner.nextInt();
            tried = true;
        } while (columnsFirst <= 0);
        tried = false;
        
        //initialize first matrix
        int matrixFirst[][] = new int[rowsFirst][columnsFirst];

        //get user input for matrix one elements 
        System.out.println("First matrix: ");
        for (x = 0; x < rowsFirst; x++)
        {
            for (y = 0; y < columnsFirst; y++)
            {
                System.out.println("Enter element of row " +(x+1) +" and column " +(y+1) +": ");
                matrixFirst[x][y] = scanner.nextInt();
            }
        }

        //get user inputs for matrix two
        System.out.println("Enter rows and columns of second matrix.");

        do {
            System.out.println("Rows: ");
            if(tried)
                System.out.println("That's not a valid integer. Please try again.");
            rowsSecond = scanner.nextInt();
            tried = true;
        } while (rowsSecond <= 0);
        tried = false;
        

         do {
            System.out.println("Columns: ");
            if(tried)
                System.out.println("That's not a valid integer. Please try again.");
            columnsSecond = scanner.nextInt();
            tried = true;
        } while (columnsSecond <= 0);
        tried = false;

        //initialize second matrix
        int matrixSecond[][] = new int[rowsSecond][columnsSecond];

        //get user input for matrix two elements 
        System.out.println("Second matrix: ");
        for (x = 0; x < rowsSecond; x++)
        {
            for (y = 0; y < columnsSecond; y++)
            {
                System.out.println("Enter element of row " +(x+1) +" and column " +(y+1) +": ");
                matrixSecond[x][y] = scanner.nextInt();
            }
        }

        //check if they can get multiplied
        if (columnsFirst != rowsSecond)
            System.out.println("The matrices can not be multiplied with each other.");
        else 
        {
            //multiply matrices
            int matrixFinal[][] = new int[rowsFirst][columnsSecond];
            for( x = 0; x < rowsFirst; x++)
            {
                for( y = 0; y < columnsSecond; y++)
                {
                    matrixFinal[x][y] = 0; //initialize before accumulating products
                    for ( z = 0; z < rowsSecond; z++)
                    {
                        matrixFinal[x][y] += matrixFirst[x][z] * matrixSecond[z][y];
                    }
                }
            }
            
            System.out.println("Matrix after the multiplication: ");
            for (x = 0; x < rowsFirst; x++)
            {
                for (y = 0; y < columnsSecond; y++)
                {
                    System.out.print(matrixFinal[x][y]  +"\t");
                }
                System.out.println();
            }

        }


    }

    
}
