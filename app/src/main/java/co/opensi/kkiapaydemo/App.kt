package co.opensi.kkiapaydemo

import android.app.Application
import co.opensi.kkiapay.uikit.Kkiapay
import co.opensi.kkiapay.uikit.SdkConfig

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Kkiapay.init(applicationContext, "YOUR-KKIAPAY-KEY", SdkConfig(themeColor = R.color.colorPrimary,
            imageResource = R.raw.armoiries)
        )

    }
}