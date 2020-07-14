package index

import app.*
import kotlinext.js.*
import react.dom.*
import kotlin.browser.*

fun main() {
    render(document.getElementById("root")) {
        app()
    }
}
