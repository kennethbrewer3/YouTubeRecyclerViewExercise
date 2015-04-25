package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(1, "com.mobileappscompany.training.youtuberecyclerviewexercise");
        Entity video = schema.addEntity("Video");
        video.addIdProperty();
        video.addStringProperty("category");
        video.addStringProperty("title");
        video.addStringProperty("description");
        video.addStringProperty("sqDefault");
        video.addStringProperty("hqDefault");
        video.addStringProperty("player");

        new DaoGenerator().generateAll(schema, "app/build/generated/java-gen");
    }
}
