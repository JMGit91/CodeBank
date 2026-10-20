package codebank.controller;

import codebank.entity.Keyword;
import codebank.entity_enums.Category;
import codebank.entity_enums.Language;
import codebank.service.AttributeService;
import codebank.service.KeywordService;
import codebank.service.TermService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LanguageController {

    private final TermService termService;
    private final KeywordService keywordService;
    private final AttributeService attributeService;

    public LanguageController(TermService termService,
                              KeywordService keywordService,
                              AttributeService attributeService) {
        this.termService = termService;
        this.keywordService = keywordService;
        this.attributeService = attributeService;
    }
    @GetMapping("/{language}")
    public String showLanguagePage(@PathVariable Language language, Model model){
        model.addAttribute("categoryList", keywordService.findLanguageCategories(language));
        model.addAttribute("language", language);
        return "language";
    }
    @GetMapping("/categories/{language}/{category}")
    public String getCategory(@PathVariable Language language,
                              @PathVariable Category category,
                              @RequestParam String action,
                              Model model) {
        List<Keyword> keywords = keywordService.findByCategory(category);

        model.addAttribute("language", language);
        model.addAttribute("category", category.getCategory());
        model.addAttribute("categoryList", keywordService.findLanguageCategories(language));
        model.addAttribute("categoryKeywords", keywords);
        model.addAttribute("showCategory", action.equals("show"));
        model.addAttribute("subcategoryList", keywordService.findSubCategoryByCategory(category));
        return "language";
    }
    @GetMapping("/attributes/{Id}")
    public String getKeywordAttributes(@PathVariable Long Id,
                                      String show,
                                      Model model) {
        Keyword key = keywordService.findById(Id);

        model.addAttribute("attributesList", key.getAttributes());
        model.addAttribute("keyword", key.getName());
        model.addAttribute("category", key.getCategory());
        model.addAttribute("language", key.getLanguage());
        model.addAttribute("showAttributes", show.equals("true"));
        return "language";
    }
}
