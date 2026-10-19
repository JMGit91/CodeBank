package codebank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Attribute extends Term{

    @ManyToMany(mappedBy = "attributes")
    private List<Keyword> keywords = new ArrayList<>();
}
