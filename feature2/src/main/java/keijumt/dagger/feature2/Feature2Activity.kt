package keijumt.dagger.feature2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Feature2Activity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context) = Intent(context, Feature2Activity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature2)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Feature2Fragment.newInstance())
                .commitNow()
        }
    }
}
