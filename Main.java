import edu.princeton.cs.algs4.Stopwatch;

public class Main {
    static RecursivePascal recursivePascal = new RecursivePascal();
    static IterativePascal iterativePascal = new IterativePascal();

    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        recursivePascal.rätt = true;
        int n = 1000;
        //recursivePascal.data = new int[n][n];
        //recursivePascal.printPascal(n);
        iterativePascal.rätt = true;
        iterativePascal.data = new int[1000][1000];
        iterativePascal.printPascal(n);
        System.out.println(stopwatch.elapsedTime());


    }
}