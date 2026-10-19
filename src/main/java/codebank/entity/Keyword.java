package codebank.entity;

import codebank.entity_enums.Category;
import codebank.entity_enums.Language;
import codebank.entity_enums.SubCategory;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Keyword extends Term{

    private String codeExample;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private SubCategory subCategory;


    @ManyToMany
    @JoinTable(name = "keyword_attribute",
    joinColumns = @JoinColumn(name = "keyword_id"),
    inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    private List<Attribute> attributes = new ArrayList<>();


    public String getCodeExample() {
        return codeExample;
    }

    public void setCodeExample(String codeExample) {
        this.codeExample = codeExample;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
