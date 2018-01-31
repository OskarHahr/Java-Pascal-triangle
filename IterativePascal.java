public class IterativePascal extends ErrorPascal implements Pascal{
int data[][];
boolean rätt;

    public void printPascal (int n) {
        if (sanityCheck(n)){ //sanity check on printpascal parameter
            for (int m = 0; m < n; m++) {
                for (int k = 0; k <= m; k++) {
                    if (rätt) System.out.print(binom(m, k) + " "); //prints the right triangle
                    else binom(m, k);                              //saves all the data into the two dimensional array
                }
                if (rätt) System.out.println();                     //prints new row in the triangle
            }
        if (!rätt) {
            for (int m = n - 1; m >= 0; m--) {
                for (int k = 0; k <= m; k++) {
                    System.out.print(data[m][k] + " ");             //prints upside-down triangle
                }
                System.out.println();                               //prints new row in the triangle
            }
        }
        }
        else System.out.println("This parameter: " + n + " is out of bounds make sure that parameter is larger than 0");
    }
    public int binom (int n, int k) {
        if (sanityCheck(n, k)) {
            if (k == 0 || n == k) {                                 //special conditional statement for the edges
                data[n][k] = 1;
                data[n][n - k] = 1;
                return data[n][k];
            }
            data[n][k] = (data[n - 1][k - 1] + data[n - 1][k]);     //sets data to be the sum of the two numbers "above" in the array.
            data[n][n - k] = data[n][k];
            return data[n][k];
        }
        else{
        System.out.println("Faulty parameters, make sure that parameters follow rule 0 < = k <= n ");
        System.exit(-1);
        return-1;}

    }

}