import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Get today's date
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = today.format(formatter);

        // Display a unique birthday message with animation
        String name = "Rishabdev";
        printWithDelay("**************************************", 100);
        printWithDelay("*            HAPPY BIRTHDAY          *", 100);
        printWithDelay("*              " + name + "             *", 100);
        printWithDelay("**************************************\n", 100);

        printWithDelay("Dear " + name + ",\n", 100);
        printWithDelay("On this special day of " + formattedDate + ",\n", 100);
        printWithDelay("May your life be filled with as much joy and excitement as the thrill of writing your first Java code!", 100);
        printWithDelay("As you embark on your journey to becoming an exceptional Java developer, remember this:", 100);
        printWithDelay("\n\"Every great developer you know got there by solving problems they were unqualified to solve until they actually did it.\" - Patrick McKenzie\n", 100);
        printWithDelay("So, keep pushing your limits and coding your way to success!", 100);
        printWithDelay("\nBest wishes,", 100);
        printWithDelay("Your Java-Loving Friends\n", 100);

        // Animate the drawing of the cake
        drawCake();
    }

    public static void printWithDelay(String message, int delay) throws InterruptedException {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }
        System.out.println();
    }

    public static void drawCake() throws InterruptedException {
        printWithDelay("      i i i i i i i i i i", 50);
        printWithDelay("    |:H:a:p:p:y: :B:i:r:t:h:d:a:y:|", 50);
        printWithDelay("  __|_____________________________|__", 50);
        printWithDelay(" |___________________________________|", 50);
        printWithDelay("  |  |  |  |  |  |  |  |  |  |  |  |", 50);
        printWithDelay("  |~~|~~|~~|~~|~~|~~|~~|~~|~~|~~|~~|", 50);
        printWithDelay("  |__|__|__|__|__|__|__|__|__|__|__|", 50);
        printWithDelay("      (_)                 (_)", 50);
        printWithDelay("       |                   |", 50);
        printWithDelay("      |__|                 |__|", 50);
        printWithDelay("     (____)               (____)", 50);
    }
}
