package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSScene {

	com.acuity.rs.api.RSSceneElement[] getElements();

	com.acuity.rs.api.RSSceneElement[] getInteractableObjects();

	com.acuity.rs.api.RSSceneTile[][][] getTiles();

	com.acuity.api.rs.wrappers.peers.scene.Scene getWrapper();

	void setElements(com.acuity.rs.api.RSSceneElement[] var0);

	void setInteractableObjects(com.acuity.rs.api.RSSceneElement[] var0);

	void setTiles(com.acuity.rs.api.RSSceneTile[][][] var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.scene.Scene var0);
}
