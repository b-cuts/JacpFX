/*
 * **********************************************************************
 *
 *  Copyright (C) 2010 - 2015
 *
 *  [NonUniqueComponentException.java]
 *  JACPFX Project (https://github.com/JacpFX/JacpFX/)
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language
 *  governing permissions and limitations under the License.
 *
 *
 * *********************************************************************
 */

package org.jacpfx.api.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: Andy Moncsek
 * Date: 09.09.13
 * Time: 21:05
 * This Exception will be thrown when component id's are not unique in classpath
 */
public class NonUniqueComponentException extends RuntimeException {

    public NonUniqueComponentException() {

    }

    public NonUniqueComponentException(String message) {
        super(message);
    }

    public NonUniqueComponentException(String message, Throwable e) {
        super(message, e);
    }

    public NonUniqueComponentException(Throwable e) {
        super(e);
    }
}
