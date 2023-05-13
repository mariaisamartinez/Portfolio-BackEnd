
import java.util.*;


/**
 * Class Experiencia
 */
public class Experiencia {

  //
  // Fields
  //

  protected int id;
  private String cargo;
  private String empresa;
  private date fechaInicio;
  private date fechaFin;
  private boolean trabajoActual;
  private Persona new_attribute;
  private Tecnologias new_attribute_1;
  private Proyectos new_attribute_2;
  
  //
  // Constructors
  //
  public Experiencia () { };
  
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
   * Set the value of cargo
   * @param newVar the new value of cargo
   */
  public void setCargo (String newVar) {
    cargo = newVar;
  }

  /**
   * Get the value of cargo
   * @return the value of cargo
   */
  public String getCargo () {
    return cargo;
  }

  /**
   * Set the value of empresa
   * @param newVar the new value of empresa
   */
  public void setEmpresa (String newVar) {
    empresa = newVar;
  }

  /**
   * Get the value of empresa
   * @return the value of empresa
   */
  public String getEmpresa () {
    return empresa;
  }

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (date newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public date getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (date newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public date getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of trabajoActual
   * @param newVar the new value of trabajoActual
   */
  public void setTrabajoActual (boolean newVar) {
    trabajoActual = newVar;
  }

  /**
   * Get the value of trabajoActual
   * @return the value of trabajoActual
   */
  public boolean getTrabajoActual () {
    return trabajoActual;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (Persona newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public Persona getNew_attribute () {
    return new_attribute;
  }

  /**
   * Set the value of new_attribute_1
   * @param newVar the new value of new_attribute_1
   */
  public void setNew_attribute_1 (Tecnologias newVar) {
    new_attribute_1 = newVar;
  }

  /**
   * Get the value of new_attribute_1
   * @return the value of new_attribute_1
   */
  public Tecnologias getNew_attribute_1 () {
    return new_attribute_1;
  }

  /**
   * Set the value of new_attribute_2
   * @param newVar the new value of new_attribute_2
   */
  public void setNew_attribute_2 (Proyectos newVar) {
    new_attribute_2 = newVar;
  }

  /**
   * Get the value of new_attribute_2
   * @return the value of new_attribute_2
   */
  public Proyectos getNew_attribute_2 () {
    return new_attribute_2;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String modificarExperiencia()
  {
  }


}
