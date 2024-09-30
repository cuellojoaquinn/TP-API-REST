package com.example.apirest.services;

import com.example.apirest.entities.Localidad;
import com.example.apirest.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public Page<Localidad> findAll(Pageable pageable) throws Exception {
        return null;
    }
}
