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

package com.android.builder;

import java.io.File;
import java.util.List;

/**
 * Represents a dependency on a Library Project.
 */
public interface AndroidDependency extends ManifestDependency, SymbolFileProvider {

    /**
     * Returns the location of the unarchived bundle.
     */
    File getFolder();

    /**
     * Returns the direct dependency of this dependency.
     */
    List<AndroidDependency> getDependencies();

    /**
     * Returns the location of the jar file to use for packaging.
     * Cannot be null.
     */
    File getJarFile();

    /**
     * Returns the location of the res folder.
     */
    File getResFolder();

    /**
     * Returns the location of the assets folder.
     */
    File getAssetsFolder();

    /**
     * Returns the location of the jni libraries folder.
     */
    File getJniFolder();

    /**
     * Returns the location of the aidl import folder.
     */
    File getAidlFolder();

    /**
     * Returns the location of the renderscript import folder.
     */
    File getRenderscriptFolder();

    /**
     * Returns the location of the proguard files.
     */
    File getProguardRules();

    /**
     * Returns the location of the lint jar.
     */
    File getLintJar();
}
