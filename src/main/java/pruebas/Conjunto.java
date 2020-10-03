/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

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

    public boolean crearUsuario(String nombre, String correo, String pass) {
        if (pass.length() <= 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            return false;
        } else {
            for (char z : pass.toCharArray()) {
                if (z < 48 || z > 122) {
                    System.out.println("La contraseña contiene caracteres especiales, \nEsto no es admitido en el sistema.");
                    return false;
                }
            }
        }
        if(!(correo.contains("@") && correo.contains("."))){
            System.out.println("La estructura del correo electronico es incorrecta");
            return false;
        }

        for (Componente c : this.usuarios) {
            if (c.getCorreo().equals(correo)) {
                System.out.println("El correo ingresado ya se encuentra registrado.");
                return false;
            }
        }

        Componente usu = new Usuario();
        usu.setNombre(nombre);
        usu.setCorreo(correo);
        usu.setClave(pass);
        this.usuarios.add(usu);
        return true;
    }

    public ArrayList<Componente> getList() {
        return usuarios;
    }

    public Componente getUsuario(String correo) {
        for(Componente c: usuarios){
            if(c.getCorreo().equals(correo)){
                return c;
            }
        }
        return null;
    }

    public boolean actualizarUsuario(String nombre, String correo, String pass, String oldPass) {
        int i = 0;
        if(!(correo.contains("@") && correo.contains("."))){
            System.out.println("La estructura del correo electronico es incorrecta");
            return false;
        }
        for (Componente c : usuarios) {
            if (c.getCorreo().equals(correo)) {
                if (oldPass.equals(c.getClave())) {
                    c.setNombre(nombre);
                    c.setCorreo(correo);
                    c.setClave(pass);
                    usuarios.set(i, c);
                    System.out.println("Actualizacion con exito.");
                    return true;
                } else {
                    System.out.println("Contraseña actual incorrecta");
                    return false;
                }
            }
            i++;
        }
        System.out.println("No se encuentra el usuario con el correo: " + correo);
        return false;
    }

    public boolean eliminarUsuario(String correo, String pass) {
        if(!(correo.contains("@") && correo.contains("."))){
            System.out.println("La estructura del correo electronico es incorrecta");
            return false;
        }
        for (Componente c : usuarios) {
            if (c.getCorreo().equals(correo)) {
                if (c.getClave().equals(pass)) {
                    usuarios.remove(c);
                    System.out.println("Eliminado con exito.");
                    return true;
                } else {
                    System.out.println("La contraseña es incorrecta.");
                    return false;
                }
            }
        }
        System.out.println("No se encuentra el usuario con el correo: " + correo);
        return false;
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
