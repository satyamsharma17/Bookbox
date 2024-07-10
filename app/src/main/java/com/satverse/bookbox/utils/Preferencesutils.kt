package com.satverse.bookbox.utils

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtil {
    private lateinit var prefs: SharedPreferences
    private const val PREFS_NAME = "bookbox_settings"

    // Preference keys
    const val APP_THEME_INT = "theme_settings"
    const val MATERIAL_YOU_BOOL = "material_you"
    const val INTERNAL_READER_BOOL = "internal_reader"
    const val READER_FONT_SIZE_INT = "reader_font_size"
    const val READER_FONT_STYLE_STR = "reader_font_style"

    fun initialize(context: Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun keyExists(key: String): Boolean {
        if (prefs.contains(key))
            return true
        return false
    }

    fun putString(key: String, value: String) {
        val prefsEditor = prefs.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }

    fun putInt(key: String, value: Int) {
        val prefsEditor = prefs.edit()
        prefsEditor.putInt(key, value)
        prefsEditor.apply()
    }

    fun putBoolean(key: String, value: Boolean) {
        val prefsEditor = prefs.edit()
        prefsEditor.putBoolean(key, value)
        prefsEditor.apply()
    }

    fun getString(key: String, value: String): String? {
        return prefs.getString(key, value)
    }

    fun getInt(key: String, value: Int): Int {
        return prefs.getInt(key, value)
    }

    fun getBoolean(key: String, value: Boolean): Boolean {
        return prefs.getBoolean(key, value)
    }
}