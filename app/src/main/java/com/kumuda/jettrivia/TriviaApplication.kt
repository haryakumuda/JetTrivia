package com.kumuda.jettrivia

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp // Tambahkan android.manifest android:name dan uses-permission
class TriviaApplication: Application() {
}