package codebank.controller;

import codebank.entity_enums.Language;
import codebank.service.AttributeService;
import codebank.service.KeywordService;
import codebank.service.TermService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
