
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
public class CustomerTest {
    public String homeCustomerUrl = "http://localhost:8081/customers";


    @Test
    public void testThemKhachHangThanhCong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("giang");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        Assertions.assertEquals(driver.getTitle().toString(),"Quản Lý Khách Hàng");
        driver.close();
    }
    @Test
    public void testThemKhachHangUserNameBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("username-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên đăng nhập!");
        driver.close();
    }
    @Test
    public void testThemKhachHangPasswordBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("password-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền mật khẩu!");
        driver.close();
    }
    @Test
    public void testThemKhachHangCmndBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("cmnd-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền CMND!");
        driver.close();
    }
    @Test
    public void testThemKhachHangTenBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("ten-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên của khách hàng!");
        driver.close();
    }
    @Test
    public void testThemKhachHangDiaChiBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("diachi-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền địa chỉ!");
        driver.close();
    }
    @Test
    public void testThemKhachHangCmndCoChu(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789a");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("cmnd-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền CMND không có chữ !");
        driver.close();
    }
    @Test
    public void testThemKhachHangTenKhachHangCoSo(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-customer");
        createBtn.click();
        //fill
        WebElement tenDangNhap = driver.findElementById("username-input");
        tenDangNhap.sendKeys("tu");
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.sendKeys("123456789");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.sendKeys("Nguyễn Trường Giang123");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-create");
        button.click();
        WebElement textError = driver.findElementById("ten-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên của khách hàng không có số!");
        driver.close();
    }
//    -----------------------------------EDIT-----------------------------------------------
    @Test
    public void testSuaKhachHangThanhCong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.clear();
        cmnd.sendKeys("123456780");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        hoTen.sendKeys("Nguyễn Trường Sâu");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        Assertions.assertEquals(driver.getTitle().toString(),"Quản Lý Khách Hàng");
        driver.close();
    }
    @Test
    public void testSuaKhachHangPasswordBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.clear();
        cmnd.sendKeys("123456780");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        hoTen.sendKeys("Nguyễn Trường Sâu");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("password-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền mật khẩu!");
        driver.close();
    }
    @Test
    public void testSuaKhachHangCmndBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.clear();
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        hoTen.sendKeys("Nguyễn Trường Sâu");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("cmnd-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền CMND!");
        driver.close();
    }
    @Test
    public void testSuaKhachHangTenBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("ten-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên của khách hàng!");
        driver.close();
    }
    @Test
    public void testSuaKhachHangDiaChiBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        WebElement hoTen = driver.findElementById("ten-input");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("diachi-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền địa chỉ!");
        driver.close();
    }
        @Test
    public void testSuaKhachHangCmndCoChu(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.clear();
        cmnd.sendKeys("123456780abc");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        hoTen.sendKeys("Nguyễn Trường Sâu");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("cmnd-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền CMND không có chữ !");
        driver.close();
    }
    @Test
    public void testSuaKhachHangTenCoSo(EdgeDriver driver) throws InterruptedException {
        driver.get(homeCustomerUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-34");
        editBtn.click();
        //fill
        WebElement matKhau = driver.findElementById("password-input");
        matKhau.clear();
        matKhau.sendKeys("123");
        WebElement cmnd = driver.findElementById("cmnd-input");
        cmnd.clear();
        cmnd.sendKeys("123456780");
        WebElement hoTen = driver.findElementById("ten-input");
        hoTen.clear();
        hoTen.sendKeys("Nguyễn Trường Sâu12");
        WebElement diaChi = driver.findElementById("diachi-input");
        diaChi.clear();
        diaChi.sendKeys("Hà Nội");
        WebElement button = driver.findElementById("btn-edit");
        button.click();
        WebElement textError = driver.findElementById("ten-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên của khách hàng không có số!");
        driver.close();
    }
}
