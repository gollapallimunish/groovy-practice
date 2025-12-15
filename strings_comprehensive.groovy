/**
 * strings_comprehensive.groovy
 *
 * Comprehensive tutorial on Groovy strings from beginner to pro level.
 * Covers string creation, interpolation, manipulation, regex, and operations.
 * Run with:
 *    groovy strings_comprehensive.groovy
 */

println "=== GROOVY STRINGS COMPREHENSIVE TUTORIAL ===\n"

// ============================================================
// PART 1: STRING BASICS & CREATION
// ============================================================
println "--- PART 1: STRING BASICS & CREATION ---\n"

// 1.1) String literals
println "1.1) String literals:"
def str1 = 'Single quoted'      // plain string
def str2 = "Double quoted"      // allows interpolation
def str3 = """Multi-line
string with newlines
and special handling"""
println "Single: ${str1}"
println "Double: ${str2}"
println "Multi-line: ${str3}"

// 1.2) String interpolation (GString)
println "\n1.2) String interpolation (GString):"
def name = "Groovy"
def version = 4
def message = "Welcome to ${name} version ${version}!"
println message

// 1.3) Interpolation with expressions
println "\n1.3) Interpolation with expressions:"
def a = 5
def b = 3
println "Sum: ${a} + ${b} = ${a + b}"
println "Condition: ${a > b ? 'a is greater' : 'b is greater'}"

// 1.4) String concatenation
println "\n1.4) String concatenation:"
def str_a = "Hello"
def str_b = "World"
def combined = str_a + " " + str_b
println combined

// 1.5) String with special characters
println "\n1.5) Special characters:"
def escaped = "Tab:\t Value"
def newline = "Line1\nLine2"
def backslash = "Path: C:\\Users\\name"
println escaped
println newline
println backslash

// 1.6) Empty and null strings
println "\n1.6) Empty and null strings:"
def empty = ""
def nullStr = null
println "Empty string length: ${empty.length()}"
println "Empty == '': ${empty == ''}"
println "Null: ${nullStr}"
println "Null safe access: ${nullStr?.length()}"

// ============================================================
// PART 2: STRING PROPERTIES & METHODS
// ============================================================
println "\n\n--- PART 2: STRING PROPERTIES & METHODS ---\n"

def text = "Groovy Programming"

// 2.1) Length and size
println "2.1) Length and size:"
println "Text: '${text}'"
println "Length: ${text.length()}"
println "Size: ${text.size()}"

// 2.2) Accessing characters
println "\n2.2) Accessing characters:"
println "First char: ${text[0]}"
println "Last char: ${text[-1]}"
println "Range [0..5]: ${text[0..5]}"
println "Substring [7..17]: ${text[7..17]}"

// 2.3) Case conversion
println "\n2.3) Case conversion:"
println "Uppercase: ${text.toUpperCase()}"
println "Lowercase: ${text.toLowerCase()}"
println "Capitalize: ${text.capitalize()}"

// 2.4) Trimming whitespace
println "\n2.4) Trimming:"
def padded = "  Hello World  "
println "Original: '${padded}'"
println "Trimmed: '${padded.trim()}'"
println "Trim left: '${padded.stripLeading()}'"
println "Trim right: '${padded.stripTrailing()}'"

// 2.5) Checking content
println "\n2.5) Checking content:"
println "Starts with 'Groovy': ${text.startsWith('Groovy')}"
println "Ends with 'Programming': ${text.endsWith('Programming')}"
println "Contains 'Programming': ${text.contains('Programming')}"
println "Is empty: ${text.isEmpty()}"

// 2.6) Finding and indexing
println "\n2.6) Finding and indexing:"
def findText = "Hello World"
println "Text: '${findText}'"
println "Index of 'o': ${findText.indexOf('o')}"
println "Last index of 'o': ${findText.lastIndexOf('o')}"
println "Index of 'World': ${findText.indexOf('World')}"

