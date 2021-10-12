package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

 public static String propFile(String propName) throws IOException {
  FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\PropertiesFile\\projectName.properties");
  Properties property = new Properties();
  property.load(fs);
  return property.getProperty(propName);

 }
}
