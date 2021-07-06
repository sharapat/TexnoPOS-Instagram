package uz.texnopos.instagram_texnopos.ui.auth.signup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.texnopos.instagram_texnopos.R
import uz.texnopos.instagram_texnopos.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)
        binding.apply {
            var success = true
            btnSignUp.setOnClickListener {
                if (etEmail.text.isNullOrEmpty()) {
                    etEmail.error = getString(R.string.fill_the_field)
                    success = false
                }
                if (etPassword.text.isNullOrEmpty()) {
                    etPassword.error = getString(R.string.fill_the_field)
                    success = false
                }
                if (etConfirmPassword.text.isNullOrEmpty()) {
                    etConfirmPassword.error = getString(R.string.fill_the_field)
                    success = false
                }
                if (!success) return@setOnClickListener
                if (etConfirmPassword.text.toString() != etPassword.text.toString()) {
                    success = false
                    etConfirmPassword.error = getString(R.string.password_not_match)
                } else {

                }
            }
        }
    }
}