package steps;


import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseUtil {
    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void initializeTest() {
        System.out.println("Message before Test");
    }

    @After
    public void tearDown() {
        System.out.println("Closing the browser");
        baseUtil.driver.close();
    }
}
