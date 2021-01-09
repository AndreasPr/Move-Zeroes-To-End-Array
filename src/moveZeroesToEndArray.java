/**
 * Created on 09/Jan/2021 to Move-Zeroes-To-End-Array
 */
public class moveZeroesToEndArray {

    private static void moveToTheEnd(int[] matrix){

        int counter = 0;
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i] != 0){
                matrix[counter++] = matrix[i];
            }
        }

        // Now all non-zero elements have been shifted to
        // front and 'counter' is set as index of first 0.
        // Make all elements 0 from count to end.
        while(counter < matrix.length){
            matrix[counter++] = 0;
        }

        for(int element : matrix){
            System.out.println(element);
        }
    }

    public static void main(String args[]){
        int[] matrix = {1,9,8,4,0,0,2,7,0,6,0};
        moveToTheEnd(matrix);
    }
}
