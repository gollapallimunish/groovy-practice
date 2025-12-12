/**
 * datatypes_and_dynamic.groovy
 *
 * Short tutorial + runnable examples demonstrating Groovy data types
 * and dynamic typing features. Run with:
 *    groovy datatypes_and_dynamic.groovy
 */

println "=== Groovy Data Types & Dynamic Typing Examples ===\n"

// 1) Dynamic vs static typing
def x = 10               // 'def' -> dynamic type (runtime)
println "x (def) = ${x} (class: ${x.getClass().name})"

int y = 20               // explicit static type (primitive/int boxed)
println "y (int) = ${y} (class: ${y.getClass().name})"

// we can reassign 'def' to a different type at runtime
x = 'now a String'
println "x reassigned = ${x} (class: ${x.getClass().name})"

// 2) Numbers: int, long, float, double, BigDecimal
def i = 100               // defaults to Integer
def l = 100L              // Long literal
def d = 3.14              // BigDecimal by default for Groovy decimal literals
def f = 2.5G              // 'G' forces BigDecimal; 'f' suffix would be float
println "i:${i} (${i.getClass().simpleName}), l:${l} (${l.getClass().simpleName}), d:${d} (${d.getClass().simpleName})"

// 3) Strings and GStrings
String s1 = 'single quoted'            // plain java.lang.String
String s2 = "double quoted with \${i} interpolation: ${i}"
def gString = "name=${s1}, number=${i}"
println s1
println s2
println gString

// 4) Collections: List, Map, Range
def list = [1, 2, 3, 'four']           // java.util.ArrayList
def map = [name: 'Groovy', version: 4]
def range = 1..5
println "list class: ${list.getClass().name}, contents: ${list}"
println "map: ${map}, range: ${range}, first..last: ${range.from}..${range.to}"

// 5) Closures (like lambdas)
def square = { n -> n * n }
println "square(5) = ${square(5)}"

// 6) Regular expressions
def matcher = ("abc123" =~ /\d+/)
println "regex find? ${matcher.find()} value: ${matcher[0]}"

// 7) null and safe navigation
def maybe = null
println "maybe?.toString() safe navigation -> ${maybe?.toString()}"

// 8) instanceof and as (coercion)
def num = 7
println "num instanceof Number: ${num instanceof Number}"
def coerced = '123' as Integer
println "'123' as Integer -> ${coerced} (class: ${coerced.getClass().name})"

// 9) Type declaration examples
def declaredList = new ArrayList<Integer>()
declaredList << 10
// declaredList << 'text'  // this would compile at runtime but may cause issues with generics
println "declaredList: ${declaredList} (class: ${declaredList.getClass().name})"

// 10) Example combining dynamic typing and method dispatch
class Demo {
    def speak() { 'I am dynamic' }
    String speak(String who) { "Hello, ${who}" }
}

def demo = new Demo()
println demo.speak()
println demo.speak('Groovy')

// 11) Summary prints
println "\n--- Summary ---"
println "Groovy supports dynamic typing via 'def' and optional static typing using type names."
println "Common types: Number (Integer, Long, BigDecimal), String (and GString), List, Map, Range, Closure."
println "Groovy makes runtime coercions easy ('as'), supports safe navigation (?.), and powerful literals."

println "\nExample complete."
