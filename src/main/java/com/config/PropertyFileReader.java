package com.config;

import org.aeonbits.owner.Config;


    @Config.LoadPolicy(Config.LoadType.MERGE)
    @Config.Sources({"file:${user.dir}/src/main/resources/config.properties",
            "file:${user.dir}/src/test/resources/testData.properties"})


    public interface PropertyFileReader extends Config {

        String chromedriverpath();

        String browser();

        String url();

        String username();

        String password();




    }



