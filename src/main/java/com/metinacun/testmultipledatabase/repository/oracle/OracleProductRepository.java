package com.metinacun.testmultipledatabase.repository.oracle;

import com.metinacun.testmultipledatabase.model.oracle.OracleProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleProductRepository extends JpaRepository<OracleProduct, Integer> {
}
