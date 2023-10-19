#### `./gradlew build`
After using this command, the assemblies are created utils-1.3.5.jar , api.jar and core.jar . utils-1.3.5.jar
and also publishes in the local repository `multi/core/build/Dinlibs/util-1.3.5.jar` - and we can use
utils-1.3.5.jar in the core of the module.
#### MyPlugin
MyPlugin consists of class tasks that copy utils-1.3.5.jar , api.jar and core.jar . utils-1.3.5.jar 
in the local repository `build/libs`.