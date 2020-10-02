/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jvh
 */
public class Conjunto implements Componente {

    ArrayList<Componente> usuarios;

    public Conjunto() {
        this.usuarios = new ArrayList<>();
    }

    public void crearUsuario(String nombre, String correo, String pass) {
        Componente usu = new Usuario();
        boolean comp = false;
        if (pass.length() >= 8) {
            for (char c : nombre.toCharArray()) {
                if (c < 'A' && c > 'Z') {
                    comp=true;
                    JOptionPane.showMessageDialog(null, "Caracter especial no aceptado");

                }
            }
            if (!comp) {
                usu.setNombre(nombre);
                usu.setClave(pass);
                usu.setCorreo(correo);
                usuarios.add(usu);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Contraseña minimo de 8 caracteres");
        }
    }
    public void eliminarUsuario(String correo,String password){
    
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCorreo(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getClave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClave(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
