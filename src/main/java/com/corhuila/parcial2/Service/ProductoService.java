package com.corhuila.parcial2.Service;

import com.corhuila.parcial2.Entity.Producto;
import com.corhuila.parcial2.IRepository.IBaseRepository;
import com.corhuila.parcial2.IRepository.IProductoRepository;
import com.corhuila.parcial2.IService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends ABaseService<Producto> implements IProductoService {

    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IProductoRepository repository;
}