package com.github.awsl69.plugintemplate.services

import com.github.awsl69.plugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
