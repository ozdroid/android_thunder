package com.xunlei.downloadprovider.frame.user;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import org.android.spdy.SpdyProtocol;

// compiled from: UserCenterFragment.java
final class bh implements AnimationListener {
    final /* synthetic */ UserCenterFragment a;

    bh(UserCenterFragment userCenterFragment) {
        this.a = userCenterFragment;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        UserCenterFragment.m(this.a).setVisibility(SpdyProtocol.PUBKEY_SEQ_ADASH);
        UserCenterFragment.n(this.a);
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
