/*
 * Copyright (c) 2014, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package test.javafx.scene;

import test.com.sun.javafx.test.PropertiesTestBase;
import java.util.ArrayList;
import java.util.Collection;
import javafx.scene.PointLight;
import javafx.scene.paint.Color;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public final class LightBase_properties_Test extends PropertiesTestBase {

    @Parameters
    public static Collection data() {
        ArrayList array = new ArrayList();

        // simple property tests
        PointLight testLight = createPointLight();

        array.add(config(testLight, "lightOn", true, false));
        array.add(config(testLight, "color", Color.WHITE, null));

        return array;
    }

    public LightBase_properties_Test(final Configuration configuration) {
        super(configuration);
    }

    private static PointLight createPointLight() {
        return new PointLight();
    }

}
