package codebank.repository;

import codebank.entity.Keyword;
import codebank.entity_enums.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeywordRepository extends JpaRepository<Keyword, Long> {

    List<Keyword> findByNameContainingIgnoreCase(String name);

    List<Keyword> findByDescriptionContainingIgnoreCase(String search);

    List<Keyword> findByCodeExampleContainingIgnoreCase(String search);

    List<Keyword> findByLanguage(Language language);
}
