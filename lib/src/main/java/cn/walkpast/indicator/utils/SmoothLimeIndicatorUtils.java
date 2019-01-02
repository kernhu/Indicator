package cn.walkpast.indicator.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

import java.util.Locale;

import cn.walkpast.indicator.shape.ColorsShape;


public final class SmoothLimeIndicatorUtils {
  private SmoothLimeIndicatorUtils() {
  }

  public static Drawable generateDrawableWithColors(int[] colors, float strokeWidth) {
    if (colors == null || colors.length == 0) return null;

    return new ShapeDrawable(new ColorsShape(strokeWidth, colors));
  }

  public static void checkSpeed(float speed) {
    if (speed <= 0f)
      throw new IllegalArgumentException("Speed must be >= 0");
  }

  public static void checkColors(int[] colors) {
    if (colors == null || colors.length == 0)
      throw new IllegalArgumentException("You must provide at least 1 color");
  }

  static void checkAngle(int angle) {
    if (angle < 0 || angle > 360)
      throw new IllegalArgumentException(String.format(Locale.US, "Illegal angle %d: must be >=0 and <= 360", angle));
  }

  public static void checkPositiveOrZero(float number, String name) {
    if (number < 0)
      throw new IllegalArgumentException(String.format(Locale.US, "%s %d must be positive", name, number));
  }

  public static void checkPositive(int number, String name){
    if(number <= 0)
      throw new IllegalArgumentException(String.format(Locale.US, "%s must not be null", name));
  }

  public static void checkNotNull(Object o, String name) {
    if (o == null)
      throw new IllegalArgumentException(String.format(Locale.US, "%s must be not null", name));
  }
}
