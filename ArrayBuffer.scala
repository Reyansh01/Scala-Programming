//ArrayBuffer in Scala

//ArrayBuffer are resizable i.e they can be of variable size while arrays are not resizable.
//In order to use ArrayBuffer we need to import one scala library (in command prompt)

import scala.collection.mutable.ArrayBuffer
var s1 = ArrayBuffer[String]()   // Here we have not given the size.

s1 += "apple"
s1 += "banana"
s1 += "guava"