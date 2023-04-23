package com.example.pedidoapi.repository;

import com.example.pedidoapi.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class PedidoRepository {
    private static  final List<Pedido> PEDIDOS_DB = new CopyOnWriteArrayList<>();

    public void salvar (Pedido pedido){
        PEDIDOS_DB.add(pedido);
    }

    public Optional<Pedido> buscarPorId(String id){
        return PEDIDOS_DB.stream().filter(entity -> entity.id().equals(id))
                .findFirst();
    }

    public List<Pedido> buscarTodos(){
        return  new ArrayList<>(PEDIDOS_DB);
    }
}
