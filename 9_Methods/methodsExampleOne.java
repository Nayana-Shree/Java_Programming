public class methodsExampleOne {
    public static void main(String[] args) {
        printSomething();
        doSomethingWithLoop(5);
        System.out.println("The price with 10% off: " + getPercentOfDiscountPrice(20000));
        System.out.println("The price with 50% off: " + getDiscountPrice(20000, 50));
        System.out.println("The price with 40% off: " + getDiscountPrice(20000.55, 60));
    }

    static void printSomething() {
        System.out.println("just print something under this printSomething method");
    }

    public static void doSomethingWithLoop(int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println("print this inside doSometingWithLoop methods : " + i);

        }
    }

    static double getPercentOfDiscountPrice(int price) {
        return price * 9.0;
    }

    static double getDiscountPrice(int price, int percent) {
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent) {
        return price * percent / 100.0;
    }

}
