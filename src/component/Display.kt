package component

import kotlinx.css.*
import react.RBuilder
import react.RProps
import react.dom.div
import react.functionalComponent
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DisplayStyle : StyleSheet("component-display", true) {
    val container by css {
        backgroundColor = Color("#858694")
        color = Color.white
        textAlign = TextAlign.right
        fontWeight = FontWeight("200")
        flexGrow = 0.0
        flexShrink = 0.0
        flexBasis = FlexBasis.auto
        width = LinearDimension("100%")
        div {
            fontSize = 2.5.rem
            padding = "0.2rem 0.7rem 0.1rem 0.5rem"
        }
    }
}

fun RBuilder.display(value: String) =
    styledDiv {
        css {
            +DisplayStyle.container
        }
        div {
            +value
        }
    }
