public class PositiveInteger {

    private int num;

    public PositiveInteger(int number) {
        num = number;
    }

    public boolean isPerfect() {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public boolean isAbundant() {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum > num;
    }

    public boolean isNarcissistic() {
        int digits = 0;
        int temp = num;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }


}