// 2.7) Replace operations
println "\n2.7) Replace operations:"
def original = "The quick brown fox"
def replaced = original.replace("brown", "red")
def replaceFirst = original.replaceFirst("o", "O")
println "Original: '${original}'"
println "Replace 'brown' with 'red': '${replaced}'"
println "Replace first 'o' with 'O': '${replaceFirst}'"

// 2.8) Split operations
println "\n2.8) Split operations:"
def sentence = "Groovy is awesome"
def words = sentence.split(" ")
println "Sentence: '${sentence}'"
println "Split by space: ${words}"
println "Word count: ${words.size()}"

// 2.9) Joining
println "\n2.9) Joining:"
def wordList = ["Groovy", "is", "powerful"]
def joined = wordList.join(" ")
println "Words: ${wordList}"
println "Joined: '${joined}'"

// 2.10) Padding
println "\n2.10) Padding:"
def num = "42"
println "Pad left (10 chars): '${num.padLeft(10, '0')}'"
println "Pad right (10 chars): '${num.padRight(10, '*')}'"

// ============================================================
// PART 3: REGULAR EXPRESSIONS
// ============================================================
println "\n\n--- PART 3: REGULAR EXPRESSIONS ---\n"

// 3.1) Pattern matching (~)
println "3.1) Pattern matching (=~):"
def email = "user@example.com"
def emailPattern = ~/(\w+)@(\w+\.\w+)/
def match = email =~ emailPattern
println "Email: '${email}'"
println "Matches pattern: ${match ? 'yes' : 'no'}"

// 3.2) Check if matches (==~)
println "\n3.2) Exact match (==~):"
def isEmail = (email ==~ /\w+@\w+\.\w+/)
println "Is valid email: ${isEmail}"

// 3.3) Extract matches
println "\n3.3) Extract matches:"
def text1 = "abc123def456"
def numbers = text1 =~ /\d+/
println "Text: '${text1}'"
println "All numbers: ${numbers.collect()}"

// 3.4) Replace with regex
println "\n3.4) Replace with regex:"
def text2 = "Hello 123 World 456"
def noNumbers = text2.replaceAll(/\d+/, "X")
println "Original: '${text2}'"
println "No numbers: '${noNumbers}'"

// 3.5) Split with regex
println "\n3.5) Split with regex:"
def csv = "apple,banana;orange:grape"
def fruits = csv.split(/[,;:]/)
println "CSV: '${csv}'"
println "Split: ${fruits}"

// 3.6) Find all matches
println "\n3.6) Find all matches:"
def text3 = "The year 2024 and 2025 are coming"
def years = text3.findAll(/\d{4}/)
println "Text: '${text3}'"
println "Years: ${years}"

// 3.7) Regex with groups
println "\n3.7) Regex with groups (extract):"
def phoneText = "Call me at 555-123-4567"
def phone = phoneText =~ /(\d{3})-(\d{3})-(\d{4})/
if (phone) {
    println "Phone: ${phone[0]}"
    println "Groups: area=${phone[0][1]}, exchange=${phone[0][2]}"
}

// ============================================================
// PART 4: STRING MANIPULATION & TRANSFORMATION
// ============================================================
println "\n\n--- PART 4: STRING MANIPULATION & TRANSFORMATION ---\n"

// 4.1) Reverse string
println "4.1) Reverse:"
def str = "Groovy"
println "Original: '${str}'"
println "Reversed: '${str.reverse()}'"

// 4.2) Remove characters
println "\n4.2) Remove characters:"
def removeStr = "H3ll0 W0rld!"
def noDigits = removeStr.replaceAll(/\d/, "")
def noSpecial = removeStr.replaceAll(/[^a-zA-Z\s]/, "")
println "Original: '${removeStr}'"
println "No digits: '${noDigits}'"
println "No special: '${noSpecial}'"

// 4.3) Repeat string
println "\n4.3) Repeat string:"
def char_repeat = "ab" * 3
def line = "-" * 20
println "Repeat 'ab' 3 times: '${char_repeat}'"
println "Line: '${line}'"

// 4.4) Remove duplicates
println "\n4.4) Remove duplicate characters:"
def duplicate = "aabbccddee"
def uniqueChars = duplicate.split('').toList().unique().join()
println "Original: '${duplicate}'"
println "Unique chars: '${uniqueChars}'"

