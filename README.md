# GBlurredView
#高斯模糊

![image](https://github.com/GuoZhiHao9396/GBlurredView/blob/master/app/src/main/res/raw/test.gif)

AndroidStudio使用Gradle构建添加依赖（推荐）

Add it in your root build.gradle at the end of repositories:
```java
      defaultConfig{
          //记得添加下面两个（renderscriptTargetApi、renderscriptSupportModeEnabled）
          renderscriptTargetApi 19
          renderscriptSupportModeEnabled true
      }

	  repositories {
            flatDir {
            dirs 'libs'
            }
         }

     dependencies {
            compile (name:'gblurredibrary-v1.0.0',ext:'aar')
     }
```


#属性介绍

```java
      showBlurredView：显示模糊图片
      enableBlurredView：启动显示模糊图片
      disableBlurredView：禁止显示模糊图片

      setBlurredImg：添加待模糊的图片
      setBlurredTop：设置图片上移的距离
      setBlurredScaleType：设置图片显示的样式
      setBlurredLevel：设置模糊程度（0~100 之间）
```

#使用介绍

1.配置布局

```xml
   <com.gzh.blurredibrary.BlurredView
           android:id="@+id/bv"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"/>
```

2.使用方法
```java
   //设置模糊图片和相对应的模式
   mBlurredView.setBlurredImg(getResources().getDrawable(R.drawable.ic_test));

   //设置模糊成都（0-100）
   mBlurredView.setBlurredLevel(progress);
```

3.设置SDK最低版本

```text
    minSdkVersion 13
```


#License
```text
Copyright 2017 ZhiHao Guo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
