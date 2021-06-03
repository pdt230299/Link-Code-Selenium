
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
public class DonHangTest {
    public String homeDonHangUrl = "http://localhost:8081/donhang";
    @Test
    public void testThemDonHangThanhCong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        Assertions.assertEquals(driver.getTitle().toString(),"Quản Lý Đơn Hàng");
        driver.close();
    }
    @Test
    public void testThemDonHangTenKhachHangBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("tenkhachhang-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên khách hàng!");
        driver.close();
    }
    @Test
    public void testThemDonHangTenKhachHangCoSO(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang123");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("tenkhachhang-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên của khách hàng không có số!");
        driver.close();
    }
    @Test
    public void testThemDonHangTenMatHangBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("tenmathang-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên mặt hàng!");
        driver.close();
    }
    @Test
    public void testThemDonHangSoLuongBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền số lượng sản phẩm!");
        driver.close();
    }
    @Test
    public void testThemDonHangSoLuongCoChu(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20a");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền số lượng không có chữ !");
        driver.close();
    }
    @Test
    public void testThemDonHangSoLuongLonHonQuyDinh(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement createBtn = driver.findElementById("create-btn-donhang");
        createBtn.click();
        //fill
        WebElement tenKhachHang = driver.findElementById("tenkhachhang-input");
        tenKhachHang.sendKeys("Nguyễn Trường Giang");
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("200");
        WebElement button = driver.findElementById("btn-create-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Số lượng sản phẩm không hợp lệ nhỏ hơn 100!");
        driver.close();
    }
//    ----------------------------------------EDIT--------------------------------------------------
    @Test
    public void testSuaDonHangThanhCong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-12");
        editBtn.click();
        //fill
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.clear();
        tenDonHang.sendKeys("Thuốc lá");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.clear();
        soLuong.sendKeys("50");
        WebElement button = driver.findElementById("btn-edit-donhang");
        button.click();
        Assertions.assertEquals(driver.getTitle().toString(),"Quản Lý Đơn Hàng");
        driver.close();
    }
    @Test
    public void testSuaDonHangTenMatHangBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-12");
        editBtn.click();
        //fill
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.clear();
        tenDonHang.sendKeys("");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.clear();
        soLuong.sendKeys("20");
        WebElement button = driver.findElementById("btn-edit-donhang");
        button.click();
        WebElement textError = driver.findElementById("tenmathang-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền tên mặt hàng!");
        driver.close();
    }
    @Test
    public void testSuaDonHangSoLuongBoTrong(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-12");
        editBtn.click();
        //fill
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.clear();
        WebElement button = driver.findElementById("btn-edit-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền số lượng sản phẩm!");
        driver.close();
    }
    @Test
    public void testSuaDonHangSoLuongCoChu(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-12");
        editBtn.click();
        //fill
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("20a");
        WebElement button = driver.findElementById("btn-edit-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Vui lòng điền số lượng không có chữ !");
        driver.close();
    }
    @Test
    public void testSuaDonHangSoLuongLonHonQuyDinh(EdgeDriver driver) throws InterruptedException {
        driver.get(homeDonHangUrl);
        //click btn-element
        WebElement editBtn = driver.findElementById("edit-12");
        editBtn.click();
        //fill
        WebElement tenDonHang = driver.findElementById("tenmathang-input");
        tenDonHang.sendKeys("Xúc Xích");
        WebElement soLuong = driver.findElementById("soluong-input");
        soLuong.sendKeys("200");
        WebElement button = driver.findElementById("btn-edit-donhang");
        button.click();
        WebElement textError = driver.findElementById("soluong-input-error");
        Assertions.assertEquals(textError.getText(), "Số lượng sản phẩm không hợp lệ nhỏ hơn 100!");
        driver.close();
    }

}
