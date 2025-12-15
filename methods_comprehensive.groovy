/**
 * methods_comprehensive.groovy
 *
 * Comprehensive tutorial on Groovy methods from beginner to professional level.
 * Covers method definition, parameters, return values, closures, defaults,
 * optional/variable arguments, and real-world patterns.
 * Run with:
 *    groovy methods_comprehensive.groovy
 */

println "=== GROOVY METHODS COMPREHENSIVE TUTORIAL ===\n"

// ============================================================
// PART 1: METHOD BASICS
// ============================================================
println "--- PART 1: METHOD BASICS ---\n"

// 1.1) Simple method with no parameters
println "1.1) Simple method (no parameters):"
def greet() {
    return "Hello, Groovy!"
}
println greet()

// 1.2) Method with explicit return type
println "\n1.2) Method with explicit return type:"
String sayGoodbye() {
    "Goodbye!"  // implicit return
}
println sayGoodbye()

// 1.3) Method with one parameter
println "\n1.3) Method with one parameter:"
def add(int a, int b) {
    a + b
}
println "5 + 3 = ${add(5, 3)}"

// 1.4) Method with multiple parameters
println "\n1.4) Method with multiple parameters:"
def greetPerson(String name, int age) {
    "Hello ${name}, you are ${age} years old"
}
println greetPerson("Alice", 25)

// 1.5) Method with type declarations
println "\n1.5) Method with strict type declarations:"
int multiply(int x, int y) {
    x * y
}
println "4 * 7 = ${multiply(4, 7)}"

// 1.6) Method returning void
println "\n1.6) Method returning void:"
void printMessage(String msg) {
    println "Message: ${msg}"
}
printMessage("This is a void method")

// ============================================================
// PART 2: PARAMETERS & ARGUMENTS
// ============================================================
println "\n\n--- PART 2: PARAMETERS & ARGUMENTS ---\n"

// 2.1) Default parameters
println "2.1) Default parameters:"
def introduce(String name = "Guest", String title = "User") {
    "Welcome ${title} ${name}!"
}
println introduce()
println introduce("Bob")
println introduce("Charlie", "Admin")

// 2.2) Named parameters
println "\n2.2) Named parameters (using map):"
def createUser(Map params) {
    "User: name=${params.name}, email=${params.email}, active=${params.active ?: false}"
}
println createUser(name: "Diana", email: "diana@example.com")
println createUser(name: "Eve", email: "eve@example.com", active: true)

// 2.3) Variable arguments (varargs)
println "\n2.3) Variable arguments (varargs):"
def sum(int... numbers) {
    numbers.inject(0) { acc, n -> acc + n }
}
println "sum(1, 2, 3) = ${sum(1, 2, 3)}"
println "sum(10, 20, 30, 40) = ${sum(10, 20, 30, 40)}"

// 2.4) Mixing parameters and varargs
println "\n2.4) Mix regular and variable arguments:"
def printNames(String prefix, String... names) {
    "Prefix: ${prefix}, Names: ${names.join(', ')}"
}
println printNames("Friends:", "Alice", "Bob", "Charlie")

// 2.5) Using closure as parameter
println "\n2.5) Closure as parameter:"
def executeAction(Closure action) {
    "Executing action..."
    action()
}
def myAction = {
    println "Action executed!"
}
executeAction(myAction)

// 2.6) Inline closure parameter
println "\n2.6) Inline closure parameter:"
def apply(int value, Closure transformer) {
    transformer(value)
}
def result = apply(5) { n -> n * n }
println "5 squared = ${result}"

// ============================================================
// PART 3: RETURN VALUES
// ============================================================
println "\n\n--- PART 3: RETURN VALUES ---\n"

// 3.1) Implicit return
println "3.1) Implicit return (last expression):"
def calculateArea(int radius) {
    3.14159 * radius * radius
}
println "Area of circle (r=5): ${calculateArea(5).round(2)}"

// 3.2) Explicit return
println "\n3.2) Explicit return:"
def findMax(int a, int b) {
    if (a > b) {
        return a
    }
    return b
}
println "Max of 10 and 20: ${findMax(10, 20)}"

// 3.3) Returning multiple values (list)
println "\n3.3) Return multiple values (list):"
def getCoordinates() {
    [10, 20, 30]  // returns list
}
def coords = getCoordinates()
println "Coordinates: x=${coords[0]}, y=${coords[1]}, z=${coords[2]}"

