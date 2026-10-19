package codebank.service;

import codebank.entity.Keyword;
import codebank.entity_enums.Category;
import codebank.entity_enums.Language;
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
}
