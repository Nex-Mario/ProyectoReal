/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class ListaUsuario implements IUsuario{
    private List<Usuario> listaUsuario;

    public ListaUsuario() {
        this.listaUsuario = new ArrayList();
    }

    @Override
    public void agregarUsuario(Usuario t) {
        this.listaUsuario.add(t);
    }

    @Override
    public ArrayList<Usuario> mostrarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList(this.listaUsuario);
        return lista;
    }

}
