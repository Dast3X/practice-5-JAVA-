package lv.tsi.web_shop.resource;

import lv.tsi.web_shop.models.Product;
import lv.tsi.web_shop.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.boot.BootstrapRegistry.InstanceSupplier.of;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ProductResource {
    private ProductRepository repository;

    @Autowired
    public ProductResource(ProductRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return repository.findAll();
    }
    @GetMapping("/getProduct")
    public Optional<Product> getProduct(long id) {
        return repository.findById(id);
    }
}
