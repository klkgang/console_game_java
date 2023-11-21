public class game {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Pick a number between 1 and 10: ");
            var input = System.console().readLine();
            var number = Integer.parseInt(input);

            if (number < 1 || number > 10) {
                System.out.println("You must pick a number between 1 and 10!");
                continue;
            } else if (number < 7) {
                System.out.println("Too low!");
            } else if (number > 7) {
                System.out.println("Too high!");
            } 
            if (number == 7) {
                System.out.println("You win!");
                break;
            }
        }
    }
}
