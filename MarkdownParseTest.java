import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse_old.getLinks(content));
    }
}
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest