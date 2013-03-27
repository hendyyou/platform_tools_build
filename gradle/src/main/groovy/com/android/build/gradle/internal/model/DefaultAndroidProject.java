/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.build.gradle.internal.model;

import com.android.annotations.NonNull;
import com.android.build.gradle.model.AndroidProject;
import com.android.build.gradle.model.BuildTypeContainer;
import com.android.build.gradle.model.ProductFlavorContainer;
import com.android.build.gradle.model.Variant;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * Implementation of the AndroidProject model object.
 */
public class DefaultAndroidProject implements AndroidProject, Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;
    private final boolean isLibrary;

    private final Map<String, BuildTypeContainer> buildTypes = Maps.newHashMap();
    private final Map<String, Variant> variants = Maps.newHashMap();

    private ProductFlavorContainer defaultConfig;

    DefaultAndroidProject(@NonNull String name, boolean isLibrary) {
        this.name = name;
        this.isLibrary = isLibrary;
    }

    DefaultAndroidProject setDefaultConfig(ProductFlavorContainer defaultConfigContainer) {
        defaultConfig = defaultConfigContainer;
        return this;
    }

    DefaultAndroidProject addBuildType(BuildTypeContainer buildTypeContainer) {
        buildTypes.put(buildTypeContainer.getBuildType().getName(), buildTypeContainer);
        return this;
    }

    @Override
    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    @Override
    public ProductFlavorContainer getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    @NonNull
    public Map<String, BuildTypeContainer> getBuildTypes() {
        return buildTypes;
    }

    @Override
    @NonNull
    public Map<String, Variant> getVariants() {
        return variants;
    }

    @Override
    public boolean isLibrary() {
        return isLibrary;
    }
}