// 3.4) Returning multiple values (map)
println "\n3.4) Return multiple values (map):"
def getUserInfo() {
    [name: "Frank", age: 35, email: "frank@example.com"]
}
def user = getUserInfo()
println "User: ${user.name}, Age: ${user.age}, Email: ${user.email}"

// 3.5) Returning nothing (null)
println "\n3.5) Method returning null:"
def maybeNull(boolean returnValue) {
    if (returnValue) {
        "Got a value"
    }
    // implicit null if condition is false
}
println "With true: ${maybeNull(true)}"
println "With false: ${maybeNull(false)}"

// 3.6) Early return with guard clause
println "\n3.6) Guard clause (early return):"
def validateEmail(String email) {
    if (!email) return "Email is required"
    if (!email.contains("@")) return "Invalid email format"
    "Email is valid"
}
println validateEmail("")
println validateEmail("notanemail")
println validateEmail("user@example.com")

// ============================================================
// PART 4: METHOD OVERLOADING
// ============================================================
println "\n\n--- PART 4: METHOD OVERLOADING ---\n"

// 4.1) Same method name, different parameter types
println "4.1) Overloading with different types:"
def display(String msg) {
    "String: ${msg}"
}
def display(int num) {
    "Integer: ${num}"
}
def display(List items) {
    "List: ${items.join(', ')}"
}
println display("Hello")
println display(42)
println display([1, 2, 3])

// 4.2) Overloading with different parameter count
println "\n4.2) Overloading with different parameter count:"
def calc(int a) {
    a * 2
}
def calc(int a, int b) {
    a + b
}
def calc(int a, int b, int c) {
    a + b + c
}
println "calc(5) = ${calc(5)}"
println "calc(5, 3) = ${calc(5, 3)}"
println "calc(5, 3, 2) = ${calc(5, 3, 2)}"

// ============================================================
// PART 5: OPTIONAL PARAMETERS & DEFAULTS
// ============================================================
println "\n\n--- PART 5: OPTIONAL & DEFAULT PARAMETERS ---\n"

// 5.1) Single default parameter
println "5.1) Single default parameter:"
def greetWithDefault(String name = "World") {
    "Hello, ${name}!"
}
println greetWithDefault()
println greetWithDefault("Groovy")

// 5.2) Multiple default parameters
println "\n5.2) Multiple default parameters:"
def configServer(String host = "localhost", int port = 8080, String protocol = "http") {
    "${protocol}://${host}:${port}"
}
println configServer()
println configServer("example.com")
println configServer("example.com", 443)
println configServer("example.com", 443, "https")

// 5.3) Using null to trigger default
println "\n5.3) Optional parameters with nulls:"
def describe(String name, String description = "No description") {
    name ? "${name}: ${description}" : "Unknown"
}
println describe("Item1", "A useful item")
println describe("Item2")
println describe(null)

// ============================================================
// PART 6: CLOSURES & HIGHER-ORDER FUNCTIONS
// ============================================================
println "\n\n--- PART 6: CLOSURES & HIGHER-ORDER FUNCTIONS ---\n"

// 6.1) Method accepting closure
println "6.1) Method accepting closure:"
def process(Closure block) {
    "Processing..."
    block.call()
}
process {
    println "Block executed!"
}

// 6.2) Method returning closure
println "\n6.2) Method returning closure:"
def makeMultiplier(int factor) {
    { int x -> x * factor }
}
def times3 = makeMultiplier(3)
def times5 = makeMultiplier(5)
println "times3(4) = ${times3(4)}"
println "times5(4) = ${times5(4)}"

// 6.3) Closure with parameters
println "\n6.3) Closure with parameters:"
def mapWithTransform(List items, Closure transformer) {
    items.collect { item -> transformer(item) }
}
def numbers = [1, 2, 3, 4]
def squared = mapWithTransform(numbers) { n -> n * n }
println "Original: ${numbers}"
println "Squared: ${squared}"

// 6.4) Method chaining with closures
println "\n6.4) Method chaining (fluent API):"
def builder = new StringBuilder()
def fluent(StringBuilder sb) {
    sb.append("Hello")
    sb
}
def result_str = fluent(builder).append(" ").append("World")
println result_str.toString()

