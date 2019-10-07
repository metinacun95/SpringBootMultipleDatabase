package com.metinacun.testmultipledatabase.repository.mssql;

import com.metinacun.testmultipledatabase.model.mssql.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
