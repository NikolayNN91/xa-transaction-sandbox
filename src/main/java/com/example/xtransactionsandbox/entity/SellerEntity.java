package com.example.xtransactionsandbox.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class SellerEntity {

    @Id
    private String id;
    private String name;
    private List<String> goods;
}
