#language: es
Característica: Adicionar productos al carrito

  @AdiconarProductos
    Escenario: Adionar productos al carrito de forma exitosa
  Dado que el usuario esta en la pagina de falabella
    Cuando agrega productos al carrito
    Entonces valida que los productos sean los seleccionados