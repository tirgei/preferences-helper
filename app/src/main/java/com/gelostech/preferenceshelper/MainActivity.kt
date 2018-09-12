package com.gelostech.preferenceshelper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gelostech.sharedpreferences.PreferenceHelper
import com.gelostech.sharedpreferences.PreferenceHelper.set
import com.gelostech.sharedpreferences.PreferenceHelper.get

class MainActivity : AppCompatActivity() {

    companion object {
        const val PREFERENCES = "CUSTOM_PREFERENCES"

        const val BOOLEAN_PREF = "boolean_pref"
        const val STRING_PREF = "string_pref"
        const val INT_PREF = "int_pref"
        const val LONG_PREF = "long_pref"
        const val FLOAT_PREF = "float_pref"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         *  Initialise default shared preferences
         */
        val prefs = PreferenceHelper.defaultPrefs(this)

        /**
         * initialise custom shared preferences
         */
        val customPrefs  = PreferenceHelper.customPrefs(this, PREFERENCES)


        /**
         *  Settings data
         */
        prefs[BOOLEAN_PREF] = false
        prefs[STRING_PREF] = "Some random string"
        prefs[INT_PREF] = 123
        prefs[FLOAT_PREF] = 12f
        prefs[LONG_PREF] = 1000L

        /**
         *  Retrieving data
         *  Pass the key and the default value
         */
        val getString = prefs[STRING_PREF, ""]
        val getInt = prefs[INT_PREF, -1]
        val getFloat = prefs[FLOAT_PREF, 10f]
        val getBoolean = prefs[BOOLEAN_PREF, true]
        val getLong = prefs[LONG_PREF, 500L]
    }
}
