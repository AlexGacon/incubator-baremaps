/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.baremaps.geoparquet;

/**
 * Exception thrown when an error occurs during the processing of GeoParquet files.
 */
public class GeoParquetException extends RuntimeException {

  /**
   * Constructs a new GeoParquetException with the specified message.
   *
   * @param message the message
   */
  public GeoParquetException(String message) {
    super(message);
  }

  /**
   * Constructs a new GeoParquetException with the specified detail message and cause.
   *
   * @param message the message
   * @param cause the cause
   */
  public GeoParquetException(String message, Throwable cause) {
    super(message, cause);
  }
}
