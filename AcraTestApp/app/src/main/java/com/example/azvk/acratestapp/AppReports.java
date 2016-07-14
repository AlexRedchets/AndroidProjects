package com.example.azvk.acratestapp;

import android.app.Application;
import android.content.Context;
import org.acra.*;
import org.acra.annotation.*;
import org.acra.sender.HttpSender;

@ReportsCrashes(
        httpMethod = HttpSender.Method.PUT,
        reportType = HttpSender.Type.JSON,
        formUri = "http://server_url/acra-test-app/_design/acra-storage/_update/report",
        formUriBasicAuthLogin = "login",
        formUriBasicAuthPassword = "password")
public class AppReports extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}