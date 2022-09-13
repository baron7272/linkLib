package com.linkLibrary.commons.extensions

import android.content.Context
import com.linkLibrary.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
