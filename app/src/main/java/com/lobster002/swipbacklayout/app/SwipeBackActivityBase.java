package com.lobster002.swipbacklayout.app;

import com.lobster002.swipbacklayout.SwipeBackLayout;

public interface SwipeBackActivityBase {

    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    public abstract void scrollToFinishActivity();

}
