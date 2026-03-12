package b2c.cl.pago.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import b2c.cl.pago.Model.pago;

public interface pagoRepository extends JpaRepository<pago, Long> {
    
}