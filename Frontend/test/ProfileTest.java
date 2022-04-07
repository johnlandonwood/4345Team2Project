import static org.junit.Assert.*;
import static play.test.Helpers.contentAsString;

import org.junit.Test;
import play.twirl.api.Content;

public class ProfileTest {

//    @Test
//    public void testSum() {
//        int a = 1 + 1;
//        assertEquals(2, a);
//    }
//
//    @Test
//    public void testString() {
//        String str = "Hello world";
//        assertFalse(str.isEmpty());
//    }

    @Test
    public void testProfile() {
        Content html = views.html.myprofile.render(
                "Landon",
                "Wood",
                "Student",
                "Junior CS Student at SMU",
                "214-111-1111",
                "landonw@smu.edu"
        );
        assertEquals("text/html", html.contentType());
        assertTrue(contentAsString(html).contains("Landon"));
        assertTrue(contentAsString(html).contains("Wood"));
        assertTrue(contentAsString(html).contains("Student"));
        assertTrue(contentAsString(html).contains("Junior CS Student at SMU"));
        assertTrue(contentAsString(html).contains("214-111-1111"));
        assertTrue(contentAsString(html).contains("landonw@smu.edu"));
    }
}