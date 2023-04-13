public class continueStatement {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                // System.out.println("This is the value of i which wont print and skips the block : " + i);
                continue;
            }
            System.out.println("This is an example of 'Continue Statement' : " + i);

        }
        System.out.println("The value of i where the iteration breaks : " + i);
    }

}
