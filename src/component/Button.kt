package component

import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RProps
import react.child
import react.dom.button
import react.functionalComponent
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ButtonStyle : StyleSheet("component-button", true) {
    val container by css {
        display = Display.inlineFlex
        width = LinearDimension("25%")
        flexGrow = 1.0
        flexShrink = 0.0
        flexBasis = FlexBasis.auto
        button {
            border = "0"
            fontSize = 1.5.rem
            marginRight = 1.px
            flexGrow = 1.0
            flexShrink = 0.0
            flexBasis = FlexBasis.auto
            padding = "0"
        }
    }

    val wide by css {
        width = LinearDimension("50%")
    }

    val orange by css {
        button {
            backgroundColor = Color("#f5923e")
            color = Color.white
        }
    }

    val orangeNot by css {
        button {
            backgroundColor = Color("#e0e0e0")
        }
    }
}

interface ButtonProps : RProps {
    var orange: Boolean
    var wide: Boolean
    var name: String
    var clickHandler: (String) -> Unit
}

val ButtonComponent = functionalComponent<ButtonProps> { props ->
    fun handleClick(): Unit = props.clickHandler(props.name)
    styledDiv {
        css {
            +if (props.orange) ButtonStyle.orange else ButtonStyle.orangeNot
            if (props.wide) +ButtonStyle.wide
            +ButtonStyle.container
        }
        button {
            attrs {
                onClickFunction = {
                    handleClick()
                }

            }
            +props.name
        }
    }
}

fun RBuilder.button(name: String, orange: Boolean = false, wide: Boolean = false, clink: (String) -> Unit) =
        child(ButtonComponent) {
            attrs.name = name
            attrs.orange = orange
            attrs.wide = wide
            attrs.clickHandler = clink
        }
