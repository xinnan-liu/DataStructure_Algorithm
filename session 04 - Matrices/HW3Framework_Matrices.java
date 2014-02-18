import java.io.*;
import java.util.Scanner;

class Matrix {
	private double[] m;
	private int rows, cols;
	public Matrix(int rows, int cols) {
		this.rows = rows; this.cols = cols;
		m = new double[rows*cols];
	}
	public final double get(int i, int j) { return m[i * cols + j]; }
	public final void set(int i, int j, double val) { m[i * cols + j] = val; }
	public void read(Scanner s) {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				set(i,j, s.nextDouble());
	}
	//implement matrix addition
	public static Matrix add(Matrix a, Matrix b) {
		return a; // replace this line!
	}
	// implement matrix subtraction
	public static Matrix sub(Matrix a, Matrix b) {
		return a; // replace this line!		
	}
	// implement matrix multiplication
	public static Matrix mult(Matrix a, Matrix b) {
		return a; // replace this line!
	}

	// You can do any one of the following!!!
	// YOU DON'T HAVE TO DO THEM ALL!!!!
	
	// given A x = b, solve for the vector x
	public static void gauss(Matrix a, double[] x, double[] b) {
		
	}

	// given A x = b, solve for the vector x
	public static void gaussPartialPivot(Matrix a, double[] x, double[] b) {
		
	}

	// after this executes, a is U!
	public static void LU(Matrix a, Matrix L) {
		
	}

	// to solve equations after LU decomposition, solution in x
	public static void multiply(Matrix L, double[] B, double[] x) {
		
	}

	// orthogonalize
	public static void gramSchmidt(Matrix a) {
		
	}

	// Eigen Decomposition (PDP^-1)
	public static void gramSchmidt(Matrix a, Matrix P, Matrix D, Matrix Pinv) {
		
	}

	// print to System.out with columns separated by tabs
	public void print() {
		for (int c = 0, i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print(m[c++] + "\t");
			System.out.println();
		}
	}
	
}
public class HW3Framework_Matrices {
	public static void main(String[] args) {
		BufferedReader r = null;
		try {
			r = new BufferedReader(new FileReader(args[0]));
			Scanner s = new Scanner(r);
			final int n = s.nextInt();
			Matrix a = new Matrix(n,n); // create your matrix class to make this work
			a.read(s); // read in the values from the scanner (use nextDouble())
			Matrix b = new Matrix(n,n);
			b.read(s);
			Matrix c = Matrix.mult(a, b);
			c.print();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (r != null)
					r.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
