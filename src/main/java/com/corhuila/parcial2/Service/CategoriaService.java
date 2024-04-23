package com.corhuila.parcial2.Service;

import com.corhuila.parcial2.Entity.Categoria;
import com.corhuila.parcial2.IRepository.IBaseRepository;
import com.corhuila.parcial2.IRepository.ICategoriaRepository;
import com.corhuila.parcial2.IService.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends ABaseService<Categoria> implements ICategoriaService {

    @Override
    protected IBaseRepository<Categoria, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ICategoriaRepository repository;
}