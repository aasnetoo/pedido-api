package com.example.pedidoapi.service;

import com.example.pedidoapi.dto.PedidoDTO;
import com.example.pedidoapi.model.Pedido;
import com.example.pedidoapi.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repository;
    public void salvar(PedidoDTO pedidoDTO){
        String uid = UUID.randomUUID().toString();
       var itensEntity = pedidoDTO.itens().stream()
               .map(dto-> new Pedido.Item(dto.idProduto(), dto.quantidade()))
               .toList();
       var pedidoEntity =  new Pedido(uid,
                itensEntity,
                LocalDateTime.now(),
                Pedido.Status.REALIZADO, BigDecimal.ZERO
                );
         repository.salvar(pedidoEntity);

    }
}
