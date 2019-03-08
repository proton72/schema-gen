/*
 * Copyright (c) 2019 Outsource Cafe, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.javagen.schema.xml.node

class Appinfo extends Node
{
    static final String JAVAGEN_PREFIX = 'javagen:'
    static final String EXTENDS_DIRECTIVE = JAVAGEN_PREFIX+'extends'
    static final String IMPLEMENTS_DIRECTIVE = JAVAGEN_PREFIX+'implements'
    static final String ABSTACTION_DIRECTIVE = JAVAGEN_PREFIX+'abstraction'
    static final String TYPE_DIRECTIVE = JAVAGEN_PREFIX+'type'

    String text;

    /** given a key-value pair separated by an equals sign (javagen:type=String), return just the value. */
    String appinfoValue(String key) {
        text?.startsWith(key) ? text.replace("${key}=", '') : null
    }

}
