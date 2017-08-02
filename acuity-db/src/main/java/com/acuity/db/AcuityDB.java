package com.acuity.db;

import com.arangodb.ArangoDB;
import com.arangodb.entity.BaseDocument;

import java.io.InputStream;

/**
 * Created by Zachary Herridge on 8/1/2017.
 */
public class AcuityDB {

    private static ArangoDB db = null;

    public static void init(){
        InputStream in = AcuityDB.class.getClassLoader().getResourceAsStream("db.properties");
        db = new ArangoDB.Builder()
                .maxConnections(8)
                .loadProperties(in)
                .build();
    }

    public static ArangoDB getDB(){
        return db;
    }


    public static void main(String[] args) {
        InputStream in = AcuityDB.class.getClassLoader().getResourceAsStream("db.properties");
        ArangoDB arangoDB = new ArangoDB.Builder()
                .maxConnections(8)
                .loadProperties(in)
                .build();



        BaseDocument document = arangoDB.db("TileData").collection("AcuityUsers").getDocument("433", BaseDocument.class);



        System.out.println(document);

    }
}