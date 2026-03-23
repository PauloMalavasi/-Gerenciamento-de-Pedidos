package com.ph.Pedidos.Repository;

import com.ph.Pedidos.Entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
