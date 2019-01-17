package com.cmb.avatar.threelayerdemo.repository;

import com.cmb.avatar.threelayerdemo.controller.command.AddProductCommand;
import com.cmb.avatar.threelayerdemo.repository.model.Product;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {

    private final SqlSession sqlSession;

    @Autowired
    public ProductRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Product> findByName(String name) {
        final HashMap<String, String> params = new HashMap<>();
        params.put("name", name);
        return this.sqlSession.selectList("findByName", params);
    }

    public int addProduct(AddProductCommand addProductCommand) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", addProductCommand.getName());
        params.put("price", addProductCommand.getPrice());
        return this.sqlSession.insert("addProduct", params);
    }
}
