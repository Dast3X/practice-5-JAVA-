package lv.tsi.web_shop.service;

import lv.tsi.web_shop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
