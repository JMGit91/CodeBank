package codebank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Attribute extends Term{

    @ManyToMany(mappedBy = "attributes")
    private List<Keyword> keywords = new ArrayList<>();

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }
}
