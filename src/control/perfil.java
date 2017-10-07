/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author rodrigoescobarlopez
 */
public class perfil {
    
    private String nombrePerfil , identifiacionUsuario;
    private Imagen imagen;

    public perfil(String nombrePerfil, String identifiacionUsuario, Imagen imagen) {
        this.nombrePerfil = nombrePerfil;
        this.identifiacionUsuario = identifiacionUsuario;
        this.imagen = imagen;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getIdentifiacionUsuario() {
        return identifiacionUsuario;
    }

    public void setIdentifiacionUsuario(String identifiacionUsuario) {
        this.identifiacionUsuario = identifiacionUsuario;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "perfil{" + "nombrePerfil=" + nombrePerfil + ", identifiacionUsuario=" + identifiacionUsuario + ", imagen=" + imagen + '}';
    }
    
    
    
    
}
