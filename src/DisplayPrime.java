public class DisplayPrime {
    public static void main(String[] args) {
        int num = 0;
        int maxCheck = 100;
        int i;
        boolean isPrime = true;
        String primeNumbersFound = "";
        for (i = 2; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound += i + " ";
            }
        }
        System.out.println("Prime number from 1 to " + maxCheck + " are: ");
        System.out.println(primeNumbersFound);
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