// 6.5) Currying (partial application)
println "\n6.5) Currying (partial application):"
def power = { base, exp -> Math.pow(base, exp) }
def square = power.curry(2)  // fix first param
println "2^3 = ${power(2, 3).toInteger()}"
println "square(5) = ${square(5).toInteger()}"

// ============================================================
// PART 7: RECURSIVE METHODS
// ============================================================
println "\n\n--- PART 7: RECURSIVE METHODS ---\n"

// 7.1) Simple recursion
println "7.1) Simple recursion (factorial):"
def factorial(int n) {
    if (n <= 1) return 1
    n * factorial(n - 1)
}
println "factorial(5) = ${factorial(5)}"

// 7.2) Tail recursion
println "\n7.2) Tail recursion (fibonacci):"
def fib(int n, int a = 0, int b = 1) {
    if (n == 0) return a
    fib(n - 1, b, a + b)
}
println "fib(10) = ${fib(10)}"

// 7.3) Recursion with accumulator
println "\n7.3) Recursion with accumulator (sum list):"
def sumList(List items, int idx = 0, int acc = 0) {
    if (idx >= items.size()) return acc
    sumList(items, idx + 1, acc + items[idx])
}
println "sum([1, 2, 3, 4, 5]) = ${sumList([1, 2, 3, 4, 5])}"

// ============================================================
// PART 8: SPECIAL METHODS
// ============================================================
println "\n\n--- PART 8: SPECIAL METHODS ---\n"

// 8.1) Static methods
println "8.1) Static methods:"
class MathUtils {
    static int absolute(int n) {
        n < 0 ? -n : n
    }
}
println "MathUtils.absolute(-15) = ${MathUtils.absolute(-15)}"

// 8.2) Constructor
println "\n8.2) Constructor:"
class Person {
    String name
    int age
    Person(String n, int a) {
        name = n
        age = a
    }
    String introduce() {
        "${name} is ${age} years old"
    }
}
def person = new Person("Grace", 28)
println person.introduce()

// 8.3) Getters and setters
println "\n8.3) Getters and setters:"
class Account {
    private int balance = 0
    void deposit(int amount) {
        if (amount > 0) balance += amount
    }
    int getBalance() {
        balance
    }
}
def account = new Account()
account.deposit(100)
println "Balance: ${account.balance}"

// 8.4) toString() override
println "\n8.4) toString() override:"
class Book {
    String title
    String author
    Book(String t, String a) { title = t; author = a }
    @Override
    String toString() {
        "'${title}' by ${author}"
    }
}
def book = new Book("Groovy Guide", "Hank")
println book.toString()
println book

// 8.5) equals() and hashCode()
println "\n8.5) equals() and hashCode():"
class Item {
    String id
    String name
    Item(String i, String n) { id = i; name = n }
    boolean equals(Object other) {
        other instanceof Item && id == other.id
    }
    int hashCode() {
        id.hashCode()
    }
}
def item1 = new Item("1", "Widget")
def item2 = new Item("1", "Widget")
println "item1.equals(item2): ${item1.equals(item2)}"

// ============================================================
// PART 9: METHOD VISIBILITY & MODIFIERS
// ============================================================
println "\n\n--- PART 9: METHOD VISIBILITY & MODIFIERS ---\n"

println "9.1) Method modifiers:"
class Visibility {
    public String publicMethod() { "public" }
    protected String protectedMethod() { "protected" }
    private String privateMethod() { "private" }
    String packagePrivate() { "package-private (default)" }
    static String staticMethod() { "static" }
    final String finalMethod() { "final (cannot override)" }
}
def vis = new Visibility()
println "Public: ${vis.publicMethod()}"
println "Static: ${Visibility.staticMethod()}"

// ============================================================
// PART 10: REAL-WORLD PATTERNS
// ============================================================
println "\n\n--- PART 10: REAL-WORLD PATTERNS ---\n"

// 10.1) Builder pattern
println "10.1) Builder pattern:"
class UserBuilder {
    private String name
    private String email
    private int age
    UserBuilder withName(String n) { name = n; this }
    UserBuilder withEmail(String e) { email = e; this }
    UserBuilder withAge(int a) { age = a; this }
    String build() {
        "User(name=${name}, email=${email}, age=${age})"
    }
}
def builtUser = new UserBuilder()
    .withName("Iris")
    .withEmail("iris@example.com")
    .withAge(30)
    .build()
