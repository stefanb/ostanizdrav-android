package de.rki.coronawarnapp.environment

import de.rki.coronawarnapp.BuildConfig

// Can't be const because that prevents them from being mocked in tests
@Suppress("MayBeConstant")
object BuildConfigWrap {

    val ENVIRONMENT_JSONDATA = BuildConfig.ENVIRONMENT_JSONDATA
    val ENVIRONMENT_TYPE_DEFAULT = BuildConfig.ENVIRONMENT_TYPE_DEFAULT

    val VERSION_CODE: Long = BuildConfig.VERSION_CODE.toLong()

    val VERSION_MAJOR: Int = BuildConfig.VERSION_MAJOR
    val VERSION_MINOR: Int = BuildConfig.VERSION_MINOR
    val VERSION_PATCH: Int = BuildConfig.VERSION_PATCH
}
