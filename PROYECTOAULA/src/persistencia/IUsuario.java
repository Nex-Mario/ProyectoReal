/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface IUsuario {
    
    public void agregarUsuario(Usuario t);
    public ArrayList<Usuario> mostrarUsuarios();
    
}
