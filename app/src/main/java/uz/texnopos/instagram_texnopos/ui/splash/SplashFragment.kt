package uz.texnopos.instagram_texnopos.ui.splash

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.texnopos.instagram_texnopos.R
import uz.texnopos.instagram_texnopos.data.Settings
import uz.texnopos.instagram_texnopos.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private lateinit var binding: FragmentSplashBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        requireActivity().actionBar?.hide()
        binding.lottieView.setMaxProgress(0.6f)
        val settings = Settings(requireContext())
        binding.lottieView.addAnimatorListener(object: Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                if (settings.signedIn) {

                } else {

                }
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }
        })
    }
}