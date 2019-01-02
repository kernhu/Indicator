# Indicator
Indicator is a diversified progressbar,it's modified simple base on MaterialProgressBar.
```
Indicator 是一个多风格的进度指示器，它是基于gitbub上不错的开源作品MaterialProgressBar整理出来（算不上改动，我只是简单的修改了个别地方，为了更好的适应我的另一个项目，在我的另一个项目中，会把它应用到webview的加载进度条上。）
```
![](https://github.com/KernHu/Indicator/raw/master/screenshot/demo1.gif)  
```
声明：在此特别感谢MaterialProgressBar的作者。
```
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

