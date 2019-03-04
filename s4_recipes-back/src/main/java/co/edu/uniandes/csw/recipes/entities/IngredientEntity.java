/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.recipes.entities;

import javax.persistence.Entity;

/**
 *
 * @author Nicolas Diaz
 */
@Entity
public class IngredientEntity extends BaseEntity{
    private String nombre;
    private Long calorias;
    
    public IngredientEntity(){
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the calorias
     */
    public Long getCalorias() {
        return calorias;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(Long calorias) {
        this.calorias = calorias;
    }
}
