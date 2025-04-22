import static org.junit.Assert.assertEquals;
import org.junit.Test;
import product.Product;

public class ProductTest {

    @Test
    public void testGetProductId() {
        Product product = new Product("P001", "Laptop", 1500.0);
        assertEquals("P001", product.getProductId());
    }

    @Test
    public void testGetProductName() {
        Product product = new Product("P001", "Laptop", 1500.0);
        assertEquals("Laptop", product.getProductName());
    }

    @Test
    public void testGetPrice() {
        Product product = new Product("P001", "Laptop", 1500.0);
        assertEquals(1500.0, product.getPrice(), 0.001);
    }

    @Test
    public void testSetPrice() {
        Product product = new Product("P001", "Laptop", 1500.0);
        product.setPrice(1600.0);
        assertEquals(1600.0, product.getPrice(), 0.001);
    }

    @Test
    public void testConstructor() {
        Product product = new Product("P002", "Phone", 800.0);
        assertEquals("P002", product.getProductId());
        assertEquals("Phone", product.getProductName());
        assertEquals(800.0, product.getPrice(), 0.001);
    }
}
