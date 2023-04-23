package com.example.pedidoapi.dto;

import java.util.List;

public record PedidoDTO(
        List<ItemDTO> itens

) {
}
