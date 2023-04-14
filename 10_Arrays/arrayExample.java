public class arrayExample {
    public static void main(String[] args) {
        int lotteryNumbers[] = new int[5];
        lotteryNumbers[0] = 17;
        lotteryNumbers[1] = 24;
        lotteryNumbers[2] = 87;
        lotteryNumbers[3] = 67;
        lotteryNumbers[4] = 43;

        for (int number : lotteryNumbers) {
            System.out.println(number);

        }
        System.out.println();

        int weeklyLotteryNumbers[][] = { { 12, 13, 54, 26, 78 }, { 32, 54, 25, 65, 34 } };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();

        }
    }

}
