package com.nafis.demo.model;

import com.nafis.demo.entity.Definition;
import com.nafis.demo.model.dictionary.DictionaryEntry;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DemoResponse {
    private Definition definition;
}
