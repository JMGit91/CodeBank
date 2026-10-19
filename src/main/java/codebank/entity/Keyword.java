package codebank.entity;

import codebank.entity_enums.Category;
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
}
