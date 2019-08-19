package com.mauriciogarcia.seccionframentos.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mauriciogarcia.seccionframentos.BatmanFragment
import com.mauriciogarcia.seccionframentos.R
import com.mauriciogarcia.seccionframentos.flashFragment
import com.mauriciogarcia.seccionframentos.supermanFragment

private val TAB_TITLES = arrayOf(
    R.string.superman,
    R.string.batman,
    R.string.flash
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position){
            0-> return supermanFragment()
            1-> return BatmanFragment()
            else -> return flashFragment()
        }


    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}