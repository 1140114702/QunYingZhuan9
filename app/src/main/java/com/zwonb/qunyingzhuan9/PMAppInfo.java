package com.zwonb.qunyingzhuan9;

import android.graphics.drawable.Drawable;

/**
 * Created by zyb on 2017/5/12.
 */

public class PMAppInfo {

    private String appLabel;
    private Drawable appIcon;
    private String pkgName;

    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }
}
