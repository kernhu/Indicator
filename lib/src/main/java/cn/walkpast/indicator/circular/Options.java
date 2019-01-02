package cn.walkpast.indicator.circular;

import android.view.animation.Interpolator;

import cn.walkpast.indicator.drawable.CircularLimeIndicatorDrawable;

public class Options {

  //params
  final Interpolator angleInterpolator;
  final Interpolator sweepInterpolator;
  public final float borderWidth;
  public final int[] colors;
  final float sweepSpeed;
  final float rotationSpeed;
  final int minSweepAngle;
  final int maxSweepAngle;
  @CircularLimeIndicatorDrawable.Style
  public final int style;

  public Options(Interpolator angleInterpolator,
                 Interpolator sweepInterpolator,
                 float borderWidth,
                 int[] colors,
                 float sweepSpeed,
                 float rotationSpeed,
                 int minSweepAngle,
                 int maxSweepAngle,
                 @CircularLimeIndicatorDrawable.Style int style) {
    this.angleInterpolator = angleInterpolator;
    this.sweepInterpolator = sweepInterpolator;
    this.borderWidth = borderWidth;
    this.colors = colors;
    this.sweepSpeed = sweepSpeed;
    this.rotationSpeed = rotationSpeed;
    this.minSweepAngle = minSweepAngle;
    this.maxSweepAngle = maxSweepAngle;
    this.style = style;
  }


}
