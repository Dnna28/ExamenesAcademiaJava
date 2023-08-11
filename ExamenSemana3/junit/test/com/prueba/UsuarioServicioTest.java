package com.prueba;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    @BeforeEach
    void setUp() {
        usuarioServicio = new UsuarioServicio();
    }

    @Nested
    @DisplayName("Pruebas para UsuarioServicio")
    class UsuarioServicioTests {

        @Test
        @DisplayName("Crear usuario exitosamente")
        void testCrearUsuarioExitoso() {
            UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
            UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Nombre");
            assertEquals(esperado, resultado, "El usuario creado no coincide con el esperado");
        }

        @Test
        @DisplayName("Crear usuario con nombre diferente")
        void testCrearUsuarioNombreDiferente() {
            UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
            UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "OtroNombre");
            assertNotEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres son diferentes");
            assertNotEquals(esperado, resultado);
        }


        @Test
        @DisplayName("Obtener usuario creado")
        void testObtenerUsuarioCreado() {
            UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
            usuarioServicio.crearUsuario(1L, "Nombre");
            UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
            assertEquals(esperado, resultado, "El usuario obtenido no coincide con el esperado");
        }

        @Test
        @DisplayName("Actualizar usuario existente")
        void testActualizarUsuarioExistente() {
            UsuarioDto esperado = new UsuarioDto(1L, "NuevoNombre");
            usuarioServicio.crearUsuario(1L, "Nombre");
            UsuarioDto resultado = usuarioServicio.actualizarUsuario(1L, "NuevoNombre");
            assertEquals(esperado, resultado, "El usuario actualizado no coincide con el esperado");
        }

        @Test
        @DisplayName("Actualizar usuario inexistente")
        void testActualizarUsuarioInexistente() {
            assertThrows(IllegalArgumentException.class, () -> {
                usuarioServicio.actualizarUsuario(999L, "NuevoNombre");
            });
        }
    }
}
