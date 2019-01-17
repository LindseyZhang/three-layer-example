package com.cmb.avatar.threelayerdemo.controllertest;

import com.cmb.avatar.threelayerdemo.controller.ProductController;
import com.cmb.avatar.threelayerdemo.repository.model.Product;
import com.cmb.avatar.threelayerdemo.service.ProductService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@AutoConfigureMockMvc
public class ProductControllerTest {
    @Before
    public void setUp() {
        Product product = new Product();
        product.setId("001");
        product.setName("product 1");
        product.setPrice(35.5f);

        final ProductService productService = when(mock(ProductService.class).query(anyString())).thenReturn(Collections.singletonList(product)).getMock();

        RestAssuredMockMvc.standaloneSetup(new ProductController(productService));
    }

    @Test
    public void should_query_product_successful() {
        given()
            .param("name", "test")
       .when()
            .get("/products")
       .then()
            .statusCode(200)
            .body("size()", is(1))
            .body("[0].id", is("001"))
            .body("[0].name", is("product 1"))
            .body("[0].price", is(35.5f));
    }

}