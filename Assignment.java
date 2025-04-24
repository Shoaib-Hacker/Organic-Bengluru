public class Assignment {
    public static void main(String[] args) {
        System.out.println("The sum of the digit of a given number is: "+sumOfDigit(1234));
        System.out.println("The no of digit count of a given number is: "+countDigit(1234));
    }

    public static int sumOfDigit(int n){
        int sum = 0;
        while( n > 0 ){
            int rem = n % 10 ;
            n=n/10;
            sum+=rem;
        }
      return sum;
    } 

    public static int countDigit(int n){
        int count = 0;
        while( n > 0 ){
            int rem = n % 10 ;
            n=n/10;
            count++;
        }
        return count;
    }

}
