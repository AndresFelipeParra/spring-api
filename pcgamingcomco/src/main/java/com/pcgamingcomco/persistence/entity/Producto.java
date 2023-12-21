package com.pcgamingcomco.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_producto")
    private  Integer idProducto;
 /// falta mapear el resto de campos de la base de datos 
}
