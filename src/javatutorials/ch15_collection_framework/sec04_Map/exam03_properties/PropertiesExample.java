package javatutorials.ch15_collection_framework.sec04_Map.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        String path = PropertiesExample.class.getResource("database.properties").getPath();

        path = URLDecoder.decode(path,"utf-8");

        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username= properties.getProperty("username");
        String password = properties.getProperty("password");


        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
}
