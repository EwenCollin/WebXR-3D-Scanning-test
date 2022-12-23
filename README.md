# 3D Scanner using WebXR

Note : This attempt to make a 3D scanner using AR technology is a prototype and does not work as I would have expected.

Besides, as my phone does not support Google ARCore's Depth API, I used hit-test and anchors to get 3D data. Therefore, it does not benefit a whole depth buffer.

## Possible improvements

A better way to implement this would be to use both Depth and Depth-Accuracy buffer only available by the time for Android applications and not WebXR.