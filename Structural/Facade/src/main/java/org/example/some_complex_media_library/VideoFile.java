package org.example.some_complex_media_library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name, String codecType){
        this.name = name;
        this.codecType = codecType;
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