println builtUser

// 10.2) Decorator pattern (wrapping functionality)
println "\n10.2) Decorator pattern (method wrapping):"
def logExecutionTime(String label, Closure block) {
    def start = System.currentTimeMillis()
    def result = block.call()
    def duration = System.currentTimeMillis() - start
    println "${label} took ${duration}ms"
    result
}
def expensiveOperation = {
    Thread.sleep(10)
    "Done"
}
logExecutionTime("Heavy task") { expensiveOperation() }

// 10.3) Strategy pattern
println "\n10.3) Strategy pattern (pass behavior as closure):"
def processData(List data, Closure strategy) {
    strategy(data)
}
def sum_strategy = { list -> list.inject(0) { acc, n -> acc + n } }
def product_strategy = { list -> list.inject(1) { acc, n -> acc * n } }
def nums = [1, 2, 3, 4]
println "Sum: ${processData(nums, sum_strategy)}"
println "Product: ${processData(nums, product_strategy)}"

// 10.4) Memoization (caching results)
println "\n10.4) Memoization (caching):"
def memoFib
memoFib = { int n ->
    if (n <= 1) return n
    memoFib(n - 1) + memoFib(n - 2)
}.memoize()
println "fib(20) = ${memoFib(20)}"

// 10.5) Method as first-class object
println "\n10.5) Methods as first-class objects:"
def operation(int a, int b, Closure op) {
    op(a, b)
}
println "Add: ${operation(10, 5) { x, y -> x + y }}"
println "Multiply: ${operation(10, 5) { x, y -> x * y }}"

// 10.6) Validation with method
println "\n10.6) Validation with method:"
def validate(String email, Closure validator) {
    validator(email) ? "Valid" : "Invalid"
}
def emailValidator = { e -> e ==~ /\w+@\w+\.\w+/ }
println validate("test@example.com", emailValidator)
println validate("invalid-email", emailValidator)

// 10.7) Factory method
println "\n10.7) Factory method:"
class Shape {
    static Shape create(String type) {
        switch(type) {
            case "circle": return new Circle()
            case "square": return new Square()
            default: return null
        }
    }
    String describe() { "Shape" }
}
class Circle extends Shape { String describe() { "Circle" } }
class Square extends Shape { String describe() { "Square" } }
println Shape.create("circle").describe()
println Shape.create("square").describe()

// ============================================================
// PART 11: BEST PRACTICES
// ============================================================
println "\n\n--- PART 11: BEST PRACTICES ---\n"

println "11.1) Use descriptive method names:"
println "  Good: getUserByEmail(email)"
println "  Avoid: getUser(email)"

println "\n11.2) Single responsibility principle:"
println "  Good: calculateTotal() + applyDiscount() separately"
println "  Avoid: one method doing everything"

println "\n11.3) Prefer immutability in parameters:"
println "  Good: def process(final List items)"
println "  Avoid: modifying input parameters"

println "\n11.4) Use default parameters wisely:"
println "  Good: def search(String query, int limit = 10)"
println "  Avoid: unnecessary complexity"

println "\n11.5) Document with clear names and Javadoc:"
println "  Good: /** Calculate area of circle with radius r */"
println "  Avoid: ambiguous method behavior"

println "\n11.6) Keep methods small and focused:"
println "  Ideal: 5-15 lines of code per method"
println "  Avoid: methods with 100+ lines"

println "\n11.7) Use closures for callbacks and DSLs:"
println "  Good: config { timeout = 30 }"
println "  Avoid: complex builder classes"

println "\n=== METHODS TUTORIAL COMPLETE ===\n"
println "Key Takeaways:"
println "1. Method basics: definition, parameters, return types"
println "2. Parameters: default, named, varargs, closures"
println "3. Return values: implicit, explicit, multiple (list/map)"
println "4. Overloading: same name, different signatures"
println "5. Closures: higher-order functions, partial application"
println "6. Recursion: simple, tail, accumulator patterns"
println "7. Special: static, constructors, getters, setters, toString"
println "8. Visibility: public, protected, private, package-private"
println "9. Patterns: builder, decorator, strategy, factory, memoization"
println "10. Best practices: naming, SRP, immutability, documentation"
