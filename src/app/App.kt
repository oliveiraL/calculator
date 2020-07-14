package app

import react.*
import react.dom.*


class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
