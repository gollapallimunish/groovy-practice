/**
 * operators_conditionals_loops.groovy
 *
 * Comprehensive tutorial covering Groovy operators, conditional flow,
 * and loops from beginner to pro level. Run with:
 *    groovy operators_conditionals_loops.groovy
 */

println "=== GROOVY OPERATORS, CONDITIONALS & LOOPS TUTORIAL ===\n"

// ============================================================
// PART 1: OPERATORS
// ============================================================
println "--- PART 1: OPERATORS ---\n"

// 1.1) Arithmetic Operators: +, -, *, /, %, **
println "1.1) Arithmetic Operators:"
def a = 10
def b = 3
println "a=${a}, b=${b}"
println "a + b = ${a + b}"
println "a - b = ${a - b}"
println "a * b = ${a * b}"
println "a / b = ${a / b}"        // integer division
println "a % b = ${a % b}"        // modulo (remainder)
println "a ** b = ${a ** b}"      // power (exponentiation)

// 1.2) Assignment Operators: =, +=, -=, *=, /=, %=, **=
println "\n1.2) Assignment Operators:"
def x = 20
println "x = ${x}"
x += 5
println "x += 5 -> x = ${x}"
x -= 3
println "x -= 3 -> x = ${x}"
x *= 2
println "x *= 2 -> x = ${x}"
x /= 4
println "x /= 4 -> x = ${x}"

// 1.3) Comparison Operators: ==, !=, <, >, <=, >=
println "\n1.3) Comparison Operators:"
def p = 15
def q = 20
println "p=${p}, q=${q}"
println "p == q: ${p == q}"
println "p != q: ${p != q}"
println "p < q: ${p < q}"
println "p > q: ${p > q}"
println "p <= q: ${p <= q}"
println "p >= q: ${p >= q}"

// 1.4) Logical Operators: &&, ||, !
println "\n1.4) Logical Operators (AND, OR, NOT):"
def isRaining = true
def isCold = false
println "isRaining=${isRaining}, isCold=${isCold}"
println "isRaining && isCold: ${isRaining && isCold}"    // both true?
println "isRaining || isCold: ${isRaining || isCold}"    // either true?
println "!isRaining: ${!isRaining}"                      // NOT

// 1.5) Bitwise Operators: &, |, ^, ~, <<, >>
println "\n1.5) Bitwise Operators (for binary operations):"
def n1 = 5     // binary: 0101
def n2 = 3     // binary: 0011
println "n1=${n1} (binary: 0101), n2=${n2} (binary: 0011)"
println "n1 & n2 = ${n1 & n2}"         // AND: 0001 = 1
println "n1 | n2 = ${n1 | n2}"         // OR: 0111 = 7
println "n1 ^ n2 = ${n1 ^ n2}"         // XOR: 0110 = 6
println "~n1 = ${~n1}"                 // NOT (invert bits)
println "n1 << 1 = ${n1 << 1}"         // left shift: 1010 = 10
println "n1 >> 1 = ${n1 >> 1}"         // right shift: 0010 = 2

// 1.6) Ternary Operator: condition ? trueValue : falseValue
println "\n1.6) Ternary Operator (conditional inline):"
def age = 25
def status = age >= 18 ? "Adult" : "Minor"
println "age=${age}, status=${status}"

def score = 75
def grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : 'F'
println "score=${score}, grade=${grade}"

// 1.7) Elvis Operator: value ?: defaultValue (shorthand for ternary)
println "\n1.7) Elvis Operator (null coalescing):"
def user = null
def username = user ?: "Guest"
println "user=${user}, username=${username}"

def name = "Alice"
def greeting = name ?: "Unknown"
println "name=${name}, greeting=${greeting}"

// 1.8) Safe Navigation Operator: ?.
println "\n1.8) Safe Navigation Operator (?.):"
def nullString = null
def length = nullString?.length()
println "nullString=${nullString}, nullString?.length()=${length}"

def validString = "Groovy"
def validLength = validString?.length()
println "validString=${validString}, validString?.length()=${validLength}"

// 1.9) Spaceship Operator: <=> (comparison for sorting)
println "\n1.9) Spaceship Operator (<=> for comparison):"
println "5 <=> 3 = ${5 <=> 3}"     // 1 (5 is greater)
println "3 <=> 3 = ${3 <=> 3}"     // 0 (equal)
println "2 <=> 5 = ${2 <=> 5}"     // -1 (2 is less)

