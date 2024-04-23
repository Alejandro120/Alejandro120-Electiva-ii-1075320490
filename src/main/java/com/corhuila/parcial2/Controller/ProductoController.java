package com.corhuila.parcial2.Controller;

import com.corhuila.parcial2.Entity.Producto;
import com.corhuila.parcial2.IService.IProductoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/producto")
public class ProductoController extends ABaseController<Producto, IProductoService> {
    public ProductoController(IProductoService service) {
        super(service, "Producto");
    }
}