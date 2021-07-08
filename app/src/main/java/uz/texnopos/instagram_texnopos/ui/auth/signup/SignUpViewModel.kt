package uz.texnopos.instagram_texnopos.ui.auth.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.texnopos.instagram_texnopos.data.FirebaseHelper
import uz.texnopos.instagram_texnopos.data.Resource

class SignUpViewModel(private val firebaseHelper: FirebaseHelper) : ViewModel() {
    private var mutableSignUpStatus: MutableLiveData<Resource<String?>> = MutableLiveData()
    val signUpStatus: LiveData<Resource<String?>>
        get() = mutableSignUpStatus

    fun signUp(email: String, password: String) {
        mutableSignUpStatus.value = Resource.loading()
        firebaseHelper.signUp(email, password,
            {
                mutableSignUpStatus.value = Resource.success(null)
            },
            {
                mutableSignUpStatus.value = Resource.error(it)
            })
    }
}