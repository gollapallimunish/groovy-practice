/**
 * loops_comprehensive.groovy
 *
 * Comprehensive tutorial on Groovy loops from beginner to pro level.
 * Covers traditional loops, closures, functional methods, and patterns.
 * Run with:
 *    groovy loops_comprehensive.groovy
 */

println "=== GROOVY LOOPS COMPREHENSIVE TUTORIAL ===\n"

// ============================================================
// PART 1: TRADITIONAL LOOPS
// ============================================================
println "--- PART 1: TRADITIONAL LOOPS ---\n"

// 1.1) for loop with range
println "1.1) for loop with range:"
print "Count 1 to 5: "
for (i in 1..5) {
    print "${i} "
}
println ""

// 1.2) for loop with list
println "\n1.2) for loop with list:"
def colors = ["Red", "Green", "Blue"]
for (color in colors) {
    println "Color: ${color}"
}

// 1.3) for loop with map
println "\n1.3) for loop with map:"
def person = [name: "Alice", age: 30, city: "NYC"]
for (key in person.keySet()) {
    println "${key}: ${person[key]}"
}

// 1.4) for loop C-style (traditional)
println "\n1.4) for loop (C-style with index):"
for (int i = 0; i < colors.size(); i++) {
    println "${i}: ${colors[i]}"
}

// 1.5) while loop
println "\n1.5) while loop:"
def counter = 1
while (counter <= 3) {
    println "Counter: ${counter}"
    counter++
}

// 1.6) do-while loop (executes at least once)
println "\n1.6) do-while loop (executes at least once):"
def num = 1
do {
    println "Do-while: ${num}"
    num++
} while (num <= 2)

// 1.7) Infinite loop with break (controlled)
println "\n1.7) Infinite loop with break (controlled):"
def count = 0
while (true) {
    if (count >= 2) break
    println "Loop ${count}"
    count++
}

// ============================================================
// PART 2: LOOP CONTROL STATEMENTS
// ============================================================
println "\n\n--- PART 2: LOOP CONTROL STATEMENTS ---\n"

// 2.1) break statement
println "2.1) break statement (exit loop):"
for (i in 1..10) {
    if (i == 5) {
        println "Breaking at ${i}"
        break
    }
    println "i=${i}"
}

// 2.2) continue statement
println "\n2.2) continue statement (skip iteration):"
for (i in 1..5) {
    if (i == 3) {
        continue
    }
    println "i=${i}"
}

// 2.3) labeled break
println "\n2.3) labeled break (exit nested loop):"
outer: for (row in 1..3) {
    for (col in 1..3) {
        if (row == 2 && col == 2) {
            println "Breaking at row=${row}, col=${col}"
            break outer
        }
        print "[${row},${col}] "
    }
    println ""
}

// 2.4) labeled continue
println "\n2.4) labeled continue (skip to next outer iteration):"
outer: for (row in 1..3) {
    for (col in 1..3) {
        if (col == 2) {
            continue outer
        }
        print "${row}${col} "
    }
}
println ""

// 2.5) Nested loops
println "\n2.5) Nested loops (multiplication table):"
for (row in 1..3) {
    for (col in 1..3) {
        print "${row * col} "
    }
    println ""
}

// ============================================================
// PART 3: GROOVY CLOSURE-BASED LOOPS
// ============================================================
println "\n\n--- PART 3: GROOVY CLOSURE-BASED LOOPS ---\n"

// 3.1) each() - iterate over list
println "3.1) each() on list:"
colors.each { color ->
    println "Color: ${color}"
}

// 3.2) each() on range
println "\n3.2) each() on range:"
(1..3).each { iter ->
    print "${iter} "
}
println ""

// 3.3) eachWithIndex() - iterate with index
println "\n3.3) eachWithIndex() - with index:"
colors.eachWithIndex { color, idx ->
    println "${idx}: ${color}"
}

// 3.4) forEach() - alternative syntax
println "\n3.4) forEach() - alternative syntax:"
colors.forEach { color ->
    println "Item: ${color}"
}

// 3.5) times() - repeat N times
println "\n3.5) times() - repeat N times:"
3.times { idx ->
    println "Iteration ${idx}"
}

// 3.6) upto() - count from A to B
println "\n3.6) upto() - count A to B:"
1.upto(4) { start ->
    print "${start} "
}
println ""

