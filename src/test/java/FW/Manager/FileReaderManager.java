package FW.Manager;

import FW.DataProvider.ConfigFileReader;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    private FileReaderManager(){

    }

    public ConfigFileReader getConfigFileReader(){
        return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
    }

}
