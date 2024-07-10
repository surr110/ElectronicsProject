package com.Amazon.productdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Amazon.productentity.ProductEntity;
import com.Amazon.productrepo.ProductRepo;
@Repository
public class ProductDao {
	@Autowired
	ProductRepo pr;

	public String setAll(ProductEntity p) {
		pr.save(p);
		return "<--------Ordered Sucessfully----------->";
	}

}