// 3.7) downto() - count down from A to B
println "\n3.7) downto() - count down:"
5.downto(2) { stepNum ->
    print "${stepNum} "
}
println ""

// 3.8) step() - count with step size
println "\n3.8) step() - count by step:"
0.step(10, 2) { val ->
    print "${val} "
}
println ""

// 3.9) each on map
println "\n3.9) each() on map:"
def scores = [Alice: 95, Bob: 87, Charlie: 92]
scores.each { name, score ->
    println "${name}: ${score}"
}

// 3.10) each with break (using try-catch or return)
println "\n3.10) Early exit from each() with return:"
try {
    colors.each { color ->
        println "Color: ${color}"
        if (color == "Green") return
    }
} catch (e) {}

// ============================================================
// PART 4: FUNCTIONAL/TRANSFORMATIONAL LOOPS
// ============================================================
println "\n\n--- PART 4: FUNCTIONAL/TRANSFORMATIONAL LOOPS ---\n"

// 4.1) collect() - transform and map
println "4.1) collect() - map/transform:"
def numbers = [1, 2, 3, 4]
def doubled = numbers.collect { n -> n * 2 }
println "Original: ${numbers}"
println "Doubled: ${doubled}"

// 4.2) findAll() - filter elements
println "\n4.2) findAll() - filter:"
def evens = numbers.findAll { n -> n % 2 == 0 }
println "Original: ${numbers}"
println "Evens: ${evens}"

// 4.3) find() - get first match
println "\n4.3) find() - first match:"
def firstEven = numbers.find { n -> n % 2 == 0 }
println "First even in ${numbers}: ${firstEven}"

// 4.4) any() - check if any matches
println "\n4.4) any() - at least one match:"
def hasEven = numbers.any { n -> n % 2 == 0 }
println "Has even in ${numbers}? ${hasEven}"

// 4.5) every() - check if all match
println "\n4.5) every() - all match:"
def allPositive = numbers.every { n -> n > 0 }
println "All positive in ${numbers}? ${allPositive}"

// 4.6) inject() / reduce() - aggregate
println "\n4.6) inject() - aggregate/fold:"
def sum = numbers.inject(0) { acc, n -> acc + n }
def product = numbers.inject(1) { acc, n -> acc * n }
println "Sum: ${sum}, Product: ${product}"

// 4.7) groupBy() - group elements
println "\n4.7) groupBy() - group elements:"
def grouped = numbers.groupBy { n -> n % 2 == 0 ? "even" : "odd" }
println "Numbers ${numbers} grouped: ${grouped}"

// 4.8) unique() - remove duplicates
println "\n4.8) unique() - remove duplicates:"
def withDups = [1, 2, 2, 3, 3, 3]
def unique = withDups.unique()
println "With dups: ${withDups}"
println "Unique: ${unique}"

// 4.9) sort() - sort elements
println "\n4.9) sort() - sort elements:"
def unsorted = [3, 1, 4, 1, 5, 9, 2]
def sorted = unsorted.sort()
println "Unsorted: ${unsorted}"
println "Sorted: ${sorted}"

// 4.10) reverse() - reverse order
println "\n4.10) reverse() - reverse order:"
def reversed = numbers.reverse()
println "Original: ${numbers}"
println "Reversed: ${reversed}"

// 4.11) take() - get first N elements
println "\n4.11) take() - first N elements:"
def first2 = numbers.take(2)
println "Numbers: ${numbers}, First 2: ${first2}"

// 4.12) drop() - skip first N elements
println "\n4.12) drop() - skip first N elements:"
def dropped = numbers.drop(2)
println "Numbers: ${numbers}, Drop 2: ${dropped}"

// 4.13) Chaining functional methods
println "\n4.13) Chaining functional methods:"
def result = numbers
    .findAll { n -> n > 1 }
    .collect { n -> n * 10 }
    .sort()
    .reverse()
println "Result chain: ${result}"

// ============================================================
// PART 5: LOOP PATTERNS & REAL-WORLD EXAMPLES
// ============================================================
println "\n\n--- PART 5: LOOP PATTERNS & REAL-WORLD EXAMPLES ---\n"

