public class methodExampleTwo {
    public static void main(String[] args) {
        energyEfficiencyCategory('C');
        carDescription("Maruthi", 230405, "Normal");

    }

    static char energyEfficiencyCategory(char ch) {
        switch (ch) {
            case 'A':
            case 'a':
                System.out.println("Very Low");
                break;
            case 'B':
            case 'b':
                System.out.println("Low");
                break;
            case 'C':
            case 'c':
                System.out.println("Normal");
                break;
            case 'D':
            case 'd':
                System.out.println("Above Normal");
                break;
            case 'E':
            case 'e':
                System.out.println("High");
                break;
            case 'F':
            case 'f':
                System.out.println("Very High");
                break;
            case 'G':
            case 'g':
                System.out.println("Exttremely high");
                break;
            default:
                System.out.println("not defined category");

        }
        return ch;
    }

    static void carDescription(String model, int productionYear, String condition) {
        System.out.println(model + ": " + productionYear + ": " + condition);
    }

}
