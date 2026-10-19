package codebank.dataloader;

import codebank.dto.AttributeDTO;
import codebank.dto.KeywordDTO;
import codebank.entity.Attribute;
import codebank.entity.Keyword;
import codebank.repository.AttributeRepository;
import codebank.repository.KeywordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final ObjectMapper mapper = new ObjectMapper();

    private final KeywordRepository keywordRepository;
    private final AttributeRepository attributeRepository;

    public DataLoader(KeywordRepository keywordRepository,
                      AttributeRepository attributeRepository) {
        this.keywordRepository = keywordRepository;
        this.attributeRepository = attributeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (keywordRepository.count() == 0) {
            List<Attribute> attributes = loadAttributes();
            List<Keyword> keywords = loadKeywords();

            linkAttributesToKeywords(attributes, keywords);
        }
    }

        private List<Attribute> loadAttributes() throws Exception {
            File file = new File("src/main/resources/data/modifiers.json");
            List<AttributeDTO> dtos = mapper.readValue(file, new TypeReference<List<AttributeDTO>>() {});

            List<Attribute> attributes = new ArrayList<>();

            for (AttributeDTO dto : dtos) {
                Attribute a = new Attribute();
                a.setName(dto.name);
                a.setDescription(dto.description);
                a.setLanguage(dto.language);

                attributes.add(attributeRepository.save(a));
            }

            return attributes;
        }
        private List<Keyword> loadKeywords() throws Exception {
            File file = new File("src/main/resources/data/commands.json");
            List<KeywordDTO> dtos = mapper.readValue(file, new TypeReference<List<KeywordDTO>>() {});

            List<Keyword> keywords = new ArrayList<>();

            for (KeywordDTO dto : dtos) {
                Keyword k = new Keyword();
                k.setName(dto.name);
                k.setDescription(dto.description);
                k.setLanguage(dto.language);
                k.setCodeExample(dto.codeExample);
                k.setCategory(dto.category);
                k.setSubCategory(dto.subCategory);

                keywords.add(keywordRepository.save(k));
            }

            return keywords;
        }
        private void linkAttributesToKeywords(List<Attribute> attributes,
                                              List<Keyword> keywords) throws Exception {
        File file = new File("src/main/resources/data/commands.json");
        List<KeywordDTO> dtos = mapper.readValue(file, new TypeReference<List<KeywordDTO>>() {});

        for (int i = 0; i < keywords.size(); i++) {
            Keyword keyword = keywords.get(i);
            KeywordDTO dto = dtos.get(i);

            if (dto.attributes != null) {
                List<Attribute> linked = attributeRepository.findByNameIn(dto.attributes);
                keyword.getAttributes().addAll(linked);
                keywordRepository.save(keyword);
            }
        }
        }
}
