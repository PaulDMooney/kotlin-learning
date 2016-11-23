package example

import html.html
import html.elements.*

fun String.firstLetter() = this.get(0);

fun main(args:Array<String>) {

    val myHtml = html {


        head {
            title { + "My Title" }
            //meta(name = "author", content = "Paul")
        }

        body {
            h1 { + "This is my Header" }
            p { + "This is my Paragraph"}
            p { + "This is another Paragraph"}
            a(href = "myLink.com") {
                + "This is my link"
            }
        }
    }

    print(myHtml)
    println("ExtensionTest".firstLetter())
}