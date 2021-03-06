package nyc.friendlyrobot.dagger

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import nyc.friendlyrobot.dagger.di.app.DaggerAppComponent

class MyDaggerApplication : DaggerApplication() {
    override fun applicationInjector(): @JvmSuppressWildcards AndroidInjector<out DaggerApplication> =
             DaggerAppComponent.builder().create(this)
}