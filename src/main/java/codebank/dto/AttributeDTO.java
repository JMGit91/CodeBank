package codebank.dto;

import codebank.entity.Keyword;
import codebank.entity_enums.Language;

import java.util.List;

public class AttributeDTO {

    public String name;
    public String description;
    public Language language;
    public List<String> keywords;
}
