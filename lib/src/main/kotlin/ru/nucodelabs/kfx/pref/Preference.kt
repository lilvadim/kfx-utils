package ru.nucodelabs.kfx.pref

data class Preference<T>(val key: String, val def: T)