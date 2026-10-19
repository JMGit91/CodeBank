package codebank.service;

import codebank.repository.TermRepository;
import org.springframework.stereotype.Service;

@Service
public class TermService {

    private final TermRepository termRepository;

    public TermService(TermRepository termRepository) {
        this.termRepository = termRepository;
    }
}
