rootProject.name = "signing-bug"

apply(from = "./buildSrc/repositories.settings.gradle.kts")

include(
  ":modules:core",
  ":modules:versions-platform",
)

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
  @Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
  repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}
