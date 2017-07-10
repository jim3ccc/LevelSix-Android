package com.jimdoesnotgym.ms076.androidsixpermissions;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

public class LevelSixPermissions implements ActivityCompat.OnRequestPermissionsResultCallback{

    private static final String TAG = "LevelSixPermissions";
    RequestPermissionCallback callback;

    public static void checkPermissions(Activity activity, int requestCode, String ... permissions){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && activity != null && permissions !=null){
            for(String permission: permissions){
                if(ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(activity, permissions, requestCode);
                }
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(this.callback != null){
            this.callback.onRequestPermissionsResult();
        }else {
            return;
        }
    }

    public interface RequestPermissionCallback{
        public void onRequestPermissionsResult();
    }

    public void setLevelSixPermissionsCallback(RequestPermissionCallback callback){
        this.callback = callback;
    }
}
