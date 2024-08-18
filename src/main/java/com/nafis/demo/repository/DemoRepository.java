package com.nafis.demo.repository;


import com.nafis.demo.entity.Definition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Definition, Long> {

    /*
    https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
     */

    Definition findByWord(String word);

}
