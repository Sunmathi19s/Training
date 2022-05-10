package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;
	
    @Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
	     
		String sql = "insert into shanma_product values(?,?,?)";
		
		return template.update(sql, t.getProductId(),t.getProductName(),t.getPrice());
	}

	@Override
	public List<Product> findAll() {
		
		String sql = "select * from shanma_product";
		
		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public Optional<Product>findById(int id) {
		
		Optional<Product> obj = Optional.empty();
		
		
		try {
			Product prd =  template
					 .queryForObject(
					      "SELECT * FROM shanma_product WHERE Product_id=?",
					     BeanPropertyRowMapper.newInstance(Product.class),id);
			
			obj = Optional.of(prd); 

		}catch (IncorrectResultSizeDataAccessException e) {
			obj =  null;
		}
		return obj;
	}

	@Override
	public int Update(Product entity) {
	
		return template.update("Update shanma_product SET  product_Name=?,price=? where product_Id=?",
		        new Object[] { entity.getProductName(),entity.getPrice(),
		        		entity.getProductId() });
	  }

	

	@Override
	public int remove(int id) {
		return template.update("DELETE FROM  shanma_product WHERE product_Id=?", id);
		
	}

}
