package com.github.flaviokreis.codeandroidstudiotemplate.services

import com.github.flaviokreis.codeandroidstudiotemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
