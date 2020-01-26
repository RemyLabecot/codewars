public class StrongestEvenNumber {


    public static long strongestEven(long n, long m) {

        long strongestStrongness = 0;
        long strongestNumber = 0;

        for(long i = n ; i <= m ; i++) {
            long strongness = computeStrongnessOfANumber(i);

            if (strongness > strongestStrongness) {
                strongestStrongness = strongness;
                strongestNumber = i;
            }
        }
        return strongestNumber;
    }

    public static long computeStrongnessOfANumber(long number) {

        long strongness = 0;

        if (number == 2) {
            return 1;
        }
        for(long i = 0 ; i < number; i++) {
            if (number % 2 == 0) {
                number /= 2;
                strongness++;
            }
        }

        return strongness;
    }
}

