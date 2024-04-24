# Alejandro120-Electiva-ii-1075320490


# Insertar datos (post) Categoria

{
  "state": true,
  "nombre": "Gaseosa",
  "descripcion": "Bedida",
  "codigo": "12"
}

# Actualizar datos con (put) Categoria

{
  "state": true,
  "nombre": "string",
  "descripcion": "Bebida azucarada",
  "codigo": "string"
}

# Insertar Datos (post) Producto

{
  "state": true,
  "nombre": "Postobon",
  "descripcion": "refrescante",
  "codigo": "13",
  "categoriaId": {
    "id": 1
  }
}

# Actualizar datos con (put) Producto

{
  "state": true,
  "nombre": "string",
  "descripcion": "agua con gas",
  "codigo": "string",
  "categoriaId": {
    "id": 1
  }
}

# Eliminar datos Delete se pone el numero del id esto aplica tanto para categoria como producto 
Nota debe eliminar primero en producto y luego categoria por que resulta que en producto llama
el id de categoria y por eso no podemos borrar categoria daria error
