package com.tienda;

import static org.junit.jupiter.api.Assertions.*;

class TiendaServicioTest {

    private TiendaServicio tiendaServicio;

    @BeforeEach
    void setUp() {
        tiendaServicio = new TiendaServicio();
    }

    @Nested
    @DisplayName("Pruebas para TiendaServicio")
    class TiendaServicioTests {

        @Test
        @DisplayName("Agregar producto exitosamente")
        void testAgregarProductoExitoso() {
            Producto esperado = new Producto("001", "Camiseta", 29.99);
            Producto resultado = tiendaServicio.agregarProducto("001", "Camiseta", 29.99);
            assertEquals(esperado.getCodigo(), resultado.getCodigo(), "Los códigos no coinciden");
            assertEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres no coinciden");
            assertEquals(esperado.getPrecio(), resultado.getPrecio(), 0.01, "Los precios no coinciden");
        }

        @Test
        @DisplayName("Obtener producto agregado")
        void testObtenerProductoAgregado() {
            Producto esperado = new Producto("002", "Pantalón", 49.99);
            tiendaServicio.agregarProducto("002", "Pantalón", 49.99);
            Producto resultado = tiendaServicio.obtenerProducto("002");
            assertEquals(esperado.getCodigo(), resultado.getCodigo(), "Los códigos no coinciden");
            assertEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres no coinciden");
            assertEquals(esperado.getPrecio(), resultado.getPrecio(), 0.01, "Los precios no coinciden");
        }

        @Test
        @DisplayName("Actualizar precio de producto")
        void testActualizarPrecioProducto() {
            Producto esperado = new Producto("003", "Vestido", 79.99);
            tiendaServicio.agregarProducto("003", "Vestido", 69.99);
            Producto resultado = tiendaServicio.actualizarPrecio("003", 79.99);
            assertEquals(esperado.getCodigo(), resultado.getCodigo(), "Los códigos no coinciden");
            assertEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres no coinciden");
            assertEquals(esperado.getPrecio(), resultado.getPrecio(), 0.01, "Los precios no coinciden");
        }

        @Test
        @DisplayName("Actualizar precio de producto inexistente")
        void testActualizarPrecioProductoInexistente() {
            assertThrows(IllegalArgumentException.class, () -> {
                tiendaServicio.actualizarPrecio("999", 99.99);
            });
        }
    }
