public class myMain {
    private static final char ExitKey = 'q';

    public static void main(String[] args) {
        Data ReadVar= new Data(ExitKey);
        System.out.println("------------------IF NEED CLOSED PROGRAM INPUT 'q' -----------");
        while (true) {
            try {

                System.out.println("Input (a+b=) or (a-b=) or (a*b=) or (a/b), where a and b in [0,10]: ");
                ReadVar.Running();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                System.exit(0);

            }
            if (ReadVar.ExitFlag()) {
                System.out.println("Program closing...");
                break;
            }

        }
    }

}
