import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class newMarkdownParseTest {
    
    @Test
    public void newtestFile1() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file-new.md"));
        List<String> expect = List.of("url.com", "`google.com", "google.com", "ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
    @Test
    public void newtestFile2() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file2-new.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void newtestFile3() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file3-new.md"));
        List<String> expect = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void veryNewtestFile1() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file-new.md"));
        List<String> expect = List.of("url.com", "`google.com", "google.com", "ucsd.edu");
        assertEquals(newMarkdownParse.getLinks(contents), expect);
    }
    
    @Test
    public void veryNewtestFile2() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file2-new.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(newMarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void veryNewtestFile3() throws IOException {
        String contents= Files.readString(Path.of("C:\\Users\\nicky\\Downloads\\markdown-parse-main (6)\\markdown-parse-main\\test-file3-new.md"));
        List<String> expect = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(newMarkdownParse.getLinks(contents), expect);
    }

}
