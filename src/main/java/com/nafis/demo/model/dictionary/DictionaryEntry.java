package com.nafis.demo.model.dictionary;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DictionaryEntry {

    private String word;
    private String phonetic;
    private List<Phonetic> phonetics;
    private List<Meaning> meanings;
    private License license;
    private List<String> sourceUrls;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Phonetic {
        private String text;
        private String audio;
        private String sourceUrl;
        private License license;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Meaning {
        private String partOfSpeech;
        private List<Definition> definitions;
        private List<String> synonyms;
        private List<String> antonyms;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Definition {
        private String definition;
        private List<String> synonyms;
        private List<String> antonyms;
        private String example;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class License {
        private String name;
        private String url;
    }
}
