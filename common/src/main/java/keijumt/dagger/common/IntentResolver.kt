package keijumt.dagger.common

import android.content.Context
import android.content.Intent

interface IntentResolver {
    fun feature1(context: Context): Intent
    fun feature2(context: Context): Intent
}