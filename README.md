## DncWave
动态水波纹

## 效果
![](https://github.com/githubliruiyuan/DncWave/raw/master/gif/3.gif)  

原创作者：http://blog.csdn.net/tianjian4592/article/details/44222565

## FloatWidget
悬浮控件<br>
1.可拖动，依赖Activity，仅在应用层面，不需要权限；<br>
  WindowManager.LayoutParams.TYPE_APPLICATION <br>
2.自动进行左右停靠；<br>
  通过mWindowManager.updateViewLayout(view, wmParams);不断修改控件wmParams.x的值来实现。<br>
3.在Activity的onCreate方法中实例化FloatingManager，可在屏幕方向改变是自动重新实例化，同时修改属性值，则可保证横屏是效果一致。<br>

## 效果
![](https://github.com/githubliruiyuan/DncWave/raw/master/gif/res.gif)  




