/*
 * Copyright (C) 2022 The Android Open Source Project
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

package android.test.app;

import android.test.lib.TestUtils;
import androidx.test.filters.SmallTest;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@SmallTest
@RunWith(AndroidJUnit4.class)
public class VendorAppTest {
    @Test
    public void testLoadLibraries() {
        TestUtils.assertLinkerNamespaceError("foo.oem1");
        TestUtils.assertLinkerNamespaceError("bar.oem1");
        TestUtils.assertLinkerNamespaceError("foo.oem2");
        TestUtils.assertLinkerNamespaceError("bar.oem2");
        System.loadLibrary("foo.product1");
        System.loadLibrary("bar.product1");
    }
}
