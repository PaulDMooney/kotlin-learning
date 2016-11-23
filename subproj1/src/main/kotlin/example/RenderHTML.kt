package example

import html.html

fun main(args:Array<String>) {

    val myHtml = html {
        head {
            title { + "My Title" }
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
}