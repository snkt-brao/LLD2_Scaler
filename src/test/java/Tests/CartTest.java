package Tests;

import com.sanket.lld2_scaler.SOLID.OnlineStore.Solution.Cart;
import com.sanket.lld2_scaler.SOLID.OnlineStore.Solution.ProductCatalog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CartTest {

    private ProductCatalog productCatalog;
    private Cart cart;

    @BeforeEach
    public void setUp() {
        productCatalog = new ProductCatalog();
        productCatalog.addProduct("Apple", 0.99);
        productCatalog.addProduct("Banana", 0.59);
        cart = new Cart(productCatalog);
    }

    @Test
    public void testAddItem() {
        cart.addItem("Apple", 3);
        assertEquals(3, cart.getItems().get("Apple"));
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Apple", 3);
        cart.removeItem("Apple");
        assertNull(cart.getItems().get("Apple"));
    }

    @Test
    public void testCalculateTotal() {
        cart.addItem("Apple", 3);
        cart.addItem("Banana", 2);
        assertEquals(3 * 0.99 + 2 * 0.59, cart.calculateTotal());
    }
}
