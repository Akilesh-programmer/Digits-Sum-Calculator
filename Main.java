public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(121));
        System.out.println(sumDigits(12221));
    }

    public static int sumDigits(int number) {
        // Validating parameter
        if (isLessThanTen(number)) {
            return -1;
        }

        int sum = 0;

        // Let's assume that we have 121, and we want to sum it up. First I am finding remainder after dividing by 10.
        // That will be the ones digit, which is 1 here. Then I divide 121 by 10, so it becomes 12.1, then I store it in
        // a variable whose data type is int, so the decimal gets sliced off, then we have 12. I do the same thing, we
        // get 2 after finding remainder when dividing 12 by 10, then we divide 12 by 10, it becomes 1.2, we store
        // it in a variable whose data type is int, so 1.2 becomes 1. So like this we can keep finding the ones digit,
        // and we can sum it. This is the algorithm being used below.

        // First storing the full number.
        int numAfterDivideByTen = number;
        // Checking in the while loop if the number has two digits, if so carrying on with the algorithm, but if not
        // then just adding it to the sum after the loop, because it is the last digit pending.
        while (!isLessThanTen(numAfterDivideByTen)) {
            // Finding the ones digit and adding it to the sum.
            sum += numAfterDivideByTen % 10;
            // Dividing the number by 10, storing it in int, so we have the remaining digits which we want to sum up.
            numAfterDivideByTen = numAfterDivideByTen / 10;
        }
        // This line of code is here because if only one digit is left, then we won't add that inside the loop, so we
        // are adding it outside the loop.
        sum += numAfterDivideByTen;
        return sum;

    }

    // Method to check a number is less than 10.
    public static boolean isLessThanTen(int number) {
        return (number < 10) ? true : false;
    }
}
