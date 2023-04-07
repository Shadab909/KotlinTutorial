package classes

import java.util.*

//this enum class is used in Object class object package

enum class EntityType {
    HELP,EASY,MEDIUM,HARD ;

    fun getFormattedName() = name.lowercase(Locale.getDefault())
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}