package com.example.pedidoapi.dto;

import java.util.List;

public record PedidoRequest(
        List<ItemDTO> itens

) {
}
