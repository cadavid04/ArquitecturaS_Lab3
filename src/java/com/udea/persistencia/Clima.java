package com.udea.persistencia;
// Generated Apr 15, 2018 11:48:09 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clima generated by hbm2java
 */
@Entity
@Table(name="clima"
    ,catalog="arqui"
)
public class Clima  implements java.io.Serializable {


     private Integer id;
     private Date dia;
     private int temperatura;
     private int humedad;
     private String tipoNubosidad;
     private double probabilidadprecipitacion;

    public Clima() {
    }

    public Clima(Date dia, int temperatura, int humedad, String tipoNubosidad, double probabilidadprecipitacion) {
       this.dia = dia;
       this.temperatura = temperatura;
       this.humedad = humedad;
       this.tipoNubosidad = tipoNubosidad;
       this.probabilidadprecipitacion = probabilidadprecipitacion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dia", nullable=false, length=10)
    public Date getDia() {
        return this.dia;
    }
    
    public void setDia(Date dia) {
        this.dia = dia;
    }

    
    @Column(name="temperatura", nullable=false)
    public int getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    
    @Column(name="humedad", nullable=false)
    public int getHumedad() {
        return this.humedad;
    }
    
    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    
    @Column(name="tipo_nubosidad", nullable=false, length=15)
    public String getTipoNubosidad() {
        return this.tipoNubosidad;
    }
    
    public void setTipoNubosidad(String tipoNubosidad) {
        this.tipoNubosidad = tipoNubosidad;
    }

    
    @Column(name="probabilidadprecipitacion", nullable=false, precision=22, scale=0)
    public double getProbabilidadprecipitacion() {
        return this.probabilidadprecipitacion;
    }
    
    public void setProbabilidadprecipitacion(double probabilidadprecipitacion) {
        this.probabilidadprecipitacion = probabilidadprecipitacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clima other = (Clima) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clima{" + "id=" + id + ", dia=" + dia + ", temperatura=" + temperatura + ", humedad=" + humedad + ", tipoNubosidad=" + tipoNubosidad + ", probabilidadprecipitacion=" + probabilidadprecipitacion + '}';
    }




}


