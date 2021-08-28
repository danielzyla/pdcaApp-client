package io.github.danielzyla.pdcaclient.dto;

import lombok.Data;

@Data
public class ProductReadDto {
    private long id;
    private String productName, productCode, serialNo;

    @Override
    public String toString() {
        return productName;
    }
}
