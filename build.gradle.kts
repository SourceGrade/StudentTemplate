plugins {
  java
}

val assignmentId: String by extra("_assignment_id_")
val firstName: String by extra("_not_set_")
val lastName: String by extra("_not_set_")

java {
  withSourcesJar()
}

tasks {
  named<Jar>("sourcesJar") {
    expand(project.properties)
  }
}
