package com.example.roomsiswabaru.ui.halaman

import com.example.roomsiswabaru.R
import com.example.roomsiswabaru.navigasi.DestinasiNavigasi

object ItemEditDestination : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
