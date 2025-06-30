package com.salud.peso;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    @Test
    public void testActualizarPeso() {
        Usuario usuario = new Usuario("Geraldine", 65.0);
        usuario.actualizarPeso(67.5);
        assertEquals(67.5, usuario.getPeso(), 0.01);
    }
}
