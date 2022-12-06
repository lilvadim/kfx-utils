package ru.nucodelabs.kfx.core

import com.google.inject.Guice
import com.google.inject.Module
import javafx.application.Application

abstract class GuiceApplication(
    vararg modules: Module
) : Application() {
    protected val guiceInjector = Guice.createInjector(*modules)
    override fun init() {
        guiceInjector.injectMembers(this)
    }
}