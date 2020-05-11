import java.util.Scanner;

public class PrimeNumbers {

    private static boolean isPrime(int number){
        for(int i=2; i<number; i++)
            if(number%i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i = 2; i<=num; i++)
            if(isPrime(i))
                System.out.println(i);
    }

}
