
import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  protected int id;
  protected String nombre;
  private Educacion new_attribute;
  private Experiencia new_attribute_1;
  private Experiencia new_attribute_2;
  private domicilio new_attribute_3;
  
  //
  // Constructors
  //
  public Persona () { };
  
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
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (Educacion newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public Educacion getNew_attribute () {
    return new_attribute;
  }

  /**
   * Set the value of new_attribute_1
   * @param newVar the new value of new_attribute_1
   */
  public void setNew_attribute_1 (Experiencia newVar) {
    new_attribute_1 = newVar;
  }

  /**
   * Get the value of new_attribute_1
   * @return the value of new_attribute_1
   */
  public Experiencia getNew_attribute_1 () {
    return new_attribute_1;
  }

  /**
   * Set the value of new_attribute_2
   * @param newVar the new value of new_attribute_2
   */
  public void setNew_attribute_2 (Experiencia newVar) {
    new_attribute_2 = newVar;
  }

  /**
   * Get the value of new_attribute_2
   * @return the value of new_attribute_2
   */
  public Experiencia getNew_attribute_2 () {
    return new_attribute_2;
  }

  /**
   * Set the value of new_attribute_3
   * @param newVar the new value of new_attribute_3
   */
  public void setNew_attribute_3 (domicilio newVar) {
    new_attribute_3 = newVar;
  }

  /**
   * Get the value of new_attribute_3
   * @return the value of new_attribute_3
   */
  public domicilio getNew_attribute_3 () {
    return new_attribute_3;
  }

  //
  // Other methods
  //

  /**
   * @return       Persona
   */
  public Persona Persona()
  {
  }


  /**
   * @return       Experiencia
   */
  public Experiencia tieneExperiencia()
  {
  }


  /**
   * @return       Usuario
   */
  public Usuario tieneUsuario()
  {
  }


  /**
   * @return       domicilio
   */
  public domicilio tieneDomicilio()
  {
  }


  /**
   * @return       Proyectos
   */
  public Proyectos tieneProyecto()
  {
  }


  /**
   * @return       Educacion
   */
  protected Educacion tieneEducacion()
  {
  }


}
