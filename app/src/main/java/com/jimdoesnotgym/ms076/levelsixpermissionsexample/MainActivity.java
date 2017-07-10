package com.jimdoesnotgym.ms076.levelsixpermissionsexample;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jimdoesnotgym.ms076.androidsixpermissions.LevelSixPermissions;

public class MainActivity extends AppCompatActivity {

    private String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS,
                                    Manifest.permission.WRITE_CONTACTS,
                                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                    Manifest.permission.READ_SMS,
                                    Manifest.permission.CAMERA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LevelSixPermissions.checkPermissions(this, this, 1, PERMISSIONS);
    }
}
