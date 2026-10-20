package codebank.service;

import codebank.entity.Keyword;
import codebank.entity_enums.Category;
import codebank.entity_enums.Language;
import codebank.entity_enums.Sub_Category;
import codebank.repository.KeywordRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KeywordService {

    private final KeywordRepository keywordRepository;

    public KeywordService(KeywordRepository keywordRepository) {
        this.keywordRepository = keywordRepository;
    }

    public Keyword findById(Long id) {
        return keywordRepository.findKeywordById(id);
    }

    public List<Language> findAllLanguages() {
        List<Language> languages = new ArrayList<>();
        for (Keyword k : keywordRepository.findAll()) {
            if (!languages.contains(k.getLanguage())) {
                languages.add(k.getLanguage());
            }
        }
        return languages;
    }

    public List<Keyword> findByName(String name) {
        return keywordRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Keyword> findByDescription(String search) {
        return keywordRepository.findByDescriptionContainingIgnoreCase(search);
    }

    public List<Keyword> findByCodeExample(String search) {
        return keywordRepository.findByCodeExampleContainingIgnoreCase(search);
    }

    public List<Category> findLanguageCategories(Language language) {
        List<Keyword> keywords = keywordRepository.findByLanguage(language);
        List<Category> categories = new ArrayList<>();
        for (Keyword keyword : keywords) {
            if (!categories.contains(keyword.getCategory())) {
                categories.add(keyword.getCategory());
            }
        }
        return categories;
    }

    public List<Keyword> findByLanguage(Language language) {
       return keywordRepository.findByLanguage(language);
    }

    public List<Keyword> findByCategory(Category category) {
        return keywordRepository.findByCategory(category);
    }

    public List<Sub_Category> findSubCategoryByCategory(Category category) {
        return category.getSubCategories();
    }
}
