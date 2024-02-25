/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import org.bson.Document;


/**
 *
 * @author USER
 */
public class MongoDB {
    private MongoClient mongoclient;
    private DB database;
    private DBCollection collection;

    public MongoDB(String dbName, String dbCollection) {
        mongoclient = new MongoClient();
        database = mongoclient.getDB(dbName);
        collection = database.getCollection(dbCollection);
    }
   
    public void insert(BasicDBObject documen){
        collection.insert(documen);
    }
    
    public java.util.List<BasicDBObject> leer() {
        DBCursor cursor = collection.find();
        java.util.List<BasicDBObject> barcos = new ArrayList<>();
        while (cursor.hasNext()) {
            barcos.add((BasicDBObject) cursor.next());
        }
        return barcos;
    }

        void insert(Document document) {
                collection.insert(new BasicDBObject(document));
        }
    
}
