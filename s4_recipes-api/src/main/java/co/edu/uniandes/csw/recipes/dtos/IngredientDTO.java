/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.recipes.dtos;

import co.edu.uniandes.csw.recipes.entities.IngredientEntity;

/**
 *
 * @author Nicolas Diaz
 */
public class IngredientDTO {
    private String nombre;
    private Long calorias;
    private Long id;
    
    public IngredientDTO(){
    
    }
    
    public IngredientDTO(IngredientEntity entity){
        this.nombre = entity.getNombre();
        this.calorias = entity.getCalorias();
        this.id = entity.getId();
    }
    
    public IngredientEntity toEntity() {
    IngredientEntity entity = new IngredientEntity();
    entity.setId(this.id);
    entity.setNombre(this.nombre);
    entity.setCalorias(this.calorias);
    return entity;
    }
}
