package com.nafis.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DEFINITION_TABLE")
public class Definition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long definitionId;

    private String word;
    private String definition;
    private String example;
}
