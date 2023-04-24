package com.example.pedidoapi.controller.router;

import com.example.pedidoapi.controller.handler.PedidoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
@Configuration
@RequiredArgsConstructor
public class PedidoRouter {
    private final PedidoHandler handler;
    @Bean

    public RouterFunction<ServerResponse> routes(){
        return RouterFunctions
                .route(GET("/pedidos/{id}"), handler::obterPorId)
                .andRoute(POST("/pedidos"), handler::salvar);
    }

}
