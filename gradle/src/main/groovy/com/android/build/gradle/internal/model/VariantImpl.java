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

import com.android.build.gradle.model.Variant;
import com.android.builder.model.ProductFlavor;

import java.io.File;

/**
 * Implementation of Variant that is serializable.
 */
public class VariantImpl implements Variant {


    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public File getOutput() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getBuildType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ProductFlavor getMergedFlavor() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
