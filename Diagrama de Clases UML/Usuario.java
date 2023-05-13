

/**
 * Class Usuario
 */
public class Usuario extends Persona {

  //
  // Fields
  //

  protected int id;
  private String nombreUsuario;
  private String clave;
  
  //
  // Constructors
  //
  public Usuario () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of nombreUsuario
   * @param newVar the new value of nombreUsuario
   */
  public void setNombreUsuario (String newVar) {
    nombreUsuario = newVar;
  }

  /**
   * Get the value of nombreUsuario
   * @return the value of nombreUsuario
   */
  public String getNombreUsuario () {
    return nombreUsuario;
  }

  /**
   * Set the value of clave
   * @param newVar the new value of clave
   */
  public void setClave (String newVar) {
    clave = newVar;
  }

  /**
   * Get the value of clave
   * @return the value of clave
   */
  public String getClave () {
    return clave;
  }

  //
  // Other methods
  //

  /**
   * @return       boolean
   */
  public boolean iniciarSesion()
  {
  }


  /**
   * @return       boolean
   */
  public boolean cerrarSesion()
  {
  }


  /**
   */
  public void asignarEducacion()
  {
  }


  /**
   */
  public void asignarExperiencia()
  {
  }


}
