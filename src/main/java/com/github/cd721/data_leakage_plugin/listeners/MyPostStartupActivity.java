package com.github.cd721.data_leakage_plugin.listeners;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
public class MyPostStartupActivity implements StartupActivity {
    private static final Logger logger = Logger.getInstance(MyApplicationActivationListener.class);

    @Override
    public void runActivity( @org.jetbrains.annotations.NotNull Project project){
    logger.warn("The Project was opened.");
    }
}