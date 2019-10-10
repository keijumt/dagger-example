package keijumt.dagger.feature1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Feature1Activity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context) = Intent(context, Feature1Activity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Feature1Fragment.newInstance())
                .commitNow()
        }
    }
}
