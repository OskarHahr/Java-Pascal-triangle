public class RecursivePascal implements Pascal
{
    boolean rätt;
    int data[][];
    public void printPascal (int n) {
        //conditional statement to pop the recursive loop
        if (n == 0 ) {
            System.out.print("");
        }
        else {
            if(rätt)  printPascal(n - 1); //prints the rightwards facing triangle
            for (int number = 0; number < n; number++)
                System.out.print(binom(n-1, number) + " "); //Recursive call to print a specific number

                System.out.println();
            if(!rätt) printPascal(n - 1); //prints the upside down triangle
        }

    }


    public int binom(int n, int k)
    {
        if (k == 0 || n == k) { //Conditional statement to pop the recursive loop
            data[n][k] =1;
            return 1;
        }
        else {
            if (data [n][k] != 0) // if data exists, return data
                return data[n][k];

            if (data[n - 1][k - 1] != 0 && data[n - 1][k] != 0){ // If the data exists in the previous step, retrieve it and return number.
                data[n][k] = data[n - 1][k - 1] + data[n - 1][k];
                data[n][n-k]= data[n][k]; // saves data on the opposite side of the triangle as well
                return data[n][k];}

            data[n][k] = (binom(n - 1, k - 1) + binom(n - 1, k)); // recursive call to calculate data[n][k]
            data [n][n-k] = data [n][k]; // saves data on the opposite side of the triangle as well
            return data[n][k];
        }
    }

}