// 4.5) Case-insensitive comparison
println "\n4.5) Case-insensitive operations:"
def str1_cmp = "Groovy"
def str2_cmp = "GROOVY"
println "Equals (case-sensitive): ${str1_cmp == str2_cmp}"
println "Equals (case-insensitive): ${str1_cmp.equalsIgnoreCase(str2_cmp)}"

// 4.6) Sort characters
println "\n4.6) Sort characters:"
def unsorted_str = "groovy"
def sorted_str = unsorted_str.split('').sort().join()
println "Original: '${unsorted_str}'"
println "Sorted: '${sorted_str}'"

// 4.7) Character frequency
println "\n4.7) Character frequency:"
def freq_str = "mississippi"
def charFreq = freq_str.split('').groupBy { it }.collectEntries { k, v -> [k, v.size()] }
println "String: '${freq_str}'"
println "Frequency: ${charFreq}"

// 4.8) Convert to list
println "\n4.8) Convert to list:"
def convertStr = "Groovy"
def charList = convertStr.split('')
def codePoints = convertStr.collect { it as char }
println "String: '${convertStr}'"
println "As list: ${charList}"
println "As codes: ${codePoints}"

// 4.9) Format strings
println "\n4.9) String formatting (sprintf):"
def formatted = String.format("Name: %s, Age: %d, Score: %.2f", "Alice", 25, 95.678)
println formatted

// ============================================================
// PART 5: STRING OPERATIONS & COMPARISONS
// ============================================================
println "\n\n--- PART 5: STRING OPERATIONS & COMPARISONS ---\n"

// 5.1) Comparison operators
println "5.1) Comparison operators:"
println "'apple' < 'banana': ${'apple' < 'banana'}"
println "'zebra' > 'apple': ${'zebra' > 'apple'}"
println "'hello' == 'hello': ${'hello' == 'hello'}"
println "'test' != 'test': ${'test' != 'test'}"

// 5.2) Spaceship operator
println "\n5.2) Spaceship operator (<=>):"
println "'apple' <=> 'banana': ${'apple' <=> 'banana'}"
println "'banana' <=> 'banana': ${'banana' <=> 'banana'}"
println "'zebra' <=> 'apple': ${'zebra' <=> 'apple'}"

// 5.3) Check if substring exists (contains)
println "\n5.3) Substring checks:"
def source = "The quick brown fox"
println "Source: '${source}'"
println "Contains 'quick': ${source.contains('quick')}"
println "Contains 'slow': ${source.contains('slow')}"

// 5.4) String in list
println "\n5.4) Check string in collection:"
def languages = ["Groovy", "Java", "Python"]
println "Languages: ${languages}"
println "'Groovy' in languages: ${'Groovy' in languages}"
println "'Ruby' in languages: ${'Ruby' in languages}"

// 5.5) Count occurrences
println "\n5.5) Count occurrences:"
def countText = "aaabbbccccdddddd"
def count_a = countText.count('a')
def count_d = countText.count('d')
println "Text: '${countText}'"
println "Count of 'a': ${count_a}"
println "Count of 'd': ${count_d}"

// ============================================================
// PART 6: REAL-WORLD STRING EXAMPLES
// ============================================================
println "\n\n--- PART 6: REAL-WORLD EXAMPLES ---\n"

// 6.1) Validate email
println "6.1) Validate email:"
def email_test = "user.name+tag@example.co.uk"
def isValidEmail = (email_test ==~ /^[\w.\-+]+@[\w.\-]+\.\w+$/)
println "Email: '${email_test}'"
println "Valid: ${isValidEmail}"

// 6.2) Extract numbers from text
println "\n6.2) Extract numbers from text:"
def text_nums = 'Order #12345, Total: $99.99, Qty: 5'
def numbers_found = text_nums.findAll(/\d+/)
println "Text: '${text_nums}'"
println "Numbers: ${numbers_found}"

