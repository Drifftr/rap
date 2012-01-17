/*******************************************************************************
 * Copyright (c) 2011, 2012 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 *******************************************************************************/
package org.eclipse.rwt.internal.protocol;

import java.util.Map;


/**
 * Instances of this interface are used to transfer changes to the remote object.
 *
 * @see ClientObjectFactory
 *
 * @since 1.5
 */
public interface IClientObject {

  /**
   * Advises the client to create the remote object with the given type.
   *
   * @param type the type of the remote object to be created
   */
  void create( String type );

  /**
   * Advises the remote object to set the specified property to the given value.
   *
   * @param name the name of the property to set
   * @param value the value to set
   */
  void setProperty( String name, int value );

  /**
   * Advises the remote object to set the specified property to the given value.
   *
   * @param name the name of the property to set
   * @param value the value to set
   */
  void setProperty( String name, double value );

  /**
   * Advises the remote object to set the specified property to the given value.
   *
   * @param name the name of the property to set
   * @param value the value to set
   */
  void setProperty( String name, boolean value );

  /**
   * Advises the remote object to set the specified property to the given value.
   *
   * @param name the name of the property to set
   * @param value the value to set
   */
  void setProperty( String name, String value );

  /**
   * Advises the remote object to set the specified property to the given value.
   *
   * @param name the name of the property to set
   * @param value the value to set
   */
  void setProperty( String name, Object value );

  /**
   * Advises the remote object to notify or not the server when an event of the given type occurs.
   *
   * @param eventType the name of event type to listen
   * @param listent true to notify the server when an event occurs, false otherwise
   */
  void setListen( String eventType, boolean listent );

  /**
   * Advises the client to call a specific method on the remote object.
   *
   * @param method the name of the method to call
   * @param properties the named properties to pass as arguments to the method call
   */
  void call( String method, Map<String, Object> properties );

  /**
   * Advises the client to destroy the remote object.
   */
  void destroy();

}
