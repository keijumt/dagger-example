package keijumt.dagger

import android.content.Context
import android.content.Intent
import keijumt.dagger.common.IntentResolver
import keijumt.dagger.feature1.Feature1Activity
import keijumt.dagger.feature2.Feature2Activity

class IntentResolverImpl : IntentResolver {
    override fun feature1(context: Context): Intent = Feature1Activity.createIntent(context)
    override fun feature2(context: Context): Intent = Feature2Activity.createIntent(context)
}