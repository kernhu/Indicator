# Indicator
Indicator is a diversified progressbar,it's modified simple base on MaterialProgressBar.

![](https://github.com/KernHu/Indicator/raw/master/screenshot/screenshot.gif)  

Thanks for https://github.com/DreaminginCodeZH/MaterialProgressBar

##  I: How to use Indicator.
### 1.Add the Indicator to the layout.xml file where you want to display the list;
```
      <cn.walkpast.rahmen.RahmenView
        android:id="@+id/rahmen_view_ad"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center"
        app:rhv_anim="true"
        app:rhv_backgroud="@drawable/bg_rahmen_2"
        app:rhv_duration="1000"
        app:rhv_image_height="@dimen/rhv_sp_height"
        app:rhv_image_rotation="-7"
        app:rhv_image_width="@dimen/rhv_sp_width"
        app:rhv_image_x="@dimen/rhv_sp_left"
        app:rhv_image_y="@dimen/rhv_sp_top"/>
		
		
    <!--    app:rhv_image="@drawable/sample_plot_3" -->
    <!--    app:rhv_backgroud="@drawable/bg_rahmen_2"-->
    <!--    app:rhv_foreground="@drawable/fg_rahmen_1" -->
```

### 2.use the event;
```
      mRahmenView.setOnRahmenListener(mOnRahmenListener);
      OnRahmenListener mOnRahmenListener = new OnRahmenListener() {
        @Override
    
        @Override
        public void onLongClick(View view) {
            super.onLongClick(view);
           
        }
	public void onClick(View view) {
            super.onClick(view);
         
        }
    };
```

### 3.You also can set ....;
```
  	mRahmenView.setRahmenImage();
        mRahmenView.getRahmenImageHeight(0.3f)//the percent of screen
        mRahmenView.setRahmenImageWidth(0.3f);
        mRahmenView.getRahmenImageY(0.3f)
        mRahmenView.setRahmenImageY(0.3f);
        mRahmenView.setRahmenImageRotation(-7);
        mRahmenView.setRahmenForeground();
        mRahmenView.setRahmenBackgroud();
	
	//load image
	 Glide.with(this)
                .load(url)
                .placeholder(R.drawable.sample_plot_1)
                .into(mRahmenView.getImageView());
		
	//add watermark
	mRahmenView.setWatermark(getResources().getDrawable(R.drawable.ad_lable), RahmenView.WatermarkLocate.BOTTOM_RIGHT, new int[]{30,30,30,30});
```

## II: Add RahmenView to your project

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
	         implementation 'com.github.KernHu:RahmenView:v1.4'
	}
```	
## III: Contact me

Email: vsky580@gmail.com  
Facebook: https://www.facebook.com/kern.hu.580

QQ群：43447852

I'm kern....

```
If it helps you,please give me a star.如果有帮助到你，请给我一个小星星。
```

