package com.javadiscordproject.controllers;

import com.javadiscordproject.services.SceneManager;

abstract public class BaseController {
    protected SceneManager sceneManager;

    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }
}