package io.github.longanstudio.gradle;


import org.gradle.api.Project;


// Mirrorstation


public class Mirrorstation {

    // urls
    private String MC_JSON_URL = "https://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/{MC_VERSION}.json";
    private String MC_JAR_URL = "https://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/{MC_VERSION}.jar";
    private String MC_SERVER_URL = "https://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/minecraft_server.{MC_VERSION}.jar";
    private String MCP_URL = "https://files.minecraftforge.net/fernflower-fix-1.0.zip";
    private String ASSETS_URL = "https://resources.download.minecraft.net";
    private String LIBRARY_URL = "https://libraries.minecraft.net/";
    private String ASSETS_INDEX_URL = "https://s3.amazonaws.com/Minecraft.Download/indexes/{ASSET_INDEX}.json";


    // maven
    private String LONGAN_MAVEN_URL  = "https://longan.beanflame.cn/maven";
    private String ALIYUN_MAVEN_URL  = "https://maven.aliyun.com/repository/public";
    private String MAVEN_MAVEN_URL  = "https://repo1.maven.org/maven2";
    private String FORGE_MAVEN_URL = "https://maven.minecraftforge.net";


    // ---------------------------------------------------------------------------------------------------------------


    public Mirrorstation() { }
    public Mirrorstation(Project project) { System.out.println("project = " + project); }
    public static Mirrorstation getInstance(Project project) {
        return project.getExtensions().create("mirrorstation", Mirrorstation.class);
    }

    // MC_JSON_URL  ok
    public String getMcJsonUrl() { return MC_JSON_URL; }
    public void setMcJsonUrl(String mcJsonUrl) { this.MC_JSON_URL = mcJsonUrl; }

    // MC_JAR_URL   ok
    public String getMcJarUrl() { return MC_JAR_URL; }
    public void setMcJarUrl(String mcJarUrl) { this.MC_JAR_URL = mcJarUrl; }

    // MC_SERVER_URL    ok
    public String getMcServerUrl() { return MC_SERVER_URL; }
    public void setMcServerUrl(String mcServerUrl) { this.MC_SERVER_URL = mcServerUrl; }

    // MCP_URL  ok
    public String getMcpUrl() { return MCP_URL; }
    public void setMcpUrl(String mcpUrl) { this.MCP_URL = mcpUrl; }

    // ASSETS_URL   ok
    public String getAssetsUrl() { return ASSETS_URL; }
    public void setAssetsUrl(String assetsUrl) { this.ASSETS_URL = assetsUrl; }

    // LIBRARY_URL  ok
    public String getLibraryUrl() { return LIBRARY_URL; }
    public void setLibraryUrl(String libraryUrl) { this.LIBRARY_URL = libraryUrl; }

    // ASSETS_INDEX_URL ok
    public String getAssetsIndexUrl() { return ASSETS_INDEX_URL; }
    public void setAssetsIndexUrl(String assetsIndexUrl) { this.ASSETS_INDEX_URL = assetsIndexUrl; }


    // -----------------------------------------------------------------------------------------------

    // LONGAN_MAVEN_URL ok
    public String getLonganMavenUrl() { return LONGAN_MAVEN_URL; }
    public void setLonganMavenUrl(String longanMavenUrl) { this.LONGAN_MAVEN_URL = longanMavenUrl; }

    // ALIYUN_MAVEN_URL ok
    public String getAliyunMavenUrl() { return ALIYUN_MAVEN_URL; }
    public void setAliyunMavenUrl(String aliyunMavenUrl) { this.ALIYUN_MAVEN_URL = aliyunMavenUrl; }

    // MAVEN_MAVEN_URL  ok
    public String getMavenMavenUrl() { return MAVEN_MAVEN_URL; }
    public void setMavenMavenUrl(String mavenMavenUrl) { this.MAVEN_MAVEN_URL = mavenMavenUrl; }

    // FORGE_MAVEN_URL  ok
    public String getForgeMavenUrl() { return FORGE_MAVEN_URL; }
    public void setForgeMavenUrl(String forgeMavenUrl) { this.FORGE_MAVEN_URL = forgeMavenUrl; }


}
