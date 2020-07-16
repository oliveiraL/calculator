package app

import component.buttonPanel
import component.display
import kotlinx.css.*
import react.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object AppStyle : StyleSheet("component-app", true) {
    val container by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        flexWrap = FlexWrap.wrap
        height = LinearDimension("100%")
    }
}

val App = functionalComponent<RProps> {

    val (next, setNext) = useState("")
    val (total, setTotal) = useState("")
    val (operation, setOperation) = useState("")

    fun updateState(next: String, total: String, operation: String) = run {
        setNext(next)
        setTotal(total)
        setOperation(operation)
    }

    styledDiv {
        css {
            +AppStyle.container
        }
        display("0")
        buttonPanel { name ->
            console.log(name)
        }
    }
}


fun RBuilder.app() = child(App) {}
