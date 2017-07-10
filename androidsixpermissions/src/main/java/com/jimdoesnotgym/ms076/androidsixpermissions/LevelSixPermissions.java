package com.jimdoesnotgym.ms076.androidsixpermissions;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

public class LevelSixPermissions{

    private static final String TAG = "LevelSixPermissions";

    public static void checkPermissions(Activity activity, int requestCode, String ... permissions){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && activity != null && permissions !=null){
            for(String permission: permissions){
                if(ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(activity, permissions, requestCode);
                }
            }
        }
    }
}
