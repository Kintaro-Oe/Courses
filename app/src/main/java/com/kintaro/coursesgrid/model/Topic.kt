package com.kintaro.coursesgrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val subjectID: Int,
    val courseCount: Int,
    @DrawableRes val imageId: Int,
)
