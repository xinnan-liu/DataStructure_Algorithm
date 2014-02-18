#Data Structures - Session 4 - Matrices, Representations and Operations
##Dov Kruger

Representation of matrices
	Java array of arrays
	double[][] data
	single dimensioned array with indexing
	square matrices vs. (m x n)

	Fundamental operations
	allocation
	indexing
	initialization
	deletion
	identity

	Arithmetic operations
	addition/subtraction
	negation
	multiplication

	Gaussian elimination computational complexity plain, or:
		partial pivoting
		full pivoting
	LU decomposition
	solving a set of  n x n equations
	inversion
	power(x, n)
	Brute force power: O(kn3). better: O(log2kn3)
	Can be solved with Eigen Decomposition: P D P-1  to compute Dk is O(nlog2k)
	Still have to do the decomposition though.  Someone find me Eigendecomp?
	
	least squares  (XTX)-1XTy: refer: Asaithambi Numerical Methods

Strassen’s algorithm
Orthogonal/orthonormal matrices:  Gram Schmidt
           


Matrix 4x4 for 3-d transformations 
     	n vectors, how much to perform m transformations?
		brute force
combining transformations




###Homework #3
Due 2/25

1. Write a matrix multiplcation that works on the following file format.  The program should accept a file as a n argument.  The file will contain the following format: The first line will contain the size of the matrix.  The subsequent lines will contain two nxn matrices to be multiplied.  Print out the result.
 					
		3
		1	0	1
		0	1	1
		2	1	2

		1	1	2
		2	1	-1
		1	0	0

		The result in this case should be:

		2	1	2
		3	1	-1
		6	3	3
		
		
2.  Using the same matrix multiplication code, test for matrices of size nxn where n=500, 1k, 2k, 4k and plot the time it takes (do not print out any results as that will affect the timing.


3. Solve a set of n x n equations using Gaussian Elimination with partial pivoting.The program should accept a text file

