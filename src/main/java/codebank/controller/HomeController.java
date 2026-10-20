package codebank.controller;

import codebank.form.SearchForm;
import codebank.service.AttributeService;
import codebank.service.KeywordService;
import codebank.service.TermService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    private final KeywordService keywordService;
    private final AttributeService attributeService;
    private final TermService termService;

    public HomeController(KeywordService keywordService,
                          AttributeService attributeService,
                          TermService termService) {
        this.keywordService = keywordService;
        this.attributeService = attributeService;
        this.termService = termService;
    }

    @GetMapping
    public String showHome(Model model) {
        model.addAttribute("languages", keywordService.findAllLanguages());
        model.addAttribute("searchForm", new SearchForm());
        return "home";
    }

    @GetMapping("search")
    public String searchTerms(@Valid @ModelAttribute("searchForm") SearchForm searchForm,
                              BindingResult bindingResult,
                              @RequestParam("action") String action,
                              Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("languages", keywordService.findAllLanguages());
            return "home";
        }
        if (action.equals("clear")) {
            return "redirect:/";
        }

        model.addAttribute("languages", keywordService.findAllLanguages());

        model.addAttribute("showSearch", true);
        switch (searchForm.getStatus()) {
            case NAME -> model.addAttribute("results", keywordService.findByName(searchForm.getSearch()));
            case DESCRIPTION -> model.addAttribute("results", keywordService.findByDescription(searchForm.getSearch()));
            case EXAMPLE -> model.addAttribute("results", keywordService.findByCodeExample(searchForm.getSearch()));
        }
        return "home";
    }
}
