package component

import kotlinx.css.*
import styled.StyleSheet

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
            width = LinearDimension("100%")
            marginBottom = 1.px
            flexGrow = 1.0
            flexShrink = 0.0
            flexBasis = FlexBasis.auto
            display = Display.flex
        }
    }
}
