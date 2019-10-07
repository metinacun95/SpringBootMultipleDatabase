package com.metinacun.testmultipledatabase.repository.oracle;

import com.metinacun.testmultipledatabase.model.oracle.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
