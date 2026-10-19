package codebank.service;

import codebank.repository.AttributeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeService {

    private final AttributeRepository attributeRepository;

    public AttributeService(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

}
