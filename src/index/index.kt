package index

import app.app
import kotlinx.css.*
import react.dom.render
import styled.StyledComponents
import styled.injectGlobal
import kotlin.browser.document

fun main() {
    val styles = CSSBuilder().apply {
        html {
            height = LinearDimension("100%")
            fontSize = 10.px
        }
        body {
            backgroundColor = Color.black
            margin = "0"
            padding = "0"
            fontFamily = "sans-serif"
            height = LinearDimension("100%")
        }
        media("(min-width: 400px) and (min-height: 400px)") {
            html {
                fontSize = 20.px
            }
        }
        media("(min-width: 500px) and (min-height: 500px)") {
            html {
                fontSize = 30.px
            }
        }
        media("(min-width: 600px) and (min-height: 600px)") {
            html {
                fontSize = 40.px
            }
        }
        media("(min-width: 800px) and (min-height: 800px)") {
            html {
                fontSize = 50.px
            }
        }
    }
    StyledComponents.injectGlobal(styles.toString().concat("#root{ height: 100%}"))
    render(document.getElementById("root")) {
        app()
    }
}
