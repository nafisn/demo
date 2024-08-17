package com.nafis.demo.repository;


import com.nafis.demo.entity.Definition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Definition, Long> {

    Definition findByWord(String word);
}
