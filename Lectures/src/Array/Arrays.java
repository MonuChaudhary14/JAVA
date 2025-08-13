package Array;

public class Arrays {

    public static void main(String[] args) {

        // Initialization of Array

        // 2 methods

        String[] names = {"Monu" , "Chaudhary" , "Poonia"};

        System.out.println(names);   // Base Address (Address of first element)

        String[] name;
        name = new String[10];   // As these values are not assigned so by default they contain 0
        name[0] = "Hello";
        name[1] = "Monu";
        name[2] = "Chaudhary";
        name[3] = "Poonia";


//        Advance Concepts

/*       1. To determine the address of location of an array element

        Address(A[i]) = M + (i-L)*w  , where M is the address of initial element , L is first element and w is the type of element

        Row Major Order-
        Address(A[i][j]) = M + (i-1)*n + j -1     i,j starts from 1

        Column Major Order-
        Address(A[i][j]) = M + (j-1)*n + i -1     i,j starts from 1


//        When multidimensional arrays (like 2D arrays) are stored in memory, they are flattened into a 1D block.
        The way this flattening happens depends on whether the language (or system) uses row-major order or column-major order.


        Row-Major Order
            Definition: Stores all elements of the first row, then the second row, and so on.

            Used in: C, C++, Python (NumPy default), Java, etc.



        Column-Major Order
            Definition: Stores all elements of the first column, then the second column, and so on.

            Used in: Fortran, MATLAB, R, etc.






            Sparse Matrix-A sparse matrix is a matrix in which most of the elements are zero.

            Characteristics:
                It has a large number of zero entries.

                It saves memory and computation time when handled using special storage techniques.

                In contrast, a dense matrix has few or no zero elements.


            Most data is zero or empty, so sparse matrices save:

                Space (using less memory)

                Time (faster operations by skipping zero values)


            Types of Sparse Matrix
             1.Diagonal Matrix
                All non-zero elements are on the main diagonal.

                All other elements are zero


             2.Triangular Matrix
                Can be either:

                Upper Triangular: All elements below the main diagonal are zero.

                Lower Triangular: All elements above the main diagonal are zero


            3. Band Matrix (Banded Sparse Matrix)
                    Non-zero elements are within a band around the diagonal (main diagonal + some diagonals above/below).

                    Outside the band = all zeros.



            4.  Symmetric Sparse Matrix
                    The matrix is equal to its transpose: A[i][j] == A[j][i]

                    You can store only half (either upper or lower) to save space.

            5.5. Skew-Symmetric Sparse Matrix
                    Follows the rule: A[i][j] = -A[j][i]

                    Diagonal elements are always zero.




                 */



        // For each loop in java
        for(String s : name){
            System.out.println(s);
    }

        // Passing Array to Function
        Arrays a = new Arrays();    // Here the reference of the array is done. The address of array is passed to function
        // so if any change occur in value in function , then it will be displayed in the main function
        a.display(name);




        // Issues with Array
        // Once the size of the array is declared , it cannot be changed

}

void display(String[] name){

        for(String s : name){
            System.out.println(s);
        }

}




}
