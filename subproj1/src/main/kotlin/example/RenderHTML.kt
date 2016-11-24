package example

import html.html
import html.HTML
import html.extensionTest

fun String.firstLetter() = this.get(0);

fun main(args:Array<String>) {

    val myHtml = html {


        head {
            title { + "My Title" }
            meta(name = "author", content = "Paul")
        }

        body {
            h1 { + "This is my Header" }
            p { + "This is my Paragraph"}
            p {
                p { "This is a nested P"}
                + "This is another Paragraph"
                body { + "Well this is weird... 2 body tags?" }
            }
            a(href = "myLink.com") {
                + "This is my link"
            }
        }
    }

    print(myHtml)
    println("ExtensionTest".firstLetter())

    //Test scope of extension function: Will not compile
    /*val myOtherHTML = HTML();
    myOtherHTML.init();
    print(myOtherHTML)*/

    // Another scope test. Only works because function is imported.
    print(myHtml.extensionTest())

}