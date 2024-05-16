pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Multi-ModuleProjectAndroid15"
include(":app")
include(":features:authentication")
include(":core:data")
include(":core:presentation")
include(":core:common")
include(":core:theme")
include(":core:database")
