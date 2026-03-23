package com.ph.Pedidos.Service;

import com.ph.Pedidos.Entity.PedidoEntity;
import com.ph.Pedidos.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    public PedidoRepository pedidoRepository;

    public List<PedidoEntity> findAll(){
        return pedidoRepository.findAll();
    }

    public PedidoEntity create(PedidoEntity pedidoEntity){
        return pedidoRepository.save(pedidoEntity);
    }

    public void delete(Long id){
        pedidoRepository.deleteById(id);
    }

    public Optional<PedidoEntity> findId(Long id){
        return pedidoRepository.findById(id);
    }
}