// 1.10) Range Operator: ..
println "\n1.10) Range Operator (..):"
def range = 1..5
println "range = 1..5: ${range}"

// 1.11) in Operator: check membership
println "\n1.11) Membership Operator (in):"
def nums = [1, 2, 3, 4, 5]
println "nums=${nums}"
println "3 in nums: ${3 in nums}"
println "10 in nums: ${10 in nums}"

// ============================================================
// PART 2: CONDITIONAL FLOW (if/else/switch)
// ============================================================
println "\n\n--- PART 2: CONDITIONAL FLOW ---\n"

// 2.1) Simple if statement
println "2.1) Simple if statement:"
def number = 42
if (number > 0) {
    println "${number} is positive"
}

// 2.2) if-else statement
println "\n2.2) if-else statement:"
def temp = 15
if (temp > 25) {
    println "It's warm"
} else {
    println "It's cool"
}

// 2.3) if-else-if-else chain
println "\n2.3) if-else-if-else chain:"
def mark = 85
if (mark >= 90) {
    println "Grade: A (Excellent)"
} else if (mark >= 80) {
    println "Grade: B (Good)"
} else if (mark >= 70) {
    println "Grade: C (Average)"
} else if (mark >= 60) {
    println "Grade: D (Below Average)"
} else {
    println "Grade: F (Fail)"
}

// 2.4) switch statement
println "\n2.4) switch statement:"
def day = "Friday"
switch (day) {
    case "Monday":
        println "Start of work week"
        break
    case "Wednesday":
        println "Midweek"
        break
    case "Friday":
        println "Almost weekend!"
        break
    case "Saturday":
    case "Sunday":
        println "Weekend"
        break
    default:
        println "Unknown day"
}

// 2.5) switch with range (Groovy feature)
println "\n2.5) switch with range:"
def score2 = 78
switch (score2) {
    case 90..100:
        println "Excellent: A"
        break
    case 80..89:
        println "Good: B"
        break
    case 70..79:
        println "Average: C"
        break
    default:
        println "Below average"
}

// 2.6) Nested conditionals
println "\n2.6) Nested conditionals:"
def isLoggedIn = true
def role = "admin"

if (isLoggedIn) {
    if (role == "admin") {
        println "Welcome admin! You have full access."
    } else if (role == "user") {
        println "Welcome user! You have limited access."
    } else {
        println "Unknown role"
    }
} else {
    println "Please log in first"
}

// ============================================================
// PART 3: LOOPS
// ============================================================
println "\n\n--- PART 3: LOOPS ---\n"

// 3.1) for loop with range
println "3.1) for loop with range:"
print "Counting 1 to 5: "
for (i in 1..5) {
    print "${i} "
}
println ""

// 3.2) for loop with list
println "\n3.2) for loop iterating over list:"
def fruits = ["Apple", "Banana", "Cherry"]
for (fruit in fruits) {
    println "I like ${fruit}"
}

// 3.3) for loop with index (traditional C-style)
println "\n3.3) for loop (C-style with index):"
for (int i = 0; i < 3; i++) {
    println "Iteration ${i}: ${fruits[i]}"
}

// 3.4) while loop
println "\n3.4) while loop:"
def count = 1
while (count <= 3) {
    println "Count: ${count}"
    count++
}

// 3.5) do-while loop (executes at least once)
println "\n3.5) do-while loop (executes at least once):"
def n = 1
do {
    println "Executing: ${n}"
    n++
} while (n <= 2)

// 3.6) forEach with closure (Groovy style)
println "\n3.6) forEach with closure (Groovy functional style):"
fruits.forEach { fruit ->
    println "Fruit: ${fruit}"
}

// 3.7) each() method (Groovy idiom)
println "\n3.7) each() method (preferred Groovy way):"
(1..3).each { num ->
    println "Number: ${num}"
}

// 3.8) each with index
println "\n3.8) each with index:"
fruits.eachWithIndex { fruit, idx ->
    println "${idx}: ${fruit}"
}

// 3.9) break statement
println "\n3.9) break statement (exit loop early):"
for (i in 1..10) {
    if (i == 5) {
        println "Breaking at ${i}"
        break
    }
    println "i = ${i}"
}

