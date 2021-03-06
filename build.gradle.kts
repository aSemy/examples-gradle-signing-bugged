import buildsrc.config.excludeGeneratedGradleDsl

plugins {
  base
  idea
  id("me.qoomon.git-versioning")
  id("org.jetbrains.kotlinx.kover")
}


project.group = "example.gradle"
project.version = "0.1.4"
//gitVersioning.apply {
//  refs {
//    considerTagsOnBranches = true
//    branch(".+") { version = "\${ref}-SNAPSHOT" }
//    tag("v(?<version>.*)") { version = "\${ref.version}" }
//  }
//
//  // optional fallback configuration in case of no matching ref configuration
//  rev { version = "\${commit}" }
//}


tasks.wrapper {
  gradleVersion = "7.4.2"
  distributionType = Wrapper.DistributionType.ALL
}

idea {
  module {
    isDownloadSources = true
    isDownloadJavadoc = true
    excludeGeneratedGradleDsl(layout)
    excludeDirs = excludeDirs + layout.files(
      ".idea",
      "gradle/kotlin-js-store",
      "gradle/wrapper",
    )
  }
}
