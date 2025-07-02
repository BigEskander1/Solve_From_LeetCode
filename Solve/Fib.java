public class Fib {
    // solve fib Using Dynamic Programming
    public int tribonacci(int n) {
        
        if(n < 2) return n ;
        if(n == 2) return 1;

        int n1 = 0 ;
        int n2 = 1 ;
        int n3 = 1 ;

        for(int i = 3 ; i <= n ; i++){
            int trib = n1+n2+n3;
            n1= n2;
            n2=n3;
            n3 = trib;
        }

        return n3;
    }
}
