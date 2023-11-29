import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTests {

    private org.example.Main Main;

    @Test
    public void testOfficeCostOutput() {
        // Mocka System.out.println för att fånga upp det utskrivna värdet
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Anropa main-metoden i Main-klassen
        Main.main(new String[]{});

        // Hämta det utskrivna värdet
        String output = outContent.toString().trim();

        // Assertion för att kontrollera att rätt information skrivs ut
        assertTrue(output.contains("Kostnad för kontor 1:"));
        assertTrue(output.contains("Kostnad för kontor 2:"));
        assertTrue(output.contains("Kostnad för kontor 3:"));
        assertTrue(output.contains("Kostnad för kontor 4:"));
        assertTrue(output.contains("Kostnad för kontor 5:"));
        assertTrue(output.contains("Kostnad för kontor 6:"));
    }
}
