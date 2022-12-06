package ru.nucodelabs.kfx.core

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.stage.Stage
import java.net.URL
import java.util.*

/**
 * Controller which have to know how to get stage and also it runs fxScriptInit which can be defined in related FXML file
 */
abstract class AbstractController : Initializable {
    protected abstract val stage: Stage?

    @FXML
    protected var fxScriptInit: Runnable = Runnable {}

    override fun initialize(location: URL, resources: ResourceBundle) {
        fxScriptInit()
    }

    protected fun fxScriptInit() = fxScriptInit.run()
}