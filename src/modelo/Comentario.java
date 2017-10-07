package modelo;

import herramientas.Objeto;

/**
 *
 * @author Usaka Rokujou
 */
public class Comentario extends herramientas.Objeto {

    String mensaje;
    int idComentario, codPerfilComen, codImagenComen;

    /**
     * Contrusctor de la clase
     *
     * @param mensaje
     * @param idComentario
     * @param codPerfilComen
     * @param codImagenComen
     */
    public Comentario(String mensaje, int idComentario, int codPerfilComen, int codImagenComen) {
        this.mensaje = mensaje;
        this.idComentario = idComentario;
        this.codPerfilComen = codPerfilComen;
        this.codImagenComen = codImagenComen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getCodPerfilComen() {
        return codPerfilComen;
    }

    public void setCodPerfilComen(int codPerfilComen) {
        this.codPerfilComen = codPerfilComen;
    }

    public int getCodImagenComen() {
        return codImagenComen;
    }

    public void setCodImagenComen(int codImagenComen) {
        this.codImagenComen = codImagenComen;
    }

    @Override
    public Objeto clon() {
        return new Comentario(mensaje, idComentario, codPerfilComen, codImagenComen);
    }

    /**
     * Metodo que permite comprar dos comentarios
     *
     * @param obj
     * @return returna 0 si son iguales, 1 si obj es menor o -1 si obj es mayor
     */
    @Override
    public int igual(Objeto obj) {
        Comentario c = (Comentario) obj;
        if (idComentario > c.getIdComentario()) {
            return 1;
        } else if (idComentario < c.getCodImagenComen()) {
            return -1;
        }
        return 0;
    }
}
