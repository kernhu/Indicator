package cn.walkpast.indicator.circular;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.UiThread;

import cn.walkpast.indicator.drawable.CircularLimeIndicatorDrawable;


public interface PBDelegate {

  @UiThread
  void draw(Canvas canvas, Paint paint);

  @UiThread
  void start();

  @UiThread
  void stop();

  @UiThread
  void progressiveStop(CircularLimeIndicatorDrawable.OnEndListener listener);
}
