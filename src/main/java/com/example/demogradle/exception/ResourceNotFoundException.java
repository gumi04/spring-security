package com.example.demogradle.exception;

/**
 * The type Resource not found.
 */
public class ResourceNotFoundException extends RuntimeException {
  /**
   *
   */
  private static final long serialVersionUID = -6719930316508425091L;

  /**
   * Instantiates a new Resource not found.
   *
   * @param msg the msg
   */
  public ResourceNotFoundException(String msg) {
    super(msg);
  }

  /**
   * Instantiates a new Resource not found.
   *
   * @param detalle   the detalle
   * @param exception the exception
   */
  public ResourceNotFoundException(String detalle, Throwable exception) {
    super(detalle);
  }
}
