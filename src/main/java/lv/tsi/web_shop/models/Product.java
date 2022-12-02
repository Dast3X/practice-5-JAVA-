package lv.tsi.web_shop.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Product {


    @Id
    @JsonProperty
    long id;
    @JsonProperty
    String name;
    @JsonProperty
    String description;
    @JsonProperty
    float price;
    @JsonProperty
    String pictureUrl;
    @JsonProperty
    ProductCategory productCategory;
}
