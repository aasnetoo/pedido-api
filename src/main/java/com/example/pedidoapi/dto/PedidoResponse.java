package com.example.pedidoapi.dto;

import com.example.pedidoapi.model.Pedido;

import java.util.List;

public record
PedidoResponse(String id, List<ItemDTO> itens, Pedido.Status status) {
}
