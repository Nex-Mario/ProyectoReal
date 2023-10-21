/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.Usuario;
import java.util.List;
import persistencia.*; 
/**
 *
 * @author User
 */
public class LogicaUsuario {
    private IUsuario datos ; 

    public LogicaUsuario() {
        this.datos = new ListaUsuario();
    }
    
    public void registrarUsuario(Usuario t){
       this.datos.agregarUsuario(t);
    }
    
    public List<Usuario> consultarUsuario(){
        return this.datos.mostrarUsuarios();
    }
    
}
