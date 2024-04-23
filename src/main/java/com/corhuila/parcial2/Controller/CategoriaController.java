package com.corhuila.parcial2.Controller;

import com.corhuila.parcial2.Entity.Categoria;
import com.corhuila.parcial2.IService.ICategoriaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController extends ABaseController<Categoria, ICategoriaService> {
    public CategoriaController(ICategoriaService service) {
        super(service, "Categoria");
    }
}