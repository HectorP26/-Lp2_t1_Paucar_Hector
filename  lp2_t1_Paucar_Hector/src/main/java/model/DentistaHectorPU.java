package model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "tbl_dentista", uniqueConstraints = {
    @UniqueConstraint(name = "uq_tbl_dentista_correo", columnNames = "correo")
})
public class DentistaHectorPU {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    private int id;

    @Column(name = "cop", nullable = false, length = 6)
    private String cop;

    @Column(name = "nombre_completo", nullable = false, length = 50)
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    private LocalDate fechaInicioContrato;

    @Column(name = "turno", nullable = false, length = 1)
    private String turno;

    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private DentistaHectorPU especialidad;
    
    @Override
    public String toString() {
        return this.nombreCompleto; 
    }
	
}
