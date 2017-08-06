package com.acuity.db.services.impl;

import com.acuity.db.AcuityDB;
import com.acuity.db.domain.vertex.impl.botclient.BotClientConfig;
import com.acuity.db.services.DBCollectionService;
import com.arangodb.entity.DocumentCreateEntity;
import com.arangodb.model.DocumentCreateOptions;

import java.util.Optional;

/**
 * Created by Zach on 8/5/2017.
 */
public class BotClientConfigService extends DBCollectionService {

    private static final BotClientConfigService INSTANCE = new BotClientConfigService();

    public static BotClientConfigService getInstance() {
        return INSTANCE;
    }

    public BotClientConfigService() {
        super(AcuityDB.DB_NAME, "BotClientConfig");
    }

    public Optional<BotClientConfig> registerConfig(String acuityKey, String botClientKey){
        BotClientConfig botClientConfig = new BotClientConfig(acuityKey, botClientKey);
        DocumentCreateEntity<BotClientConfig> entity = getCollection().insertDocument(botClientConfig, new DocumentCreateOptions().returnNew(true));
        return Optional.ofNullable(entity.getNew());
    }


    public void removeConfig(String configKey) {
        getCollection().deleteDocument(configKey);
    }
}