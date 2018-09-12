## Preferences Helper

An android library to remove the boilerplate code when dealing with Shared Preferences. It is easy to setup and get started with.

### Download
You can add the library to your project via gradle

Step 1: Add in your root build.gradle of your project
```
    allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
    }
```

Step 2: Add the dependency to your app gradle
```

    dependencies {
    	...
	implementation 'com.github.tirgei:preferences-helper:1.0.0'
	...
    }
   
```


### Usage
Initialise the PreferencesHelper instance. You can either initialise as the default shared preferences or as custom shared preferences:

```kotlin
    /**
     *  Initialise default shared preferences. Pass the context.
     */
    val prefs = PreferenceHelper.defaultPrefs(this)
    
    
    /**
     * Initialise custom shared preferences. Pass the context and the preferences name.
     */
    const val PREFERENCES = "CUSTOM_PREFERENCES"
     
    val customPrefs  = PreferenceHelper.customPrefs(this, PREFERENCES)

```

Make sure to import the setter and getter functions depending on which one you need
```kotlin
    import com.gelostech.sharedpreferences.PreferenceHelper.set
    import com.gelostech.sharedpreferences.PreferenceHelper.get
```

To set values, simply call the preferences instance with the key of the data, then pass the value to be stored.
To retrieve data, call the preferences instance and pass along the key of the data and the default value of the data.

```kotlin

    private fun example() {
        const val BOOLEAN_PREF = "boolean_pref"
        const val STRING_PREF = "string_pref"
        const val INT_PREF = "int_pref"
        const val LONG_PREF = "long_pref"
        const val FLOAT_PREF = "float_pref"
        
        
        /**
         *  Setting data
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
        val getString: String = prefs[STRING_PREF, ""]
        val getInt: Int = prefs[INT_PREF, -1]
        val getFloat: Float = prefs[FLOAT_PREF, 10f]
        val getBoolean: Boolean = prefs[BOOLEAN_PREF, true]
        val getLong: Long = prefs[LONG_PREF, 500L]
    }


``` 

### License
MIT License

Copyright (c) 2018 Vincent Tirgei

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
