# Indicator
Indicator is a diversified progressbar,it's modified simple base on MaterialProgressBar.

![](https://github.com/KernHu/Indicator/raw/master/screenshot/screenshot.gif)  

Thanks for https://github.com/DreaminginCodeZH/MaterialProgressBar

##  I:Add RahmenView to your project 

### Step 1. Add the JitPack repository to your build file; Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```	
### Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.KernHu:Indicator:1.1'
}
```	

## II: How to use Indicator.

### Add the Indicator to the layout.xml file where you want to display the list;


```  
<cn.walkpast.indicator.SmoothLimeIndicator
        android:id="@+id/google_indicator"
        style="@style/OrdinaryIndicator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:indeterminate="true"/>
        
```

```  
<cn.walkpast.indicator.CircularLimeIndicator
        android:id="@+id/circular_lime_indicator"
        android:layout_width="25pt"
        android:layout_height="25pt"
        android:layout_gravity="center"
        android:indeterminate="true"
        android:indeterminateOnly="false"
        android:visibility="visible"
        app:cli_colors="@array/gplus_colors"/>
        
```

## III: Contact me

Email: vsky580@gmail.com  
Facebook: https://www.facebook.com/kern.hu.580

QQ群：43447852

I'm kern....

If it helps you,please give me a star.如果有帮助到你，请给我一个小星星。

