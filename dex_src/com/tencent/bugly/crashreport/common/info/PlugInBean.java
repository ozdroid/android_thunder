package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

// compiled from: BUGLY
public class PlugInBean implements Parcelable {
    public static final Creator<PlugInBean> CREATOR;
    public final String a;
    public final String b;
    public final String c;

    public PlugInBean(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String toString() {
        return new StringBuilder("plid:").append(this.a).append(" plV:").append(this.b).append(" plUUID:").append(this.c).toString();
    }

    public PlugInBean(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    static {
        CREATOR = new Creator<PlugInBean>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new PlugInBean(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new PlugInBean[i];
            }
        };
    }
}
