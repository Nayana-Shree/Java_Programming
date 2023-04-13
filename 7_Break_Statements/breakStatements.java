public class breakStatements {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                // System.out.println("This is the value of i which wont print and stops the block : " + i);
                break;
            }
            System.out.println("This is an example of 'Break Statement' : " + i);
        }
        System.out.println("The value of i where the iteration breaks : " + i);
    }

}
