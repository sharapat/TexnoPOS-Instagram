package uz.texnopos.instagram_texnopos.di

import com.google.firebase.auth.FirebaseAuth
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.texnopos.instagram_texnopos.data.FirebaseHelper
import uz.texnopos.instagram_texnopos.data.Settings
import uz.texnopos.instagram_texnopos.ui.auth.signin.SignInViewModel
import uz.texnopos.instagram_texnopos.ui.auth.signup.SignUpViewModel

val dataModule = module {
    single { FirebaseAuth.getInstance() }
    single { FirebaseHelper(get()) }
    single { Settings(androidContext()) }
}

val viewModelModule = module {
    viewModel { SignUpViewModel(get()) }
    viewModel { SignInViewModel(get()) }
}