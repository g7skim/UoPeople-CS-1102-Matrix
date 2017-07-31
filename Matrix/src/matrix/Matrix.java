package matrix;
/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class Matrix {
    static int numberOfRows = 0;
    static int numberOfColumns  = 0;
    
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
        
    if (numberOfRows == numberOfColumns) {    
        int secondaryDiagonalSum = 0;
        int size = m.length -1;
        
        for(int i = 0; i<m.length; i++){
            secondaryDiagonalSum+= m[i][size-i];
        }
            
        System.out.println("This is a square matrix.");
        System.out.println("Secondary Diagonal of this square matrix = " + secondaryDiagonalSum);
        
    } else {
        System.out.println("This is not a square matrix.");
    }
}
}
