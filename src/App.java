
public class App {

    public static void main(String[] args) throws Exception {
        String x = args[0];
        String y = args[1];
        int i = x.indexOf(0);
        boolean status = false;
        if (x.length() == y.length()) {
            while (i < x.length()) {
                if (x.charAt(i) == y.charAt(i)) {

                    status = true;
                } else {
                    status = false;
                }
                i++;
            }
        }
        System.out.println(status);

    }
    //** 
    // public static int factorial(int x1){

    //     int sum = 1, x = 1;
    //     if (x1>=0){
    //     for (int i = 0; i < x1; i++) {
    //         sum = sum * x;
    //         x++;
    //     }
    //     System.out.println(sum);
    //   }
    //   else{
    //     return sum = -1;
    //   }
    //   return sum;
    // }
    // public static int binomial(int x1 , int x2){
    //     long nomerator = factorial(x1);
    //     long denominator1 = factorial(x2);
    //     long denominator2 = factorial(x1-x2);
    //  return sum;
    // //** */
}
