package com.github.midros.istheapp.di.component

import com.github.midros.istheapp.di.PerActivity
import com.github.midros.istheapp.di.module.ActivityModule
import com.github.midros.istheapp.di.module.FirebaseModule
import com.github.midros.istheapp.ui.activities.main.MainActivity
import com.github.midros.istheapp.ui.activities.register.RegisterActivity
import com.github.midros.istheapp.ui.activities.login.LoginActivity
import com.github.midros.istheapp.ui.fragments.calls.CallsFragment
import com.github.midros.istheapp.ui.fragments.photo.PhotoFragment
import com.github.midros.istheapp.ui.fragments.keylog.KeysFragment
import com.github.midros.istheapp.ui.fragments.maps.MapsFragment
import com.github.midros.istheapp.ui.fragments.message.MessageFragment
import com.github.midros.istheapp.ui.fragments.social.SocialFragment
import dagger.Component

/**
 * Created by luis rafael on 8/03/18.
 */
@PerActivity
@Component(modules = [FirebaseModule::class, ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainActivity: MainActivity)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)

}