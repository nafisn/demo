package com.nafis.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
public class DemoRequest {
    private String word;
    private String definition;
    private String example;

}
