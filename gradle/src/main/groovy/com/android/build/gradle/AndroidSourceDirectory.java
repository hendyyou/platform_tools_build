/*
 * Copyright (C) 2012 The Android Open Source Project
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

package com.android.build.gradle;

import org.gradle.tooling.model.SourceDirectory;

/**
 * An AndroidSourceDirectory represents a single directory input for an Android project.
 */
public interface AndroidSourceDirectory extends SourceDirectory {

    /**
     * A concise name for the source directory (typically used to identify it in a collection).
     */
    String getName();

    /**
     * Sets the location of the directory.
     *
     * @param srcPath The source directory. This is evaluated as for
     *                {@link org.gradle.api.Project#file(Object)}
     * @return the AndroidSourceDirectory object
     */
    AndroidSourceDirectory srcDir(Object srcPath);
}
