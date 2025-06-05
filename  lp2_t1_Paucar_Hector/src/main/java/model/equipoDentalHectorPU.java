package model;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
@Entity
@Table(name = "tbl_equipo_dental")
public class equipoDentalHectorPU {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    private int nroEquipo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "costo", nullable = false, precision = 10, scale = 2)
    private BigDecimal costo;

    @Column(name = "fecha_adquisicion", nullable = false)
    private LocalDateTime fechaAdquisicion;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_dentista", nullable = true)
    private DentistaHectorPU dentista;
}
