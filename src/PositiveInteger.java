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

}
