/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvh
 */
public class UsuarioTest {

    @Test
    public void crearUsuario() {
        /*
        *   1. Crear usuario con nombre juan email: jp@ejemplo.com clave 123
        *   2. Consultar el email del usuario creado
        *   3. Consultar el nombre del usuario creado
        *   4. Consultar la clave del usuario creado
        *   5. Si el email es jp@ejemplo.com y el nombre es juan y la clave es 123
         */
        Componente pruebaU = new Usuario();
        pruebaU.setNombre("juan");
        pruebaU.setCorreo("jp@ejemplo.com");
        pruebaU.setClave("123");

        String elNombre = pruebaU.getNombre();
        String elCorreo = pruebaU.getCorreo();
        String laClave = pruebaU.getClave();
        assertEquals(elNombre + elCorreo + laClave, "juanjp@ejemplo.com123");
    }

    @Test
    public void modificarnombreUsuario() {
        /*
        *   1. Crear usuario con nombre juan email: jp@ejemplo.com clave 123
        *   2. Consultar el email del usuario creado
        *   3. Consultar el nombre del usuario creado
        *   4. Consultar la clave del usuario creado
        *   5. Si el email es jp@ejemplo.com y el nombre es juan y la clave es 123
        *   6. Cambiar nombre de usuario de juan a julian
        *   7. Si el nombre es julian
         */
        Componente pruebaU = new Usuario();
        pruebaU.setNombre("juan");
        pruebaU.setCorreo("jp@ejemplo.com");
        pruebaU.setClave("123");

        String elNombre = pruebaU.getNombre();
        String elCorreo = pruebaU.getCorreo();
        String laClave = pruebaU.getClave();
        assertEquals(elNombre + elCorreo + laClave, "juanjp@ejemplo.com123");
        pruebaU.setNombre("julian");
        elNombre = pruebaU.getNombre();
        assertEquals(elNombre, "julian");
        
    }

    @Test
    public void modificarclaveUsuario() {
 /*
        *   1. Crear usuario con nombre juan email: jp@ejemplo.com clave 123
        *   2. Consultar el email del usuario creado
        *   3. Consultar el nombre del usuario creado
        *   4. Consultar la clave del usuario creado
        *   5. Si el email es jp@ejemplo.com y el nombre es juan y la clave es 123
        *   6. Cambiar clave de usuario de 123 a 1234
        *   7. Si el nombre es julian
         */
        Componente pruebaU = new Usuario();
        pruebaU.setNombre("juan");
        pruebaU.setCorreo("jp@ejemplo.com");
        pruebaU.setClave("123");

        String elNombre = pruebaU.getNombre();
        String elCorreo = pruebaU.getCorreo();
        String laClave = pruebaU.getClave();
        assertEquals(elNombre + elCorreo + laClave, "juanjp@ejemplo.com123");
        pruebaU.setClave("1234");
        laClave = pruebaU.getClave();
        assertEquals(laClave, "1234");
    }

    @Test
    public void modificaremailUsuario() {
 /*
        *   1. Crear usuario con nombre juan email: jp@ejemplo.com clave 123
        *   2. Consultar el email del usuario creado
        *   3. Consultar el nombre del usuario creado
        *   4. Consultar la clave del usuario creado
        *   5. Si el email es jp@ejemplo.com y el nombre es juan y la clave es 123
        *   6. Cambiar email de usuario de jp@ejemplo.com a jv@ejemplo.com
        *   7. Si el nombre es julian
         */
        Componente pruebaU = new Usuario();
        pruebaU.setNombre("juan");
        pruebaU.setCorreo("jp@ejemplo.com");
        pruebaU.setClave("123");

        String elNombre = pruebaU.getNombre();
        String elCorreo = pruebaU.getCorreo();
        String laClave = pruebaU.getClave();
        assertEquals(elNombre + elCorreo + laClave, "juanjp@ejemplo.com123");
        pruebaU.setCorreo("jv@ejemplo.com");
        elCorreo = pruebaU.getCorreo();
        assertEquals(elCorreo, "jv@ejemplo.com");
    }

}
