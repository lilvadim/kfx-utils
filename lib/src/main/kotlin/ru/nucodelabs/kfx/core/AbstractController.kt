package ru.nucodelabs.kfx.core

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.stage.Stage
import java.net.URL
import java.util.*

/**
 * Controller which have to know how to get stage and also it runs fxScriptInit which can be defined in related FXML file
 * @param N type of root node
 */
abstract class AbstractController<N : Sceneable> : Initializable {

    @FXML
    private var fxScriptInit: Runnable = Runnable {}

    /**
     * Root node FXML-injected
     */
    @FXML
    protected lateinit var root: N

    /**
     * Current window
     */
    protected val stage: Stage?
        get() = root.scene?.window as Stage?


    override fun initialize(location: URL, resources: ResourceBundle) {
        fxScriptInit()
    }

    private fun fxScriptInit() = fxScriptInit.run()
}