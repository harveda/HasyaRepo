package selenium.learning;

import BaseClass.OpenBrowser;

import org.junit.Test;

import java.io.IOException;


public class TestBaseClass {
    @Test
    public void test01() throws IOException {
        OpenBrowser.NavToWebsite("urlCreate");
        OpenBrowser.NavToWebsite("url");

    }


}
