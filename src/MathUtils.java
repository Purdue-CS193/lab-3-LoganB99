public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, int divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = 0.0;
        if (divisor != 0) {
            res = (double) dividend / (double) divisor;

        }
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        double result = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            isNegative = true;
        }
        /* If it's a negative exponent, we should invert it! */
        if (isNegative) {
            double dividedRes = divideNumbers(1, (int)result);
            double negBase = dividedRes;
            exp = -exp;
            for (int i = 1; i < exp; i++) {
                dividedRes *= negBase;
            }
            return dividedRes;
        }
        /* Otherwise, we are safe to just return the result */
        else {
            for (int i = 1; i < exp; i++) {
                result *= base;
            }
            return result;
        }
    }
}