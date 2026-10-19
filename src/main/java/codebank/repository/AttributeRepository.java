package codebank.repository;

import codebank.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

    List<Attribute> findByNameIn(List<String> attributes);
}
