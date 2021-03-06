/*
 ***************************************
 * % ./gradlew task2
 ***************************************
 */

// best-practice: avoid imperative logic in scripts

tasks.register("task1") {
    // logic outside of "task action" (the closures) will always execute in the configuration phase; best not to add anything here
    println("configuring task:'task1'")

    doFirst {
        // task action logic
        println("task1:action:doFirst")
    }

    doLast {
        // task action logic
        println("task1:action:doLast")
    }
}

tasks.register("task2") {
    // task2 depends on task1
    dependsOn("task1")

    // logic outside of "task action" (the closures) will always execute in the configuration phase; best not to add anything here
    println("configuring task:'task2'")

    doFirst {
        // task action logic
        println("task2:action:doFirst")
    }

    doLast {
        // task action logic
        println("task2:action:doLast")
    }
}
