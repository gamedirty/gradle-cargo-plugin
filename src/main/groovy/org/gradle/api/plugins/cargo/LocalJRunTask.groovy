/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.cargo

import org.gradle.api.plugins.cargo.property.LocalJRunTaskProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Optional

/**
 * Deploys WAR to local JRun container.
 *
 * @author Benjamin Muschko
 */
class LocalJRunTask extends LocalContainerTask {
    @InputDirectory @Optional File home

    @Override
    void setContainerSpecificProperties() {
        if(getHome()) {
            property(name: LocalJRunTaskProperty.HOME, value: getHome())
        }
    }
}
