package codebank.entity;

import codebank.entity_enums.Category;
import codebank.entity_enums.Sub_Category;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Keyword extends Term{

    private String codeExample;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private Sub_Category sub_category;


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

    public Sub_Category getSubCategory() {
        return sub_category;
    }

    public void setSubCategory(Sub_Category sub_category) {
        this.sub_category = sub_category;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
