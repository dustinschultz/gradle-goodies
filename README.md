# About
Various examples of using Gradle

# Tips

## Documentation / User Guide
You can go to https://docs.gradle.org/ of course but I prefer a single all-in-one guide:
* [Single PDF user guide](https://docs.gradle.org/current/userguide/userguide.pdf)

## Installing
Most of the time you can use the `gradlew` or `gradlew.bat` script and no installation is necessary.

If you would like to install it, using [Homebrew](https://brew.sh/) or [Chocolatey](https://chocolatey.org/) is the easiest

### Homebrew
```
brew install gradle
```

### Chocolatey
```
choco install gradle
```

## Generating Gradle Projects

### Generate a Kotlin Gradle Project
```
gradle init --dsl kotlin
```

### Generate a Groovy Gradle Project
```
gradle init --dsl groovy
```

### Gradle Wrapper
```
gradle wrapper
```
