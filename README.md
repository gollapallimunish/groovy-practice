# groovy practice

A tiny repository demonstrating a simple Groovy "Hello World" program.

Requirements
 - Groovy installed (https://groovy-lang.org/install.html) or the `groovy`/`groovyc` tools available.

Run the script (interpreted)

```powershell
groovy "C:\Users\golla\OneDrive\Desktop\groovy-practice\helloworld.groovy"
```

Compile and run with `groovyc` + `java`

```powershell
cd "C:\Users\golla\OneDrive\Desktop\groovy-practice"
groovyc helloworld.groovy
java -cp . com.test.demo.MyFirstGroovyProgram
```

Notes
 - If you prefer Gradle, I can add a `build.gradle` and Gradle wrapper so the project builds consistently.
 - The repository already includes a `.gitignore` to exclude IDE and build artifacts.

