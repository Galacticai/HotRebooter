## Running on: 
Android 10 - Samsung OneUI 2.5

### Comments:
- Nothing happens after a minute of the app being unresponsive...
- idk if it would crash after a long time
- navigation bar is also unresponsive
- can continue using the device by killing the app using Android Studio

## Logcat:
```
2024-01-26 19:20:26.783 10754-10754 ActivityThread          com.galacticai.hotrebooter           W  Application com.galacticai.hotrebooter is waiting for the debugger on port 8100...
2024-01-26 19:20:26.789 10754-10754 System.out              com.galacticai.hotrebooter           I  Sending WAIT chunk
2024-01-26 19:20:26.956   516-567   BufferQueueProducer     surfaceflinger                       E  [Waiting For Debugger: com.galacticai.hotrebooter#0] disconnect: not connected (req=1)
2024-01-26 19:20:26.990 10754-10754 System.out              com.galacticai.hotrebooter           I  Debugger has connected
2024-01-26 19:20:26.990 10754-10754 System.out              com.galacticai.hotrebooter           I  waiting for debugger to settle...
2024-01-26 19:20:27.191 10754-10754 System.out              com.galacticai.hotrebooter           I  waiting for debugger to settle...
2024-01-26 19:20:27.391 10754-10754 System.out              com.galacticai.hotrebooter           I  waiting for debugger to settle...
2024-01-26 19:20:27.792 10754-10754 chatty                  com.galacticai.hotrebooter           I  uid=12913(com.galacticai.hotrebooter) identical 2 lines
2024-01-26 19:20:27.993 10754-10754 System.out              com.galacticai.hotrebooter           I  waiting for debugger to settle...
2024-01-26 19:20:28.194 10754-10754 System.out              com.galacticai.hotrebooter           I  waiting for debugger to settle...
2024-01-26 19:20:28.395 10754-10754 System.out              com.galacticai.hotrebooter           I  debugger has settled (1346)
2024-01-26 19:20:28.404   516-712   BufferQueueProducer     surfaceflinger                       E  [Waiting For Debugger: com.galacticai.hotrebooter#0] disconnect: not connected (req=1)
2024-01-26 19:20:28.416   968-3785  InputDispatcher         system_server                        E  Window handle Window{a9d0f u0 Waiting For Debugger: com.galacticai.hotrebooter} has no registered input channel
2024-01-26 19:20:29.727 10754-13759 libEGL                  com.galacticai.hotrebooter           D  loaded /vendor/lib64/egl/libGLES_mali.so
2024-01-26 19:20:29.943 10754-10754 PhoneWindow             com.galacticai.hotrebooter           D  forceLight changed to true [] from com.android.internal.policy.PhoneWindow.updateForceLightNavigationBar:4274 com.android.internal.policy.DecorView.updateColorViews:1547 com.android.internal.policy.PhoneWindow.dispatchWindowAttributesChanged:3252 android.view.Window.setFlags:1153 com.android.internal.policy.PhoneWindow.generateLayout:2474
2024-01-26 19:20:29.950 10754-10754 MultiWindowDecorSupport com.galacticai.hotrebooter           I  [INFO] isPopOver = false
2024-01-26 19:20:29.951 10754-10754 MultiWindowDecorSupport com.galacticai.hotrebooter           I  updateCaptionType >> DecorView@210f51e[], isFloating: false, isApplication: true, hasWindowDecorCaption: false, hasWindowControllerCallback: true
2024-01-26 19:20:29.952 10754-10754 MultiWindowDecorSupport com.galacticai.hotrebooter           D  setCaptionType = 0, DecorView = DecorView@210f51e[]
2024-01-26 19:20:30.139 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  setView = com.android.internal.policy.DecorView@210f51e TM=true MM=false
2024-01-26 19:20:30.608 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Class androidx.compose.runtime.snapshots.SnapshotStateMap failed lock verification and will run slower.
2024-01-26 19:20:30.608 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Common causes for lock verification issues are non-optimized dex code
2024-01-26 19:20:30.608 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  and incorrect proguard optimizations.
2024-01-26 19:20:31.278 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Accessing hidden method Landroid/view/View;->getViewRootImpl()Landroid/view/ViewRootImpl; (greylist, reflection, allowed)
2024-01-26 19:20:31.279 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Accessing hidden field Landroid/view/View$AttachInfo;->mVisibleInsets:Landroid/graphics/Rect; (greylist, reflection, allowed)
2024-01-26 19:20:31.279 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Accessing hidden field Landroid/view/ViewRootImpl;->mAttachInfo:Landroid/view/View$AttachInfo; (greylist, reflection, allowed)
2024-01-26 19:20:31.376 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  Relayout returned: old=(0,0,1080,2220) new=(0,0,1080,2220) req=(1080,2220)0 dur=29 res=0x7 s={true 527976042496} ch=true
2024-01-26 19:20:31.401 10754-13756 mali_winsys             com.galacticai.hotrebooter           I  new_window_surface() [1080x2220] return: 0x3000
2024-01-26 19:20:32.978 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Accessing hidden method Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V (greylist-max-o, linking, denied)
2024-01-26 19:20:32.979 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Accessing hidden method Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V (greylist-max-o, linking, denied)
2024-01-26 19:20:34.030 10754-10754 cai.hotreboote          com.galacticai.hotrebooter           W  Class androidx.compose.runtime.snapshots.SnapshotStateList failed lock verification and will run slower.
2024-01-26 19:20:35.395 10754-13756 Gralloc3                com.galacticai.hotrebooter           W  mapper 3.x is not supported
2024-01-26 19:20:35.403 10754-13756 gralloc                 com.galacticai.hotrebooter           I  Arm Module v1.0
2024-01-26 19:20:35.453 10754-10754 Choreographer           com.galacticai.hotrebooter           I  Skipped 306 frames!  The application may be doing too much work on its main thread.
2024-01-26 19:20:36.926 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  MSG_WINDOW_FOCUS_CHANGED 1 1
2024-01-26 19:20:36.928 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  prepareNavigationBarInfo() DecorView@210f51e[MainActivity]
2024-01-26 19:20:36.928 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  getNavigationBarColor() -855310
2024-01-26 19:20:36.940 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  prepareNavigationBarInfo() DecorView@210f51e[MainActivity]
2024-01-26 19:20:36.940 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  getNavigationBarColor() -855310
2024-01-26 19:20:36.941 10754-10754 InputMethodManager      com.galacticai.hotrebooter           V  Starting input: tba=com.galacticai.hotrebooter ic=null mNaviBarColor -855310 mIsGetNaviBarColorSuccess true , NavVisible : true , NavTrans : false
2024-01-26 19:20:36.942 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  startInputInner - Id : 0
2024-01-26 19:20:36.942 10754-10754 InputMethodManager      com.galacticai.hotrebooter           I  startInputInner - mService.startInputOrWindowGainedFocus
2024-01-26 19:20:36.965 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  MSG_RESIZED_REPORT: frame=(0,0,1080,2220) ci=(0,63,0,39) vi=(0,63,0,39) or=1
2024-01-26 19:20:36.968 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  MSG_WINDOW_FOCUS_CHANGED 1 1
2024-01-26 19:20:36.977 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  stopped(true) old=false
2024-01-26 19:20:37.019 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  stopped(false) old=true
2024-01-26 19:20:37.024 10754-13907 ProfileInstaller        com.galacticai.hotrebooter           D  Installing profile for com.galacticai.hotrebooter
2024-01-26 19:20:37.033 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  stopped(false) old=false
2024-01-26 19:20:37.052 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  MSG_RESIZED_REPORT: frame=(0,0,1080,2220) ci=(0,63,0,39) vi=(0,63,0,39) or=1
2024-01-26 19:20:37.264 10754-13756 mali_egl                com.galacticai.hotrebooter           I  eglDestroySurface() in
2024-01-26 19:20:37.266 10754-13756 mali_winsys             com.galacticai.hotrebooter           I  delete_surface() [1080x2220] return
2024-01-26 19:20:37.266 10754-13756 mali_egl                com.galacticai.hotrebooter           I  eglDestroySurface() out
2024-01-26 19:20:37.266   516-567   BufferQueueProducer     surfaceflinger                       E  [com.galacticai.hotrebooter/com.galacticai.hotrebooter.MainActivity$_10754#0] disconnect: not connected (req=1)
2024-01-26 19:20:37.266 10754-13756 libEGL                  com.galacticai.hotrebooter           W  EGLNativeWindowType 0x7a5a827a50 disconnect failed
2024-01-26 19:20:37.305 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  Relayout returned: old=(0,0,1080,2220) new=(0,0,1080,2220) req=(1080,2220)0 dur=28 res=0x3 s={true 525435904000} ch=true
2024-01-26 19:20:37.307 10754-13756 mali_winsys             com.galacticai.hotrebooter           I  new_window_surface() [1080x2220] return: 0x3000
2024-01-26 19:20:37.442 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  MSG_WINDOW_FOCUS_CHANGED 1 1
2024-01-26 19:20:37.817 10754-10754 Choreographer           com.galacticai.hotrebooter           I  Skipped 44 frames!  The application may be doing too much work on its main thread.
2024-01-26 19:20:37.879 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  prepareNavigationBarInfo() DecorView@210f51e[MainActivity]
2024-01-26 19:20:37.879 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  getNavigationBarColor() -855310
2024-01-26 19:20:37.880 10754-10754 InputMethodManager      com.galacticai.hotrebooter           V  Starting input: tba=com.galacticai.hotrebooter ic=null mNaviBarColor -855310 mIsGetNaviBarColorSuccess true , NavVisible : true , NavTrans : false
2024-01-26 19:20:37.880 10754-10754 InputMethodManager      com.galacticai.hotrebooter           D  startInputInner - Id : 0
2024-01-26 19:20:48.134 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  ViewPostIme pointer 0
2024-01-26 19:20:48.628 10754-10754 ViewRootIm...nActivity] com.galacticai.hotrebooter           I  ViewPostIme pointer 1
```