// 6.3) Parse and format URL
println "\n6.3) Parse domain from email:"
def email_parse = "john.doe@company.com"
def domain = email_parse.split("@")[1]
println "Email: '${email_parse}'"
println "Domain: '${domain}'"

// 6.4) Build query string
println "\n6.4) Build query string:"
def params = [name: "Alice", age: 30, city: "NYC"]
def queryString = params.collect { k, v -> "${k}=${v}" }.join("&")
println "Params: ${params}"
println "Query: '${queryString}'"

// 6.5) Clean and normalize
println "\n6.5) Clean and normalize text:"
def messy = "  Hello   WORLD  !!  "
def clean = messy.trim().replaceAll(/\s+/, " ").toLowerCase()
println "Messy: '${messy}'"
println "Clean: '${clean}'"

// 6.6) Convert CSV to list of maps
println "\n6.6) Parse CSV-like data:"
def csv_data = "name,age,city\nAlice,25,NYC\nBob,30,LA"
def csv_lines = csv_data.split("\n")
def headers = csv_lines[0].split(",")
def records = csv_lines[1..-1].collect { row ->
    def values = row.split(",")
    [headers, values].transpose().collectEntries { h, v -> [h, v] }
}
println "CSV headers: ${headers}"
println "First record: ${records[0]}"

// 6.7) Word count
println "\n6.7) Word count and statistics:"
def passage = "Groovy is great Groovy is fun"
def wordlist = passage.toLowerCase().split(/\s+/)
def wordCount = wordlist.groupBy { it }.collectEntries { k, v -> [k, v.size()] }
println "Passage: '${passage}'"
println "Unique words: ${wordCount}"

// 6.8) Pluralize word
println "\n6.8) Simple pluralization:"
def pluralize = { word, count ->
    count == 1 ? word : word + "s"
}
println "1 ${pluralize('apple', 1)}, 5 ${pluralize('apple', 5)}"
println "1 ${pluralize('box', 1)}, 3 ${pluralize('box', 3)}"

// 6.9) Mask sensitive data
println "\n6.9) Mask sensitive data:"
def creditCard = "1234-5678-9012-3456"
def masked = creditCard.replaceAll(/\d(?=\d{4})/, "*")
println "Original: '${creditCard}'"
println "Masked: '${masked}'"

// 6.10) Template string (simple)
println "\n6.10) Template-like substitution:"
def template = "Hello {name}, your age is {age}"
def user_data = [name: "Bob", age: 28]
def output = template.replaceAll(/\{(\w+)\}/) { matchObj ->
    user_data[matchObj[1]] ?: "?"
}
println "Template: '${template}'"
println "Output: '${output}'"

// ============================================================
// PART 7: BEST PRACTICES
// ============================================================
println "\n\n--- PART 7: BEST PRACTICES ---\n"

println "7.1) Use GString for interpolation (not concatenation):"
println "  Good: \"Sum is \${x + y}\""
println "  Avoid: \"Sum is \" + (x + y)"

println "\n7.2) Prefer string methods over manual loops:"
println "  Good: text.toUpperCase()"
println "  Avoid: text.split('').collect { it.toUpperCase() }.join()"

println "\n7.3) Use regex for pattern matching:"
println "  Good: text =~ /pattern/"
println "  Avoid: string comparisons for pattern validation"

println "\n7.4) Safe navigation for null strings:"
println "  Good: nullStr?.length()"
println "  Avoid: if (nullStr != null) nullStr.length()"

println "\n7.5) Use collect/findAll for transformations:"
println "  Good: strings.findAll { it.startsWith('A') }"
println "  Avoid: traditional loop with conditions"

println "\n=== STRINGS TUTORIAL COMPLETE ===\n"
println "Key Takeaways:"
println "1. String creation: single, double, multi-line quotes"
println "2. Interpolation: GString with string interpolation"
println "3. Methods: length, case, trim, split, replace, etc."
println "4. Regex: matching, replacing, extracting"
println "5. Transformations: reverse, padding, frequency, sorting"
println "6. Comparisons: ==, !=, <>, <=>, equals, contains"
println "7. Real-world: validation, parsing, cleaning, templating"
