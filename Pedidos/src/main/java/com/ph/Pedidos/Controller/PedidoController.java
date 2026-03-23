package com.ph.Pedidos.Controller;

import com.ph.Pedidos.Entity.PedidoEntity;
import com.ph.Pedidos.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    public PedidoService pedidoService;

    @PostMapping
    public PedidoEntity create(@RequestBody PedidoEntity pedidoEntity){
        return pedidoService.create(pedidoEntity);
    }

    @GetMapping
    public List<PedidoEntity> findAll(){
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PedidoEntity> findById(@PathVariable Long id){
        return pedidoService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        pedidoService.delete(id);
    }
}
