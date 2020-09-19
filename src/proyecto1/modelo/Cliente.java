package proyecto1.modelo;

/**
 *
 * @author USER
 */
public class Cliente {

    public Cliente(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }
    
    @Override
    public String toString(){
        return String.format("-> %s , %s , %s ", nombre, id, correo);
    }

    private final String nombre;
    private final String id;
    private final String correo;
}
