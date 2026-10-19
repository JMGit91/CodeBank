package codebank.controller;

import codebank.service.AttributeService;
import codebank.service.KeywordService;
import codebank.service.TermService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "home";
    }

    @GetMapping("search")
    public String searchTerms(@RequestParam(value = "search", required = false) String search,
                              @RequestParam(value = "searchcheck",required = false) String searchcheck,
                              @RequestParam(value = "action") String action,
                              Model model) {
        model.addAttribute("languages", keywordService.findAllLanguages());
        if ("search".equals(action)) {
            model.addAttribute("showSearch", true);
            switch (searchcheck) {
                case "1" -> model.addAttribute("results", keywordService.findByName(search));
                case "2" -> model.addAttribute("results", keywordService.findByDescription(search));
                case "3" -> model.addAttribute("results", keywordService.findByCodeExample(search));
            }
            return "home";
        }
        return "redirect:/";
    }
}
