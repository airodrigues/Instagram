/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Habilite armazenamento local.
    //Parse.enableLocalDatastore(this);

    // Codigo de configuração do App
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("7zTV2ndvpTz8mfyyfOuZe8zMiuWnjNSKI39bAQCT")
            .clientKey("aY85666kPoUonlPqkfWH3lH4kpG4JBk3ad9KPKqr")
            .server("https://parseapi.back4app.com/")
    .build()
    );

      //ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    defaultACL.setPublicReadAccess(true);
    //ParseACL.setDefaultACL(defaultACL, true);
  }
}
