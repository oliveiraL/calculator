package app

import component.buttonPanel
import component.display
import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
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

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
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
}

fun RBuilder.app() = child(App::class) {}
