pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex(
                    "com\\.android.*"
                )
                includeGroupByRegex(
                    "com\\.google.*"
                )
                includeGroupByRegex(
                    "androidx.*"
                )
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(
        RepositoriesMode.FAIL_ON_PROJECT_REPOS
    )
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name =
    "lista_personalizada_noche"
include(
    ":app"
)
 