package codebank.service;

import codebank.entity_enums.Language;
import codebank.repository.TermRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermService {

    private final TermRepository termRepository;

    public TermService(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

}
