# kotlinjs-multi-module

Multi module project for Kotlin/JS. Kotlin/JS plugin or frontend plugin don't provide lib module to app while it bundling via webpack. So webpack bundling failed.

`./gradlew clean :app:bundle`

# Workaround

There is WA for this situation. Use Kotlin DCE plugin.
In these case kotlin fronten plugin provides all dependencies (w/o transitive dependencies if dependency type is _implementation_, w/ transitive dependencies if dependency type is _api_)

# Kotlin/JS 1.3.40 EAP

`./gradlew :app:browserWebpack`
