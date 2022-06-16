public class oddEven {
    public static void main (String[] args){
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= 100; i++) {
            int num = (int) Math.round(Math.random()*100);
            if (num%2 == 0 ) {
                odd ++;
            } else {
                even ++;
            }
        }
        System.out.println("odd "+ odd + ","+ even +" even");    }
}