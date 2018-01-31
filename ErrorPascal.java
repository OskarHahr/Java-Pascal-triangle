public abstract class ErrorPascal implements Pascal {

    public boolean sanityCheck(int n){

        if (n < 0) return false;
        else return true;

    }
    public boolean sanityCheck(int n, int k){
        if (0 <= k && k <= n) return true;
        else return false;

        }
}
