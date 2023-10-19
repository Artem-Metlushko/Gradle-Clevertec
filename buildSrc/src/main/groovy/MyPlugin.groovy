import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('copyUtilByHelpPlugin', type: Copy) {
            dependsOn(":util:build")
            from("util/build/libs/util-1.3.5.jar")
            into("build/libs")
        }
        project.task('copyCoreByHelpPlugin',type:Copy){
            dependsOn(":multi:core:build")
            from("multi/core/build/libs/core.jar")
            into("build/libs")
        }
        project.task('copyApiByHelpPlugin',type:Copy){
            dependsOn(":multi:api:build")
            from("multi/api/build/libs/api.jar")
            into("build/libs")
        }

    }
}