// 3.10) continue statement
println "\n3.10) continue statement (skip to next iteration):"
for (i in 1..5) {
    if (i == 3) {
        continue
    }
    println "i = ${i}"
}

// 3.11) Nested loops
println "\n3.11) Nested loops (multiplication table 3x3):"
for (row in 1..3) {
    for (col in 1..3) {
        print "${row * col} "
    }
    println ""
}

// 3.12) times() method (Groovy shorthand)
println "\n3.12) times() method (repeat N times):"
3.times { idx ->
    println "Iteration: ${idx}"
}

// 3.13) upto() method
println "\n3.13) upto() method (count from A to B):"
1.upto(4) { num ->
    println "upto: ${num}"
}

// 3.14) downto() method
println "\n3.14) downto() method (count from A down to B):"
5.downto(2) { num ->
    println "downto: ${num}"
}

// 3.15) step() method
println "\n3.15) step() method (count by step):"
0.step(10, 2) { num ->
    print "${num} "
}
println ""

// 3.16) collect() - transform each element (map in other languages)
println "\n3.16) collect() - transform elements:"
def listA = [1, 2, 3, 4]
def squared = listA.collect { val -> val * val }
println "Original: ${listA}"
println "Squared: ${squared}"

// 3.17) findAll() - filter elements
println "\n3.17) findAll() - filter elements:"
def filtered = listA.findAll { element -> element > 2 }
println "Original: ${listA}"
println "Greater than 2: ${filtered}"

// 3.18) any() - check if any element matches
println "\n3.18) any() - check if any element matches:"
def hasEven = listA.any { item -> item % 2 == 0 }
println "listA=${listA}, has even? ${hasEven}"

// 3.19) all() - check if all elements match
println "\n3.19) every() - check if all elements match:"
def allPositive = listA.every { elem -> elem > 0 }
println "listA=${listA}, all positive? ${allPositive}"

// 3.20) reduce() - aggregate values (fold)
println "\n3.20) inject() - aggregate values (fold):"
def sum = listA.inject(0) { total, num -> total + num }
println "listA=${listA}, sum=${sum}"

// ============================================================
// PART 4: REAL-WORLD EXAMPLES
// ============================================================
println "\n\n--- PART 4: REAL-WORLD EXAMPLES ---\n"

// 4.1) Validate user input
println "4.1) Validate user input (example):"
def password = "SecureP@ss123"
def hasUpper = password =~ /[A-Z]/
def hasDigit = password =~ /[0-9]/
def isValid = password.length() >= 8 && hasUpper && hasDigit
println "Password: ${password}"
println "Is valid (8+ chars, has uppercase, has digit)? ${isValid}"

// 4.2) Calculate discounted price
println "\n4.2) Calculate discounted price:"
def price = 100
def discount = 0.15  // 15%
def finalPrice = discount >= 0.1 ? price * (1 - discount) : price
println "Price: ${price}, Discount: ${(discount * 100).toInteger()}%, Final: ${finalPrice}"

// 4.3) Process data with loops and conditions
println "\n4.3) Process list of data:"
def products = [
    [name: "Laptop", price: 1200],
    [name: "Phone", price: 800],
    [name: "Tablet", price: 400]
]
def total = 0
products.each { product ->
    def tax = product.price > 500 ? product.price * 0.1 : product.price * 0.05
    def finalCost = product.price + tax
    println "${product.name}: \$${product.price} + tax \$${tax.toInteger()} = \$${finalCost.toInteger()}"
    total += finalCost
}
println "Total: \$${total.toInteger()}"

// 4.4) String processing loop
println "\n4.4) String processing:"
def text = "Hello Groovy World"
def wordCount = text.split(" ").size()
def charCount = text.length()
def vowelCount = text.toLowerCase().replaceAll(/[^aeiou]/, "").length()
println "Text: '${text}'"
println "Words: ${wordCount}, Chars: ${charCount}, Vowels: ${vowelCount}"

println "\n=== TUTORIAL COMPLETE ===\n"
println "Key Takeaways:"
println "1. Operators: arithmetic, logical, bitwise, ternary, elvis, safe-nav"
println "2. Conditionals: if/else, switch with ranges and fall-through"
println "3. Loops: for, while, do-while, closures (each, times, upto, etc.)"
println "4. Groovy powers: concise closures, functional methods (collect, findAll, reduce)"
println "5. Real-world: combine operators, conditionals, loops for data processing"
