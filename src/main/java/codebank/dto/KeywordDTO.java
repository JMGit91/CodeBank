package codebank.dto;

import codebank.entity_enums.Category;
import codebank.entity_enums.Language;
import codebank.entity_enums.SubCategory;

import java.util.List;

public class KeywordDTO {

    public String name;
    public String description;
    public Language language;
    public String codeExample;
    public Category category;
    public SubCategory subCategory;
    public List<String> attributes;
}