// 5.1) Loop with accumulator
println "5.1) Loop with accumulator (calculate average):"
def scores_list = [85, 90, 78, 92, 88]
def total_score = 0
scores_list.each { score ->
    total_score += score
}
def average = total_score / scores_list.size()
println "Scores: ${scores_list}, Average: ${average.round(2)}"

// 5.2) Nested loops with condition
println "\n5.2) Nested loops with condition (find pairs):"
def nums = [1, 2, 3, 4]
println "Pairs that sum to 5:"
for (i in nums) {
    for (j in nums) {
        if (i < j && i + j == 5) {
            println "${i} + ${j} = 5"
        }
    }
}

// 5.3) Process list of objects
println "\n5.3) Process list of objects:"
def people = [
    [name: "Alice", age: 25, active: true],
    [name: "Bob", age: 30, active: false],
    [name: "Charlie", age: 35, active: true]
]
def activeNames = people
    .findAll { p -> p.active }
    .collect { p -> p.name }
println "Active people: ${activeNames}"

// 5.4) String processing with loop
println "\n5.4) String processing with loop:"
def sentence = "Hello World Groovy"
def words = sentence.split(" ")
def uppercased = words.collect { w -> w.toUpperCase() }
println "Original: '${sentence}'"
println "Uppercase: '${uppercased.join(' ')}'"

// 5.5) Counting occurrences
println "\n5.5) Counting occurrences:"
def data = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
def counts = data.groupBy { it }.collectEntries { k, v -> [k, v.size()] }
println "Data: ${data}"
println "Counts: ${counts}"

// 5.6) Building a map from loop
println "\n5.6) Building a map from loop:"
def letters = ["A", "B", "C"]
def map_result = [:] // empty map
letters.eachWithIndex { letter, idx ->
    map_result[letter] = idx + 1
}
println "Letters to position: ${map_result}"

// 5.7) Loop with method call
println "\n5.7) Loop with method call:"
def greet = { name -> "Hello, ${name}!" }
def names = ["Alice", "Bob", "Charlie"]
names.each { name ->
    println greet(name)
}

// 5.8) Conditional loop (while with condition)
println "\n5.8) Conditional loop (find first matching element):"
def items = [10, 20, 30, 40, 50]
def target = 30
def found = false
def index = 0
while (index < items.size() && !found) {
    if (items[index] == target) {
        println "Found ${target} at index ${index}"
        found = true
    }
    index++
}

// 5.9) Loop range with step
println "\n5.9) Loop range with step:"
print "Even numbers 0-10: "
(0..10).step(2) { evenNum ->
    print "${evenNum} "
}
println ""

// 5.10) Double-ended loops (from both ends)
println "\n5.10) Process from both ends:"
def list = ["A", "B", "C", "D", "E"]
def first = 0
def last = list.size() - 1
while (first < last) {
    println "Pair: ${list[first]} - ${list[last]}"
    first++
    last--
}

// ============================================================
// PART 6: PERFORMANCE & BEST PRACTICES
// ============================================================
println "\n\n--- PART 6: BEST PRACTICES ---\n"

println "6.1) Closure vs traditional loop (readability):"
println "Closure style is more Groovy-idiomatic:"
println "  numbers.each { n -> println n }  // preferred"
println "  for (n in numbers) println n     // traditional"

println "\n6.2) Functional chains (expressiveness):"
println "More readable and declarative:"
def final_result = [1, 2, 3, 4, 5]
    .findAll { n -> n > 2 }
    .collect { n -> n * n }
println "Filtered and squared: ${final_result}"

println "\n6.3) When to use which loop:"
println "- for: known iterations, traditional background"
println "- while: unknown iterations, condition-based"
println "- each/forEach: iteration with side effects"
println "- collect/findAll: transformation/filtering"
println "- times/upto/downto: simple counting"
println "- inject: reduction/accumulation"

println "\n=== LOOPS TUTORIAL COMPLETE ===\n"
println "Key Takeaways:"
println "1. Traditional: for, while, do-while (control + break/continue)"
println "2. Closures: each, times, upto, downto, step (Groovy style)"
println "3. Functional: collect, findAll, find, any, every, inject (transformation)"
println "4. Patterns: accumulator, nested, conditional, chaining"
println "5. Best practice: use Groovy idiomatic methods for clarity"
