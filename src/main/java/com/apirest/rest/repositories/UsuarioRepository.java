package com.apirest.rest.repositories;

import java.util.ArrayList;

import com.apirest.rest.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    // Solo con el nombre se implementa, no es necesario un método
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

    
}
