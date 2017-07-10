# LeveSix-Android
Allows easier request permissions on Android 6.0 and above

## Install
In project gradle file:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

In app gradle file:
```
dependencies {
    ...
    compile 'com.github.meeej:LevelSix-Android:v1.0.0'
}
```

## Usage

create a list of permissions you want
```
private String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS,
                                    Manifest.permission.WRITE_CONTACTS,
                                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                    Manifest.permission.READ_SMS,
                                    Manifest.permission.CAMERA};
```

then just call

```
LevelSixPermissions.checkPermissions(MainActivity.this, requestCode, PERMISSIONS);
```
