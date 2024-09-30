package com.example.apirest.services;

import com.example.apirest.entities.Base;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.io.Serializable;
import java.util.List;

//Se hace generica para que pueda recibir cualquier entidad que tengamos en nuestra aplicacion
public interface BaseService<E extends Base, ID extends Serializable> {
    //Metodos principales CRUD

    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pegeable) throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(E entity, ID id ) throws Exception;
    public boolean delete(ID id) throws Exception;

}
