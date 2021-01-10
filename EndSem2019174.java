class Matrix_2D
{
    int[][] Matrix = {  {2, 7, 5, 11, 7, 7, 2, 17, 11, 9}, 
                        {4, 5, 9, 83, 59, 8, 3, 13, 7, 5}, 
                        {6, 3, 7, 9, 5, 7, 5, 17, 23, 3},
                        {3, 4, 8, 1, 11, 5, 3, 9, 4, 6},
                        {1, 2, 5, 13, 8, 7, 5, 6, 89, 7},
                        {8, 4, 3, 11, 3, 2, 6, 7, 41, 5},
                        {3, 97, 7, 1, 4, 3, 4, 5, 2, 1},
                        {5, 2, 5, 28, 20, 7, 9, 35, 8, 7},
                        {7, 4, 3, 14, 6, 5, 7, 5, 3, 2} };

    public void printMatrix()
    {
        for (int i=0; i<9; i++) 
        { 
            for (int j=0; j<10; j++) 
            { 
                System.out.print(Matrix[i][j] + " "); 
            } 
            System.out.println(); 
        }
    }

    public boolean Prime_checker(int n)
    {
        boolean result = true;
        if(n == 0 || n == 1)
        {
            return false;
        }
        for(int i = 2;i <= n/2; i++)
        {
            if(n % i == 0)
            {
                result = false;
                break;
            }
        } 
        return result;   
    }

    int printSubmatrices(int[][] Matrix)
    {
        int flag = 0;
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(Prime_checker(Matrix[i][j]))
                {
                    if(Prime_checker(Matrix[i+1][j+1]))
                    {
                        int a = Matrix[i][j] + Matrix[i+1][j+1];
                        int b = Matrix[i+1][j] + Matrix[i][j+1];
                        if(a == b)
                        {
                            System.out.println("\n");
                            System.out.println(Matrix[i][j] + " " + Matrix[i][j+1]);
                            System.out.println(Matrix[i+1][j] + " " + Matrix[i+1][j+1]);
                            flag++;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public void printNumberofMatrices(int n)
    {
        System.out.println("The total number of 2 x 2 matrices are: "+n);
    }
}

public class EndSem2019174
{
    public static void main(String[] args) 
    {
        Matrix_2D A = new Matrix_2D();
        A.printMatrix();
        int a = A.printSubmatrices(A.Matrix);
        A.printNumberofMatrices(a);
    }
}