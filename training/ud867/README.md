# gradleTraining ud867

- [Udacity gradle course](https://classroom.udacity.com/courses/ud867)
- https://docs.gradle.org/current/userguide/building_java_projects.html
- https://docs.gradle.org/current/userguide/java_plugin.html

### Useful commands

```
gradle(w) tasks - show all tasks
gradle(w) run -m - "dry run" show all tasks to do without actual run 
gradle(w) run -q - only output 
gradle(w) tasks --all - all tasks
gradle -PpropName="Hello from the command line" taskName - pass property via command line
gradle --stacktrace (== -s) - short stacktrace
gradle --full-stacktrace (== -S) - full stacktrace
gradle --refresh-dependencies printDependencies - refresh dependencies from repository
gradle dependencies - project dependencies
gradle dependencies --configuration runtimeOnly - project dependencies with specified configuration
gradle dependencyInsight --dependency commons-logging - certain dependency insight (mb conflicts) 
```

### Notes

```
task someTask {
  println("hello, I'm always run, whatever the task you choose to execute")
  // here's the code that should be executed if the user chooses to execute this task
  doLast { 
    println("hello, I'm the code that is only executed if the user chooses to execute this task")
  }
}
```
