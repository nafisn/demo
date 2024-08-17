package com.nafis.demo.service;

import com.nafis.demo.DemoException;
import com.nafis.demo.entity.Definition;
import com.nafis.demo.model.DemoRequest;
import com.nafis.demo.model.DemoResponse;
import com.nafis.demo.model.dictionary.DictionaryEntry;
import com.nafis.demo.repository.DemoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class DemoService {

    @Value("${dictionary.api.url}")
    private String DICTIONARY_URL;

    private RestTemplate restTemplate = new RestTemplate();
    private DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public DictionaryEntry[] getDefinition(String word) {
        log.info("URL: " + DICTIONARY_URL + word);
        ResponseEntity<DictionaryEntry[]> response
                = restTemplate.getForEntity(DICTIONARY_URL + word, DictionaryEntry[].class);

        return response.getBody();
    }

    public DemoResponse createDefinition(DemoRequest demoRequest) {
        Definition newWord = Definition.builder()
                .word(demoRequest.getWord())
                .definition(demoRequest.getDefinition())
                .example(demoRequest.getExample())
                .build();
        return DemoResponse.builder()
                .definition(this.demoRepository.save(newWord))
                .build();
    }

    public Definition getNewDefinition(String word) throws DemoException {
        Definition definition= this.demoRepository.findByWord(word);
        if (definition == null) {
            throw new DemoException("Word does not exist yet.");
        }
        return this.demoRepository.findByWord(word);
    }
}
