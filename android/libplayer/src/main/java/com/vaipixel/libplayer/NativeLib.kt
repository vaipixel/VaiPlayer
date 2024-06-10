package com.vaipixel.libplayer

class NativeLib {

    /**
     * A native method that is implemented by the 'libplayer' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'libplayer' library on application startup.
        init {
            System.loadLibrary("libplayer")
        }
    }
}