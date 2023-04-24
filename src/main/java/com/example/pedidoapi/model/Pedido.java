package com.example.pedidoapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Pedido(String id,
                     List<Item> itens,
                     LocalDateTime dataHora,
                     Status status,
                     BigDecimal total) {
    public static record Item(
            String idProduto,
            int quantidade
    ){

    }
    public  enum Status{
        REALIZADO, CONFIRMADO
    }


}
