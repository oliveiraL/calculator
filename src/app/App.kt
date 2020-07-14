package app

import component.button
import react.*
import react.dom.*


class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h2 {
                +"Welcome to React with Kotlin"
            }
            button("-", true, true) {
                console.log("oi")
            }
            button("+", false, true) {
                console.log("oi")
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
