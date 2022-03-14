package com.github.daliuchen.quickdatabase.services

import com.intellij.openapi.project.Project
import com.github.daliuchen.quickdatabase.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
