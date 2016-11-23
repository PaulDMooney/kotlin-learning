package html

import html.elements.SingleTag
import html.elements.TagWithText



class HTML() : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)
}

class Head() : TagWithText("head") {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
    fun meta(name:String, content:String) {
        val meta = initTag(Meta())
        meta.nameAttr = name;
        meta.content = content;
    }
}

class Meta: SingleTag("meta") {
    public var nameAttr:String
        get() = attributes["name"]!!
        set(value) {
            attributes["name"] = value
        }

    public var content:String
        get() = attributes["content"]!!
        set(value) {
            attributes["content"] = value
        }
}

class Title() : TagWithText("title")

abstract class BodyTag(name: String) : TagWithText(name) {
    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)
    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
}

class Body() : BodyTag("body")
class B() : BodyTag("b")
class P() : BodyTag("p")
class H1() : BodyTag("h1")

class A() : BodyTag("a") {
    public var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

fun main(args:Array<String>) {
    val myhtml = html {
        head {
            title { + "Title"}
            meta(name = "meta", content="some content")
        }
        body {
            p {+ "P tag here"}
        }
    }

    print(myhtml)
}