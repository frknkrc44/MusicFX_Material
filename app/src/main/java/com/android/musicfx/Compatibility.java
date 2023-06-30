/*
 * Copyright (C) 2011 The Android Open Source Project
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

package com.android.musicfx;

import android.app.Activity;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.audiofx.AudioEffect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class Compatibility {
    private final static String TAG = "MusicFXCompat";

    /**
     * This activity has an intent filter with the highest possible priority, so
     * it will always be chosen. It then looks up the correct control panel to
     * use and launches that.
     */
    public static class Redirector extends Activity {
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent i = new Intent(getIntent());
            i.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
            i.setComponent(new ComponentName(getPackageName(), ActivityMusic.class.getName()));
            startActivity(i);
            finish();
        }
    }
}
