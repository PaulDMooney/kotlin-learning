package example

import org.apache.commons.math3.util.FastMath
import org.slf4j.LoggerFactory

fun main(args:Array<String>) {
    val logger = LoggerFactory.getLogger("test")
    logger.debug("This $logger is printed")
    println("test")
    println("This is PI ${FastMath.PI}")

}