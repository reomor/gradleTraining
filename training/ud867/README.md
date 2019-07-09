# gradleTraining ud867

[Udacity gradle course]( https://classroom.udacity.com/courses/ud867)

### Useful commands

```
gradle(w) tasks - show all tasks
gradle(w) run -m - "dry run" show all tasks to do without actual run 
gradle(w) run -q - only output 
gradle(w) tasks --all - all tasks
gradle -PpropName="Hello from the command line" taskName
gradle --stacktrace (== -s)
gradle --full-stacktrace (== -S)
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
