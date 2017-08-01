package matrix;
/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class Matrix {
    /*
     * Declare the variables for numbers of rows and columns and assign them to zeros
     */
    static int numberOfRows = 0;
    static int numberOfColumns  = 0;
    
    /*
     * Create a two dimension array for our 3x3 matrix m with the values from the
     * learning guide Unit 7
     * After it, find a size of the matrix m using a standart .length method
     * and print it for the User
     */
    public static void main(String[] args) {
        int [][] m =
        {
            { 10,12,11},
            { 9 ,8,31},
            { 2 ,16,2},
        };
            
    numberOfRows = m.length;
    numberOfColumns = m[0].length;
            
    System.out.println("Number of Rows:    " +m.length);
    System.out.println("Number of Columns: " +m[0].length);
    System.out.println();
        
    /*
     * If matrix m is square (number of rows is equale to number of columns)
     * then we can calculate the secondary diagonal further. If the matrix is
     * not square, then User must receive a message "This is not a square matrix"
     */
    
    if (numberOfRows == numberOfColumns) {    
        int secondaryDiagonalSum = 0;
        int size = m.length -1;
        
        for(int i = 0; i<m.length; i++){
            secondaryDiagonalSum += m[i][size-i];
        }
            
        System.out.println("This is a square matrix.");
        System.out.println("Secondary Diagonal of this square matrix = " + secondaryDiagonalSum);
        
    } else {
        System.out.println("This is not a square matrix.");
    }
}
}
