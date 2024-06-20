package me.yricky.oh.abcd.isa.bean

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Isa(
    @SerialName("chapters")
    val chapters:List<Chapter> = emptyList(),
    @SerialName("min_version")
    val minVersion:String = "",
    @SerialName("version")
    val version:String = "",
    @SerialName(value = "api_version_map")
    val apiVersionMap:List<List<String>> = emptyList(),
    @SerialName("incompatible_version")
    val incompatibleVersion:List<String> = emptyList(),
    @SerialName("properties")
    val properties:List<TagDescription> = emptyList(),
    @SerialName("exceptions")
    val exceptions:List<TagDescription> = emptyList(),
    @SerialName("verification")
    val verification:List<TagDescription> = emptyList(),
    @SerialName("prefixes")
    val prefixes:List<InsPrefix> = emptyList(),
    @SerialName("groups")
    val groups:List<InsGroup> = emptyList()
)