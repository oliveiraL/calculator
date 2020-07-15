package component

import kotlinx.css.*
import react.RBuilder
import react.RProps
import react.child
import react.functionalComponent
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ButtonPanelStyle : StyleSheet("component-button-panel", true) {
    val container by css {
        backgroundColor = Color("#858694")
        display = Display.flex
        flexDirection = FlexDirection.row
        flexWrap = FlexWrap.wrap
        flexGrow = 1.0
        flexShrink = 0.0
        flexBasis = FlexBasis.auto
        div {
            marginBottom = 1.px
            flexGrow = 1.0
            flexShrink = 0.0
            flexBasis = FlexBasis.auto
            display = Display.flex
        }
    }
}

interface ButtonPanelProps : RProps {
    var clickHandler: (String) -> Unit
}

val ButtonPanelComponent = functionalComponent<ButtonPanelProps> { props ->
    fun handleClick(buttonName: String): Unit = console.log(buttonName)


    styledDiv {
        css {
            +ButtonPanelStyle.container
            div {
                button("AC") {
                    handleClick(it)
                }
                button("+/-") {
                    handleClick(it)
                }
                button("%") {
                    handleClick(it)
                }
                button("÷", orange = true) {
                    handleClick(it)
                }
            }
            div {
                button("7") {
                    handleClick(it)
                }
                button("8") {
                    handleClick(it)
                }
                button("9") {
                    handleClick(it)
                }
                button("x", orange = true) {
                    handleClick(it)
                }
            }
            div {
                button("4") {
                    handleClick(it)
                }
                button("5") {
                    handleClick(it)
                }
                button("6") {
                    handleClick(it)
                }
                button("-", orange = true) {
                    handleClick(it)
                }
            }
            div {
                button("1") {
                    handleClick(it)
                }
                button("2") {
                    handleClick(it)
                }
                button("3") {
                    handleClick(it)
                }
                button("+", orange = true) {
                    handleClick(it)
                }
            }
            div {
                button("0", wide = true) {
                    handleClick(it)
                }
                button(".") {
                    handleClick(it)
                }
                button("=", orange = true) {
                    handleClick(it)
                }
            }
        }
    }
}

fun RBuilder.buttonPanel(click: (String) -> Unit) = child(ButtonPanelComponent){
    attrs.clickHandler = click
}
