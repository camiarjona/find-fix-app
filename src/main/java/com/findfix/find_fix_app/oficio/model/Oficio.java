package com.findfix.find_fix_app.oficio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oficios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oficio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oficio")
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre.toUpperCase() : null;
    }



}
