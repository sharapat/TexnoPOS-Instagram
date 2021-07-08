package uz.texnopos.instagram_texnopos.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.android.ext.android.inject
import uz.texnopos.instagram_texnopos.R
import uz.texnopos.instagram_texnopos.data.Settings

class MainFragment : Fragment(R.layout.fragment_main) {
    private val settings: Settings by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settings.signedIn = true
    }
}