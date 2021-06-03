
        import com.google.j2objc.annotations.LoopTranslation;
        import io.github.bonigarcia.seljup.SeleniumJupiter;
        import org.junit.jupiter.api.extension.ExtendWith;
        import io.github.bonigarcia.seljup.SeleniumJupiter;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.extension.ExtendWith;
        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;

    @ExtendWith(SeleniumJupiter.class)
    public class LoginTest {
        @Test
        public void testDangNhapSuccess(EdgeDriver driver) throws InterruptedException {
            driver.get("http://localhost:8081/login");
            WebElement username = driver.findElementById("user-input");
            username.sendKeys("tung");
            WebElement password = driver.findElementById("password-input");
            password.sendKeys("123");
            WebElement button = driver.findElementById("button-input");
            button.click();
            Assertions.assertEquals(driver.getTitle().toString(),"Quản Lý Khách Hàng");
            driver.close();
        }
        @Test
        public void testDangNhapFail(EdgeDriver driver) throws InterruptedException {
            driver.get("http://localhost:8081/login");
            WebElement username = driver.findElementById("user-input");
            username.sendKeys("tu");
            WebElement password = driver.findElementById("password-input");
            password.sendKeys("123");
            WebElement button = driver.findElementById("button-input");
            button.click();
            WebElement textError = driver.findElementById("both-error");
            Assertions.assertEquals(textError.getText(), "Thông tin đăng nhập KHÔNG chính xác vui lòng kiểm tra lại !");
            driver.close();
        }
        @Test
        public void testTenDangNhapBoTrong(EdgeDriver driver) throws InterruptedException {
            driver.get("http://localhost:8081/login");
            WebElement username = driver.findElementById("user-input");
            username.sendKeys("");
            WebElement password = driver.findElementById("password-input");
            password.sendKeys("123");
            WebElement button = driver.findElementById("button-input");
            button.click();
            WebElement textError = driver.findElementById("username-error");
            Assertions.assertEquals(textError.getText(), "Vui lòng điền tên đăng nhập!");
            driver.close();
        }
        @Test
        public void testPasswordBoTrong(EdgeDriver driver) throws InterruptedException {
            driver.get("http://localhost:8081/login");
            WebElement username = driver.findElementById("user-input");
            username.sendKeys("tung");
            WebElement password = driver.findElementById("password-input");
            password.sendKeys("");
            WebElement button = driver.findElementById("button-input");
            button.click();
            WebElement textError = driver.findElementById("password-error");
            Assertions.assertEquals(textError.getText(), "Vui lòng điền mật khẩu!");
            driver.close();
        }
        @Test
        public void testBothBoTrong(EdgeDriver driver) throws InterruptedException {
            driver.get("http://localhost:8081/login");
            WebElement username = driver.findElementById("user-input");
            username.sendKeys("");
            WebElement password = driver.findElementById("password-input");
            password.sendKeys("");
            WebElement button = driver.findElementById("button-input");
            button.click();
            WebElement textError1 = driver.findElementById("username-error");
            Assertions.assertEquals(textError1.getText(), "Vui lòng điền tên đăng nhập!");
            WebElement textError = driver.findElementById("password-error");
            Assertions.assertEquals(textError.getText(), "Vui lòng điền mật khẩu!");
            driver.close();
        }
}
