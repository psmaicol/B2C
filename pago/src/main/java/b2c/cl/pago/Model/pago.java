package b2c.cl.pago.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Pago")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class pago {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGO")
    private Long idPago;

    @Column(name = "idUsuario")
    private Long idUsuario;

    @Column(name = "fechaPago")
    private Date fechaPago;

    @Column(name = "montoTotal")
    private Long montoTotal;
    
}